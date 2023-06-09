package az.unibank.softpos.service.impl;

import az.unibank.softpos.dtov2.requests.AccountChanges;
import az.unibank.softpos.dtov2.requests.BranchV2;
import az.unibank.softpos.dtov2.requests.CompanyAttributes;
import az.unibank.softpos.dtov2.requests.POSV2;
import az.unibank.softpos.dtov2.responses.*;
import az.unibank.softpos.exceptions.TransAxisException;
import az.unibank.softpos.methodsv2.Init;
import az.unibank.softpos.methodsv2.KeyGeneratorV2;
import az.unibank.softpos.service.CustomerCreatorV2;
import az.unibank.softpos.utils.Configs;
import az.unibank.softpos.utils.ConstantsV2;
import az.unibank.softpos.utils.Util;
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

import static az.unibank.softpos.utils.ConstantsV2.REQUEST_FOR_LOG;


@Slf4j
@RequiredArgsConstructor
@Service
public class CorpCustomerImpl2 implements CustomerCreatorV2 {
    Init init = new Init();
    private final Util util;
    SoftResponseV2 softResponseV2 = new SoftResponseV2();
    Request request = new Request();
    private Configs configs;

    @Override
    public CorpCustomerDetails2 createCustomer(CompanyAttributes companyAttributes, String headerRequestorInitiatorRid) throws TransAxisException {
        try {
            configs = util.getTxParams(headerRequestorInitiatorRid);
            CorpCustomerDetails2 corpCustomerDetails2 = new CorpCustomerDetails2();
            String title = ConstantsV2.TITLE_MERCHANT + companyAttributes.getCompanyName();
            SubjectBase.SubjectDocuments subjectDocuments = new Person.SubjectDocuments();
            request.setInitiatorRid(configs.getInitiatorRid());
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
            document.setRid(companyAttributes.getInnRid());
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
            Response response = init.callSOAP(xmlBody, configs.getRtpUrl());
            if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
                Long customerId = response.getSpecific().getAdmin().getSubject().getCorporation().getId();
                corpCustomerDetails2.setId(customerId.toString());
                corpCustomerDetails2.setCode(ConstantsV2.SUCCESS_CODE_000);
                corpCustomerDetails2.setDescription(ConstantsV2.OK_RESULT);
            } else {
                corpCustomerDetails2.setCode(ConstantsV2.DECLINED_CODE_001);
                corpCustomerDetails2.setDescription(response.getResult() + ", " + response.getDeclineReason());
            }
            return corpCustomerDetails2;
        } catch (Exception e) {
            throw new TransAxisException(e);
        }
    }

    @Override
    public BranchResponse createSubCustomer(BranchV2 branchV2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
            configs = util.getTxParams(headerRequestorInitiatorRid);
            ExtIdGeneratorV2 extIdGenerator = new ExtIdGeneratorV2(util);
            BranchResponse branchResponse = new BranchResponse();
            String title = ConstantsV2.TITLE_MERCHANT + branchV2.getCompanyName();
            request.setInitiatorRid(configs.getInitiatorRid());
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
            log.trace(REQUEST_FOR_LOG + request);
            Response response = init.callSOAP(requestBody, configs.getRtpUrl());
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
    public SubCustomerV2 createSubObject(POSV2 posv2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        SubCustomerV2 subCustomerV2 = new SubCustomerV2();
        String title = ConstantsV2.TITLE_MERCHANT + posv2.getTerminalName();
        request.setInitiatorRid(configs.getInitiatorRid());
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
        JAXBElement<Long> jaxbElementParentOrgId = new JAXBElement<>(ConstantsV2.NS_PARENT_QNAME, Long.class, Long.valueOf(posv2.getSubCustomerId()));
        department.setParentOrgId(jaxbElementParentOrgId);
        JAXBElement<Long> jaxbElementMccId = new JAXBElement<>(ConstantsV2.NS_MCC_QNAME, Long.class, Long.valueOf(posv2.getMccCode()));
        department.setMccId(jaxbElementMccId);
        subject.setDepartment(department);
        admin.setSubject(subject);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String requestBody = init.jaxbProcessor.marshallToXml(request);
        log.trace(REQUEST_FOR_LOG + request);
        Response response = init.callSOAP(requestBody, configs.getRtpUrl());
        if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
            String departmentId = response.getSpecific().getAdmin().getSubject().getDepartment().getId().toString();
            Response settlementContract = generateSettlementContractRequest(departmentId, posv2, headerRequestorInitiatorRid);
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
    public Response generateSettlementContractRequest(String departmentId, POSV2 posv2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        request.setInitiatorRid(configs.getInitiatorRid());
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
        account.setExtNumber(posv2.getAccount());
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
        Response response = init.callSOAP(bodyXml, configs.getRtpUrl());
        log.trace(REQUEST_FOR_LOG + bodyXml);
        return response;
    }

    @Override
    public Long generateRtpRequestForCommonContract(String departmentId, String contractRid, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(configs.getInitiatorRid());
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
        Response commonResponse = init.callSOAP(requestCont, configs.getRtpUrl());
        if (commonResponse.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
            return commonResponse.getSpecific().getAdmin().getContract().getId();
        }
        throw new TransAxisException(commonResponse.getResult() + ", " + commonResponse.getDeclineReason());
    }

    @Override
    public TerminalResponseV2 createTerminal(POSV2 posv2, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        KeyGeneratorV2 keyGeneratorV2 = new KeyGeneratorV2(util);
        SubCustomerV2 subCustomerV2 = createSubObject(posv2, headerRequestorInitiatorRid);
        Long contractId = subCustomerV2.getCommonContractId();
        String externalId = subCustomerV2.getSubCustomerId();
        String stlContractId = subCustomerV2.getSettlementContractId();
        String terminalName = posv2.getTerminalName();
        ExtIdGeneratorV2 extIdGenerator = new ExtIdGeneratorV2(util);
        TerminalResponseV2 terminalResponseV2 = new TerminalResponseV2();
        String terminalRid = extIdGenerator.getTerminalRid(headerRequestorInitiatorRid);
        if (terminalRid != null) {
            Request.Specific specific1 = new Request.Specific();
            Request.Specific.Admin admin1 = new Request.Specific.Admin();
            request.setInitiatorRid(configs.getInitiatorRid());
            request.setKind(ConstantsV2.TRAN_KIND_MODIFY_TERMINAL);
            request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
            request.setOriginatorInstId(1L);
            admin1.setObjectMustExist(false);
            Terminal terminal = new Terminal();
            terminal.setName(terminalRid);
            terminal.setTermType(ConstantsV2.TERMINAL_TYPE);
            JAXBElement<String> jaxbElementExternalRid = new JAXBElement<>(ConstantsV2.NS_EXTERNAL_QNAME, String.class, externalId);
            terminal.setExternalRid(jaxbElementExternalRid);
            terminal.setStatus("A");
            JAXBElement<String> jaxTitle = new JAXBElement<>(new QName(ConstantsV2.NS_ACQUIRING_ADMIN, "Title"), String.class, terminalName);
            terminal.setTitle(jaxTitle);

            BranchId branchId = new BranchId();
            branchId.setId(ConstantsV2.BRANCH_ID);
            JAXBElement<BranchId> jaxbElementBranch = new JAXBElement<>(ConstantsV2.NS_BRANCH_QNAME, BranchId.class, branchId);
            terminal.setBranch(jaxbElementBranch);
            ObjectId objectId = new ObjectId();
            objectId.setId(ConstantsV2.CONFIG_ID);
            JAXBElement<ObjectId> jaxbElementConfig = new JAXBElement<>(ConstantsV2.NS_CONFIG_QNAME, ObjectId.class, objectId);
            terminal.setConfig(jaxbElementConfig);

            ObjectId contractObj = new ObjectId();
            contractObj.setId(contractId);
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
            KeyValues keyValues = keyGeneratorV2.generateKey(headerRequestorInitiatorRid);
            Long id = Long.valueOf(keyValues.getKeyId());
            desKey.setId(id);
            desKeyWithKek.setId(id);

            JAXBElement<DesKey> desKeyJAXBElement1 = new JAXBElement<>(new QName(ConstantsV2.NS_ACQUIRING_ADMIN, "Pmk"), DesKey.class, desKey);
            JAXBElement<DesKeyWithKek> desKeyJAXBElement2 = new JAXBElement<>(new QName(ConstantsV2.NS_ACQUIRING_ADMIN, "Mmk"), DesKeyWithKek.class, desKeyWithKek);
            JAXBElement<DesKeyWithKek> desKeyJAXBElement3 = new JAXBElement<>(new QName(ConstantsV2.NS_ACQUIRING_ADMIN, "Emk"), DesKeyWithKek.class, desKeyWithKek);

            keys.setPmk(desKeyJAXBElement1);
            keys.setMmk(desKeyJAXBElement2);
            keys.setEmk(desKeyJAXBElement3);
            terminal.setKeys(keys);


            MailAddress mailAddress = new MailAddress();
            mailAddress.setCountryId(ConstantsV2.COUNTRY_CODE);
            mailAddress.setCityTitle(posv2.getCity());
            mailAddress.setStreetTitle(posv2.getAddress());
            JAXBElement<MailAddress> jaxbElementAddress = new JAXBElement<>(ConstantsV2.NS_ADDRESS_QNAME, MailAddress.class, mailAddress);
            JAXBElement<String> jaxbElementNotes = new JAXBElement<>(ConstantsV2.NS_NOTES_QNAME, String.class, "mPOS_Device");

            terminal.setNotes(jaxbElementNotes);

            terminal.setAddress(jaxbElementAddress);
            admin1.setTerminal(terminal);
            specific1.setAdmin(admin1);
            request.setSpecific(specific1);
            String xml = init.jaxbProcessor.marshallToXml(request);
            Response response = init.callSOAP(xml, configs.getRtpUrl());
            log.info(("tranId: " + response.getId()));
            terminalResponseV2.setTermRid(response.getSpecific().getAdmin().getTerminal().getName());
            terminalResponseV2.setTerminalName(terminalName);
            terminalResponseV2.setAbsRid(externalId);
            terminalResponseV2.setId(String.valueOf(response.getSpecific().getAdmin().getTerminal().getId()));
            terminalResponseV2.setContractId(stlContractId);
            terminalResponseV2.setCode(ConstantsV2.SUCCESS_CODE_000);
            terminalResponseV2.setDescription(ConstantsV2.APPROVED_RESULT);
            terminalResponseV2.setKcv(keyValues.getKcv());
            terminalResponseV2.setKeyValue(keyValues.getKeyVal());
            return terminalResponseV2;
        }
        return terminalResponseV2;
    }


    @Override
    public TermStatusResponseV2 getStatusTerminal(Long id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        TermStatusResponseV2 terminalDetails = new TermStatusResponseV2();
        TranInvoke tranInvoke = new TranInvoke();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(configs.getInitiatorRid());
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
        Response response = init.callSOAP(xml, configs.getRtpUrl());
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
    public SoftResponseV2 changeMcc(String departmentId, String headerRequestorInitiatorRid, String mccId) throws JAXBException, TransAxisException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        request.setInitiatorRid(configs.getInitiatorRid());
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
        Response response = init.callSOAP(requestBody, configs.getRtpUrl());
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
        configs = util.getTxParams(headerRequestorInitiatorRid);
        request.setInitiatorRid(configs.getInitiatorRid());
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
        Response response = init.callSOAP(bodyXml, configs.getRtpUrl());
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

