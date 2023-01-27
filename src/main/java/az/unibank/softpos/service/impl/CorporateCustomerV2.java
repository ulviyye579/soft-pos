package az.unibank.softpos.service.impl;

import az.unibank.softpos.dtoV2.requests.Company;
import az.unibank.softpos.dtoV2.responses.*;
import az.unibank.softpos.exceptionsV2.TransAxisException;
import az.unibank.softpos.methodsV2.Init;
import az.unibank.softpos.methodsV2.KeyGenerator;
import az.unibank.softpos.utils.ConstantsV2;
import az.unibank.softpos.utils.Util;
import az.unibank.softpos.dtoV2.requests.AccountChanges;
import az.unibank.softpos.dtoV2.requests.BranchV2;
import az.unibank.softpos.dtoV2.requests.POSV2;
import az.unibank.softpos.service.CustomerCreatorV2;
import com.tranzaxis.schemas.acquiring_admin.BranchId;
import com.tranzaxis.schemas.acquiring_admin.DesKey;
import com.tranzaxis.schemas.acquiring_admin.DesKeyWithKek;
import com.tranzaxis.schemas.acquiring_admin.Terminal;
import com.tranzaxis.schemas.common_types.ContactAddress;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.common_types.ObjectId;
import com.tranzaxis.schemas.contracts_admin.Account;
import com.tranzaxis.schemas.contracts_admin.Accounts;
import com.tranzaxis.schemas.contracts_admin.Contract;
import com.tranzaxis.schemas.subjects_admin.*;
import com.tranzaxis.schemas.tran.Request;
import com.tranzaxis.schemas.tran.Response;
import com.tranzaxis.schemas.tran.TranInvoke;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.util.Map;


@Slf4j
@RequiredArgsConstructor
@Service
public class CorporateCustomerV2 implements CustomerCreatorV2 {
    Init init = new Init();
    private final Util util;
    private Map<String, String> txParamsMap;
    SoftResponseV2 softResponseV2 = new SoftResponseV2();


    @Override
    public ResponseCustomerV2 createCustomer(Company company, String headerRequestorInitiatorRid) throws TransAxisException {
        try {
            this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
            ExtIdGeneratorV2 extIdGenerator = new ExtIdGeneratorV2(util);
            ResponseCustomerV2 responseCustomerV2 = new ResponseCustomerV2();
            String title = ConstantsV2.TITLE_MERCHANT + company.getCompanyName();
            SubjectBase.SubjectDocuments subjectDocuments = new Person.SubjectDocuments();
            Request request = new Request();
            request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
            request.setKind(ConstantsV2.TRAN_KIND_MODIFY_SUBJECT);
            request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
            Request.Specific specific = new Request.Specific();
            Request.Specific.Admin admin = new Request.Specific.Admin();
            Subject subject1 = new Subject();
            Corporation corp = new Corporation();
            corp.setTypeRid(ConstantsV2.TYPE_RID_CORPORATE);
            JAXBElement<SubjectBase.SubjectDocuments> documentsJAXBElement = new JAXBElement<>(ConstantsV2.NS_SUBJECTS_ADMIN_QNAME, SubjectBase.SubjectDocuments.class, subjectDocuments);
            Document document = new Document();
            document.setTypeRid(ConstantsV2.TYPE_RID_DOC);
            document.setRid(company.getInnRid());
            subjectDocuments.getDocument().add(document);
            corp.setSubjectDocuments(documentsJAXBElement);
            JAXBElement<String> jaxbElementTitle = new JAXBElement<>(ConstantsV2.NS_TITLE_QNAME, String.class, title);
            corp.setTitle(jaxbElementTitle);
            corp.setLatTitle(jaxbElementTitle);
            corp.setLegalTitle(jaxbElementTitle);
            corp.setShortTitle(jaxbElementTitle);
            com.tranzaxis.schemas.common_types.ContactAddress contactAddress = new com.tranzaxis.schemas.common_types.ContactAddress();
            contactAddress.setCountryId(ConstantsV2.COUNTRY_CODE);
            JAXBElement<ContactAddress> jaxbElementContactAddress = new JAXBElement<>(ConstantsV2.NS_ADDRESS_QNAME, com.tranzaxis.schemas.common_types.ContactAddress.class, contactAddress);
            corp.setAddress(jaxbElementContactAddress);
            subject1.setCorporation(corp);
            admin.setSubject(subject1);
            specific.setAdmin(admin);
            request.setSpecific(specific);
            String xmlBody = init.jaxbProcessor.marshallToXml(request);
            log.trace("xmlBody : " + xmlBody);
            Response response = init.callSOAP(xmlBody, txParamsMap.get(ConstantsV2.RTP_URL));
            if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
                Long customerId = response.getSpecific().getAdmin().getSubject().getCorporation().getId();
                String externalId = extIdGenerator.setExternalId(customerId, headerRequestorInitiatorRid);
                responseCustomerV2.setId(customerId.toString());
                responseCustomerV2.setCode(ConstantsV2.SUCCESS_CODE_000);
                responseCustomerV2.setDescription(ConstantsV2.OK_RESULT);
            } else {
                responseCustomerV2.setCode(ConstantsV2.DECLINED_CODE_001);
                responseCustomerV2.setDescription(response.getResult() + ", " + response.getDeclineReason());
            }
            return responseCustomerV2;
        } catch (Exception e) {
            throw new TransAxisException(e);
        }
    }

    @Override
    public BranchResponse createSubCustomer(BranchV2 branchV2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        ExtIdGeneratorV2 extIdGenerator = new ExtIdGeneratorV2(util);
        BranchResponse branchResponse = new BranchResponse();
        String title = ConstantsV2.TITLE_MERCHANT + branchV2.getCompanyName();
        Request request = new Request();
        request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
        request.setKind(ConstantsV2.TRAN_KIND_MODIFY_SUBJECT);
        request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        Subject subject = new Subject();
        Department department = new Department();
        department.setTypeId(3L);
        JAXBElement<Long> jaxbElementInstID = new JAXBElement<>(ConstantsV2.NS_INST_QNAME, Long.class, 1L);
        department.setInstId(jaxbElementInstID);
        JAXBElement<String> jaxbElementTitle = new JAXBElement<>(ConstantsV2.NS_TITLE_QNAME, String.class, title);
        department.setTitle(jaxbElementTitle);
        department.setLatTitle(jaxbElementTitle);
        department.setLegalTitle(jaxbElementTitle);
        department.setShortTitle(jaxbElementTitle);
        JAXBElement<Long> jaxbElementParentOrgId = new JAXBElement<>(ConstantsV2.NS_PARENT_QNAME, Long.class, Long.valueOf(branchV2.getCustomerId()));
        department.setParentOrgId(jaxbElementParentOrgId);
        subject.setDepartment(department);
        admin.setSubject(subject);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String requestBody = init.jaxbProcessor.marshallToXml(request);
        log.trace("request: " + request);
        Response response = init.callSOAP(requestBody, txParamsMap.get(ConstantsV2.RTP_URL));
        if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
            String departmentId = response.getSpecific().getAdmin().getSubject().getDepartment().getId().toString();
            String externalId = extIdGenerator.setExternalId(Long.valueOf(departmentId), headerRequestorInitiatorRid);
            if (!externalId.isEmpty()) {
                branchResponse.setSubCustomerId(departmentId);
                branchResponse.setExternalId(externalId);
                branchResponse.setResult(ConstantsV2.APPROVED_RESULT);
            }
            return branchResponse;
        } else {
            throw new TransAxisException(response.getResult() + ", " + response.getDeclineReason());
        }

    }

    @Override
    public SubCustomerV2 createSubObject(POSV2 POSV2, String headerRequestorInitiatorRid) throws Exception {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        SubCustomerV2 subCustomerV2 = new SubCustomerV2();
        String title = ConstantsV2.TITLE_MERCHANT + POSV2.getTerminalName();
        Request request = new Request();
        request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
        request.setKind(ConstantsV2.TRAN_KIND_MODIFY_SUBJECT);
        request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        Subject subject = new Subject();
        Department department = new Department();
        department.setTypeId(3L);
        JAXBElement<Long> jaxbElementInstID = new JAXBElement<>(ConstantsV2.NS_INST_QNAME, Long.class, 1L);
        department.setInstId(jaxbElementInstID);
        JAXBElement<String> jaxbElementTitle = new JAXBElement<>(ConstantsV2.NS_TITLE_QNAME, String.class, title);
        department.setTitle(jaxbElementTitle);
        department.setLatTitle(jaxbElementTitle);
        department.setLegalTitle(jaxbElementTitle);
        department.setShortTitle(jaxbElementTitle);
        JAXBElement<Long> jaxbElementParentOrgId = new JAXBElement<>(ConstantsV2.NS_PARENT_QNAME, Long.class, Long.valueOf(POSV2.getSubCustomerId()));
        department.setParentOrgId(jaxbElementParentOrgId);
        JAXBElement<Long> jaxbElementMccId = new JAXBElement<>(ConstantsV2.NS_MCC_QNAME, Long.class, Long.valueOf(POSV2.getMccCode()));
        department.setMccId(jaxbElementMccId);
        subject.setDepartment(department);
        admin.setSubject(subject);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String requestBody = init.jaxbProcessor.marshallToXml(request);
        log.trace("request: " + request);
        Response response = init.callSOAP(requestBody, txParamsMap.get(ConstantsV2.RTP_URL));
        if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
            String departmentId = response.getSpecific().getAdmin().getSubject().getDepartment().getId().toString();
            Response settlementContract = generateSettlementContractRequest(departmentId, POSV2, headerRequestorInitiatorRid);
            String settlementContractRid = settlementContract.getSpecific().getAdmin().getContract().getRid();
            String settlementContractId = String.valueOf(settlementContract.getSpecific().getAdmin().getContract().getId());
            Long contractId = generateRtpRequestForCommonContract(departmentId, settlementContractRid, headerRequestorInitiatorRid);
            subCustomerV2.setSettlementContractId(settlementContractId);
            subCustomerV2.setCommonContractId(contractId);
            subCustomerV2.setSubCustomerId(departmentId);
            return subCustomerV2;
        } else {
            throw new TransAxisException(response.getResult() + ", " + response.getDeclineReason());
        }

    }

    @Override
    public Response generateSettlementContractRequest(String departmentId, POSV2 POSV2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        Request request = new Request();
        request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
        request.setKind(ConstantsV2.TRAN_KIND_MODIFY_CONTRACT);
        request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        Contract contract = new Contract();
        JAXBElement<Long> jaxbElementBranchId = new JAXBElement<>(ConstantsV2.NS_BRANCH_QNAME, Long.class, ConstantsV2.BRANCH_ID);
        contract.setBranchId(jaxbElementBranchId);
        JAXBElement<Long> jaxbElementTypeId = new JAXBElement<>(ConstantsV2.NS_TYPE_QNAME, Long.class, ConstantsV2.TYPE_SETTLEMENT_CONTRACT);
        contract.setTypeId(jaxbElementTypeId);
        contract.setClientId(Long.valueOf(departmentId));
        contract.setStatus(ConstantsV2.ACTIVE_STATUS);

        Accounts accounts = new Accounts();
        Account account = new Account();
        account.setExtNumber(POSV2.getAccount());
        account.setCcy(ConstantsV2.CCY);
        account.setRole(ConstantsV2.ROLE_CONTRACT);
        account.setAcctRoleInContract(ConstantsV2.ROLE_CONTRACT);
        accounts.getAccount().add(account);
        contract.setAccounts(accounts);

        contract.setMainCcy(ConstantsV2.CCY);
        admin.setContract(contract);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String bodyXml = init.jaxbProcessor.marshallToXml(request);
        Response response = init.callSOAP(bodyXml, txParamsMap.get(ConstantsV2.RTP_URL));
        log.trace("request: " + bodyXml);
        return response;
    }

    @Override
    public Long generateRtpRequestForCommonContract(String departmentId, String contractRid, String headerRequestorInitiatorRid) throws Exception {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
        request.setKind(ConstantsV2.TRAN_KIND_MODIFY_CONTRACT);
        request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        Contract contract = new Contract();
        contract.setInstId(1L);

        JAXBElement<Long> jaxbElementBranchId = new JAXBElement<>(ConstantsV2.NS_BRANCH_QNAME, Long.class, ConstantsV2.BRANCH_ID);
        contract.setBranchId(jaxbElementBranchId);
        JAXBElement<Long> jaxbTypeId = new JAXBElement<>(ConstantsV2.NS_TYPE_QNAME, Long.class, ConstantsV2.TYPE_ID);
        contract.setTypeId(jaxbTypeId);
        contract.setClientId(Long.valueOf(departmentId));
        contract.setStatus("A");
        Contract.OutLinks outLinks = new Contract.OutLinks();
        Contract.OutLinks.Link link = new Contract.OutLinks.Link();
        link.setKind("Settlement");
        link.setContract2Rid(contractRid);
        link.setStatus("A");
        outLinks.getLink().add(link);
        contract.setOutLinks(outLinks);
        admin.setContract(contract);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String requestCont = init.jaxbProcessor.marshallToXml(request);
        Response commonResponse = init.callSOAP(requestCont, txParamsMap.get(ConstantsV2.RTP_URL));
        if (commonResponse.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
            return commonResponse.getSpecific().getAdmin().getContract().getId();
        }
        throw new TransAxisException(commonResponse.getResult() + ", " + commonResponse.getDeclineReason());
    }

    @Override
    public TerminalResponseV2 createTerminal(POSV2 POSV2, String headerRequestorInitiatorRid) throws Exception {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        KeyGenerator keyGenerator = new KeyGenerator(util);
        SubCustomerV2 subCustomerV2 = createSubObject(POSV2, headerRequestorInitiatorRid);
        Long contractId = subCustomerV2.getCommonContractId();
        String externalId = subCustomerV2.getSubCustomerId();
        String stlContractId = subCustomerV2.getSettlementContractId();
        String terminalName = POSV2.getTerminalName();
        ExtIdGeneratorV2 extIdGenerator = new ExtIdGeneratorV2(util);
        TerminalResponseV2 terminalResponseV2 = new TerminalResponseV2();
        String terminalRid = extIdGenerator.getTerminalRid(headerRequestorInitiatorRid);
        if (terminalRid != null) {
            Request request = new Request();
            Request.Specific specific1 = new Request.Specific();
            Request.Specific.Admin admin1 = new Request.Specific.Admin();
            request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
            request.setKind(ConstantsV2.TRAN_KIND_MODIFY_TERMINAL);
            request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
            request.setOriginatorInstId(1L);
            admin1.setObjectMustExist(false);
            Terminal terminal = new Terminal();
            terminal.setName(terminalRid);
            terminal.setTermType(ConstantsV2.TERMINAL_TYPE);
            JAXBElement<String> jaxbElementExternalRid = new JAXBElement<>(ConstantsV2.NS_EXTERNAL_QNAME, String.class, externalId);
            terminal.setExternalRid(jaxbElementExternalRid);
            terminal.setStatus("N");
            JAXBElement<String> jaxbElementTitle = new JAXBElement<>(ConstantsV2.NS_TITLE_QNAME, String.class, terminalName);
            terminal.setTitle(jaxbElementTitle);

            BranchId branchId = new BranchId();
            branchId.setId(ConstantsV2.BRANCH_ID);
            JAXBElement<BranchId> jaxbElementBranch = new JAXBElement<>(ConstantsV2.NS_BRANCH_QNAME, BranchId.class, branchId);
            terminal.setBranch(jaxbElementBranch);
            ObjectId objectId = new ObjectId();
            objectId.setId(ConstantsV2.CONFIG_ID);
            JAXBElement<ObjectId> jaxbElementConfig = new JAXBElement<>(ConstantsV2.NS_CONFIG_QNAME, ObjectId.class, objectId);
            terminal.setConfig(jaxbElementConfig);

            ObjectId contractObj = new ObjectId();
            contractObj.setId(Long.valueOf(contractId));
            JAXBElement<ObjectId> jaxbElementContract = new JAXBElement<>(ConstantsV2.NS_CONTRACT_QNAME, ObjectId.class, contractObj);
            terminal.setContract(jaxbElementContract);

            ObjectId obj2 = new ObjectId();
            obj2.setId(ConstantsV2.RISK_PROFILE_ID);
            JAXBElement<ObjectId> jaxbElementRiskProfile = new JAXBElement<>(ConstantsV2.NS_RISK_PROFILE_QNAME, ObjectId.class, obj2);
            terminal.setRiskProfile(jaxbElementRiskProfile);


            ObjectId objectId1 = new ObjectId();
            objectId1.setId(ConstantsV2.SETTINGS_ID);
            JAXBElement<ObjectId> jaxbElementSettingsId = new JAXBElement<>(ConstantsV2.NS_SETTINGS_QNAME, ObjectId.class, objectId1);
            terminal.setSettings(jaxbElementSettingsId);

            JAXBElement<String> jaxbElementTraceProfile = new JAXBElement<>(ConstantsV2.NS_TRACE_PROFILE_QNAME, String.class, ConstantsV2.TRACE_PROFILE);
            terminal.setTraceProfile(jaxbElementTraceProfile);


            Terminal.Keys keys = new Terminal.Keys();
            DesKey desKey = new DesKey();
            DesKeyWithKek desKeyWithKek = new DesKeyWithKek();
            desKey.setId(Long.valueOf(keyGenerator.generateKey(headerRequestorInitiatorRid).getKeyId()));
            desKeyWithKek.setId(Long.valueOf(keyGenerator.generateKey(headerRequestorInitiatorRid).getKeyId()));

            JAXBElement<DesKey> desKeyJAXBElement1 = new JAXBElement<>(new QName(ConstantsV2.NS_ACQUIRING_ADMIN, "Pmk"), DesKey.class, desKey);
            JAXBElement<DesKeyWithKek> desKeyJAXBElement2 = new JAXBElement<>(new QName(ConstantsV2.NS_ACQUIRING_ADMIN, "Mmk"), DesKeyWithKek.class, desKeyWithKek);
            JAXBElement<DesKeyWithKek> desKeyJAXBElement3 = new JAXBElement<>(new QName(ConstantsV2.NS_ACQUIRING_ADMIN, "Emk"), DesKeyWithKek.class, desKeyWithKek);

            keys.setPmk(desKeyJAXBElement1);
            keys.setMmk(desKeyJAXBElement2);
            keys.setEmk(desKeyJAXBElement3);
            terminal.setKeys(keys);


            MailAddress mailAddress = new MailAddress();
            mailAddress.setCountryId(ConstantsV2.COUNTRY_CODE);
            mailAddress.setCityTitle(POSV2.getCity());
            mailAddress.setStreetTitle(POSV2.getAddress());
            JAXBElement<MailAddress> jaxbElementAddress = new JAXBElement<>(ConstantsV2.NS_ADDRESS_QNAME, MailAddress.class, mailAddress);
            JAXBElement<String> jaxbElementNotes = new JAXBElement<>(ConstantsV2.NS_NOTES_QNAME, String.class, "mPOS_Device");

            terminal.setNotes(jaxbElementNotes);

            terminal.setAddress(jaxbElementAddress);
            admin1.setTerminal(terminal);
            specific1.setAdmin(admin1);
            request.setSpecific(specific1);
            String xml = init.jaxbProcessor.marshallToXml(request);
            Response response = init.callSOAP(xml, txParamsMap.get(ConstantsV2.RTP_URL));
            log.info(("tranId: " + response.getId()));
            terminalResponseV2.setTermRid(response.getSpecific().getAdmin().getTerminal().getName());
            terminalResponseV2.setTerminalName(terminalName);
            terminalResponseV2.setAbsRid(externalId);
            terminalResponseV2.setId(String.valueOf(response.getSpecific().getAdmin().getTerminal().getId()));
            terminalResponseV2.setContractId(stlContractId);
            terminalResponseV2.setCode(ConstantsV2.SUCCESS_CODE_000);
            terminalResponseV2.setDescription(ConstantsV2.APPROVED_RESULT);
            terminalResponseV2.setKcv(keyGenerator.generateKey(headerRequestorInitiatorRid).getKcv());
            terminalResponseV2.setKeyValue(keyGenerator.generateKey(headerRequestorInitiatorRid).getKeyVal());
            return terminalResponseV2;
        }
        return terminalResponseV2;
    }

    @Override
    public SoftResponseV2 changeStatusTerminal(String id, String headerRequestorInitiatorRid, String status) throws TransAxisException, JAXBException {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
        request.setKind(ConstantsV2.TRAN_KIND_MODIFY_TERMINAL);
        request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        admin.setObjectMustExist(true);
        Terminal terminal = new Terminal();
        terminal.setId(Long.valueOf(id));
        terminal.setStatus(status);

        admin.setTerminal(terminal);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        tranInvoke.setRequest(request);
        String xmlBody = init.jaxbProcessor.marshallToXml(request);
        Response response = init.callSOAP(xmlBody, txParamsMap.get(ConstantsV2.RTP_URL));
        if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
            softResponseV2.setId(ConstantsV2.SUCCESS_CODE_000);
            softResponseV2.setResult(Boolean.TRUE);
            softResponseV2.setMessage(ConstantsV2.APPROVED_RESULT);
        } else {
            softResponseV2.setId(ConstantsV2.DECLINED_CODE_001);
            softResponseV2.setResult(Boolean.FALSE);
            softResponseV2.setMessage("Failed");
        }
        return softResponseV2;
    }


    @Override
    public TermStatusResponse getStatusTerminal(Long id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        TermStatusResponse terminalDetails = new TermStatusResponse();
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
        request.setKind("ReadTerminal");
        request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        admin.setObjectMustExist(true);
        Terminal term = new Terminal();
        term.setId(id);
        admin.setTerminal(term);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        tranInvoke.setRequest(request);
        StringWriter sw = new StringWriter();
        String xml = init.jaxbProcessor.toXml(sw, tranInvoke);
        Response response = init.callSOAP(xml, txParamsMap.get(ConstantsV2.RTP_URL));
        if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
            String status = response.getSpecific().getAdmin().getTerminal().getStatus();
            switch (status) {
                case "N":
                    terminalDetails.setStatus(ConstantsV2.TERMINAL_NEW_STATUS);
                    break;
                case "A":
                    terminalDetails.setStatus(ConstantsV2.TERMINAL_ACTIVE_STATUS);
                    break;
                case "B":
                    terminalDetails.setStatus(ConstantsV2.TERMINAL_BLOCKED_STATUS);
                    break;
                case "C":
                    terminalDetails.setStatus(ConstantsV2.TERMINAL_CLOSED_STATUS);
                    break;
                default:
                    terminalDetails.setStatus(status);
            }
            terminalDetails.setCode(ConstantsV2.SUCCESS_CODE_000);
            terminalDetails.setTerminalRid(response.getSpecific().getAdmin().getTerminal().getName());
            terminalDetails.setTerminalName(response.getSpecific().getAdmin().getTerminal().getTitle().getValue());
        }
        return terminalDetails;
    }

    @Override
    public SoftResponseV2 deleteTerminal(String id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        String termStatus = getStatusTerminal(Long.valueOf(id), headerRequestorInitiatorRid).getStatus();
        if (termStatus.equals(ConstantsV2.TERMINAL_NEW_STATUS)) {
            this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
            TranInvoke tranInvoke = new TranInvoke();
            Request request = new Request();
            Request.Specific specific = new Request.Specific();
            Request.Specific.Admin admin = new Request.Specific.Admin();
            request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
            request.setKind("DeleteTerminal");
            request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
            admin.setObjectMustExist(true);
            Terminal term = new Terminal();
            term.setId(Long.valueOf(id));
            admin.setTerminal(term);
            specific.setAdmin(admin);
            request.setSpecific(specific);
            tranInvoke.setRequest(request);
            String xmlBody = init.jaxbProcessor.marshallToXml(request);
            Response response = init.callSOAP(xmlBody, txParamsMap.get(ConstantsV2.RTP_URL));
            if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
                softResponseV2.setId(ConstantsV2.SUCCESS_CODE_000);
                softResponseV2.setResult(Boolean.TRUE);
                softResponseV2.setMessage(ConstantsV2.APPROVED_RESULT);
            } else {
                softResponseV2.setId(ConstantsV2.DECLINED_CODE_001);
                softResponseV2.setResult(Boolean.FALSE);
                softResponseV2.setMessage("Such terminal was not found");
            }
            return softResponseV2;
        }
        softResponseV2.setId(ConstantsV2.DECLINED_CODE_001);
        softResponseV2.setResult(Boolean.FALSE);
        softResponseV2.setMessage("Can't deleted. Terminal had already activated");
        return softResponseV2;
    }

    @Override
    public SoftResponseV2 changeMcc(String departmentId, String headerRequestorInitiatorRid, String mccId) throws JAXBException, TransAxisException {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        Request request = new Request();
        request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
        request.setKind(ConstantsV2.TRAN_KIND_MODIFY_SUBJECT);
        request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        admin.setObjectMustExist(true);
        Subject subject = new Subject();
        Department department = new Department();
        department.setId(Long.valueOf(departmentId));
        JAXBElement<Long> jaxbElementMccId = new JAXBElement<>(ConstantsV2.NS_MCC_QNAME, Long.class, Long.valueOf(mccId));
        department.setMccId(jaxbElementMccId);
        subject.setDepartment(department);
        admin.setSubject(subject);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String requestBody = init.jaxbProcessor.marshallToXml(request);
        Response response = init.callSOAP(requestBody, txParamsMap.get(ConstantsV2.RTP_URL));
        response.getResult();
        if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
            softResponseV2.setId(ConstantsV2.SUCCESS_CODE_000);
            softResponseV2.setResult(Boolean.TRUE);
            softResponseV2.setMessage(ConstantsV2.APPROVED_RESULT);
        } else {
            softResponseV2.setId(ConstantsV2.DECLINED_CODE_001);
            softResponseV2.setResult(Boolean.FALSE);
            softResponseV2.setMessage("Failed");
        }
        return softResponseV2;
    }

    @Override
    public SoftResponseV2 changeAccountNumber(AccountChanges accountChanges, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        Request request = new Request();
        request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
        request.setKind(ConstantsV2.TRAN_KIND_MODIFY_CONTRACT);
        request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        Contract contract = new Contract();
        JAXBElement<Long> jaxbElementBranchId = new JAXBElement<>(ConstantsV2.NS_BRANCH_QNAME, Long.class, ConstantsV2.BRANCH_ID);
        contract.setBranchId(jaxbElementBranchId);
        JAXBElement<Long> jaxbElementTypeId = new JAXBElement<>(ConstantsV2.NS_TYPE_QNAME, Long.class, ConstantsV2.TYPE_SETTLEMENT_CONTRACT);
        contract.setTypeId(jaxbElementTypeId);
        contract.setClientId(Long.valueOf(accountChanges.getAbsRid()));
        contract.setId(Long.valueOf(accountChanges.getContractId()));
        contract.setStatus(ConstantsV2.ACTIVE_STATUS);

        Accounts accounts = new Accounts();
        Account account = new Account();
        account.setExtNumber(accountChanges.getAccountNumber());
        account.setCcy(ConstantsV2.CCY);
        account.setRole(ConstantsV2.ROLE_CONTRACT);
        account.setAcctRoleInContract(ConstantsV2.ROLE_CONTRACT);
        accounts.getAccount().add(account);
        contract.setAccounts(accounts);

        contract.setMainCcy(ConstantsV2.CCY);
        admin.setContract(contract);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String bodyXml = init.jaxbProcessor.marshallToXml(request);
        Response response = init.callSOAP(bodyXml, txParamsMap.get(ConstantsV2.RTP_URL));
        if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
            softResponseV2.setId(ConstantsV2.SUCCESS_CODE_000);
            softResponseV2.setResult(Boolean.TRUE);
            softResponseV2.setMessage(ConstantsV2.APPROVED_RESULT);
        } else {
            softResponseV2.setId(ConstantsV2.DECLINED_CODE_001);
            softResponseV2.setResult(Boolean.FALSE);
            softResponseV2.setMessage("Failed");
        }
        return softResponseV2;
    }

}

