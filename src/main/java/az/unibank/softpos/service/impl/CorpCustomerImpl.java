package az.unibank.softpos.service.impl;


import az.unibank.softpos.dto.requests.Branch;
import az.unibank.softpos.dto.requests.Company;
import az.unibank.softpos.dto.requests.POS;
import az.unibank.softpos.dto.responses.*;
import az.unibank.softpos.exceptions.TransAxisException;
import az.unibank.softpos.methods.Init;
import az.unibank.softpos.methods.KeyGenerator;
import az.unibank.softpos.service.CustomerCreator;
import az.unibank.softpos.utils.Configs;
import az.unibank.softpos.utils.Constants;
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


@Slf4j
@RequiredArgsConstructor
@Service
public class CorpCustomerImpl implements CustomerCreator {
    Init init = new Init();
    private final Util util;
    SoftResponse softResponse = new SoftResponse();
    private  Configs configs;


    @Override
    public ResponseCustomer createCustomer(Company company, String headerRequestorInitiatorRid) throws TransAxisException {
        try {
            configs = util.getTxParams(headerRequestorInitiatorRid);
            ExtIdGenerator extIdGenerator = new ExtIdGenerator(util);
            ResponseCustomer responseCustomer = new ResponseCustomer();
            String title = Constants.TITLE_MERCHANT + company.getCompanyName();
            SubjectBase.SubjectDocuments subjectDocuments = new Person.SubjectDocuments();
            Request request = new Request();
            request.setInitiatorRid(configs.getInitiatorRid());
            request.setKind(Constants.TRAN_KIND_MODIFY_SUBJECT);
            request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
            Request.Specific specific = new Request.Specific();
            Request.Specific.Admin admin = new Request.Specific.Admin();
            Subject subject1 = new Subject();
            Corporation corp = new Corporation();
            corp.setTypeRid(Constants.TYPE_RID_CORPORATE);
            JAXBElement<SubjectBase.SubjectDocuments> documentsJAXBElement = new JAXBElement<>(Constants.NS_SUBJECTS_ADMIN_QNAME, SubjectBase.SubjectDocuments.class, subjectDocuments);
            Document document = new Document();
            document.setTypeRid(Constants.TYPE_RID_DOC);
            document.setRid(company.getInnRid());
            subjectDocuments.getDocument().add(document);
            corp.setSubjectDocuments(documentsJAXBElement);
            JAXBElement<String> jaxbElementTitle = new JAXBElement<>(Constants.NS_TITLE_QNAME, String.class, title);
            corp.setTitle(jaxbElementTitle);
            corp.setLatTitle(jaxbElementTitle);
            corp.setLegalTitle(jaxbElementTitle);
            corp.setShortTitle(jaxbElementTitle);
            com.tranzaxis.schemas.common_types.ContactAddress contactAddress = new com.tranzaxis.schemas.common_types.ContactAddress();
            contactAddress.setCountryId(Constants.COUNTRY_CODE);
            JAXBElement<ContactAddress> jaxbElementContactAddress = new JAXBElement<>(Constants.NS_ADDRESS_QNAME, com.tranzaxis.schemas.common_types.ContactAddress.class, contactAddress);
            corp.setAddress(jaxbElementContactAddress);
            subject1.setCorporation(corp);
            admin.setSubject(subject1);
            specific.setAdmin(admin);
            request.setSpecific(specific);
            String xmlBody = init.jaxbProcessor.marshallToXml(request);
            log.trace("xmlBody : " + xmlBody);
            Response response = init.callSOAP(xmlBody, configs.getRtpUrl());
            if (response.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
                Long customerId = response.getSpecific().getAdmin().getSubject().getCorporation().getId();
                String externalId = extIdGenerator.setExternalId(customerId, headerRequestorInitiatorRid);
                responseCustomer.setId(customerId.toString());
                responseCustomer.setExternalId(externalId);
                responseCustomer.setCode(Constants.SUCCESS_CODE_000);
                responseCustomer.setDescription(Constants.OK_RESULT);
            } else {
                responseCustomer.setCode(Constants.DECLINED_CODE_001);
                responseCustomer.setDescription(response.getResult() + ", " + response.getDeclineReason());
            }
            return responseCustomer;
        } catch (Exception e) {
            throw new TransAxisException(e);
        }
    }

    @Override
    public SubCustomer createSubCustomer(Branch branch, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        ExtIdGenerator extIdGenerator = new ExtIdGenerator(util);
        SubCustomer subCustomer = new SubCustomer();
        String title = Constants.TITLE_MERCHANT + branch.getCompanyName();
        Request request = new Request();
        request.setInitiatorRid(configs.getInitiatorRid());
        request.setKind(Constants.TRAN_KIND_MODIFY_SUBJECT);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        Subject subject = new Subject();
        Department department = new Department();
        department.setTypeId(3L);
        JAXBElement<Long> jaxbElementInstID = new JAXBElement<>(Constants.NS_INST_QNAME, Long.class, 1L);
        department.setInstId(jaxbElementInstID);
        JAXBElement<String> jaxbElementTitle = new JAXBElement<>(Constants.NS_TITLE_QNAME, String.class, title);
        department.setTitle(jaxbElementTitle);
        department.setLatTitle(jaxbElementTitle);
        department.setLegalTitle(jaxbElementTitle);
        department.setShortTitle(jaxbElementTitle);
        JAXBElement<Long> jaxbElementParentOrgId = new JAXBElement<>(Constants.NS_PARENT_QNAME, Long.class, Long.valueOf(branch.getClientID()));
        department.setParentOrgId(jaxbElementParentOrgId);
        JAXBElement<Long> jaxbElementMccId = new JAXBElement<>(Constants.NS_MCC_QNAME, Long.class, Long.valueOf(branch.getMccCode()));
        department.setMccId(jaxbElementMccId);
        subject.setDepartment(department);
        admin.setSubject(subject);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String requestBody = init.jaxbProcessor.marshallToXml(request);
        log.trace("request: " + request);
        Response response = init.callSOAP(requestBody,configs.getRtpUrl());
        if (response.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
            String departmentId = response.getSpecific().getAdmin().getSubject().getDepartment().getId().toString();
            String externalId = extIdGenerator.setExternalId(Long.valueOf(departmentId), headerRequestorInitiatorRid);
            String contractRid = generateSettlementContractRequest(departmentId, branch, headerRequestorInitiatorRid);
            if (!contractRid.isEmpty()) {
                Long contractId = generateRtpRequestForCommonContract(departmentId, contractRid, headerRequestorInitiatorRid);
                subCustomer.setMerchantId(departmentId);
                subCustomer.setContractId(contractId.toString());
                subCustomer.setExternalId(externalId);
                subCustomer.setResult(Constants.APPROVED_RESULT);
            }
            return subCustomer;
        } else {
            throw new TransAxisException(response.getResult() + ", " + response.getDeclineReason());
        }

    }

    @Override
    public String generateSettlementContractRequest(String departmentId, Branch branch, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        Request request = new Request();
        request.setInitiatorRid(configs.getInitiatorRid());
        request.setKind(Constants.TRAN_KIND_MODIFY_CONTRACT);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        Contract contract = new Contract();
        JAXBElement<Long> jaxbElementBranchId = new JAXBElement<>(Constants.NS_BRANCH_QNAME, Long.class, Constants.BRANCH_ID);
        contract.setBranchId(jaxbElementBranchId);
        JAXBElement<Long> jaxbElementTypeId = new JAXBElement<>(Constants.NS_TYPE_QNAME, Long.class, Constants.TYPE_SETTLEMENT_CONTRACT);
        contract.setTypeId(jaxbElementTypeId);
        contract.setClientId(Long.valueOf(departmentId));
        contract.setStatus(Constants.ACTIVE_STATUS);

        Accounts accounts = new Accounts();
        Account account = new Account();
        account.setExtNumber(branch.getAccount());
        account.setCcy(Constants.CCY);
        account.setRole(Constants.ROLE_CONTRACT);
        account.setAcctRoleInContract(Constants.ROLE_CONTRACT);
        accounts.getAccount().add(account);
        contract.setAccounts(accounts);

        contract.setMainCcy(Constants.CCY);
        admin.setContract(contract);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String bodyXml = init.jaxbProcessor.marshallToXml(request);
        Response response = init.callSOAP(bodyXml, configs.getRtpUrl());
        log.trace("request: " + bodyXml);
        return response.getSpecific().getAdmin().getContract().getRid();
    }

    @Override
    public Long generateRtpRequestForCommonContract(String departmentId, String contractRid, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(configs.getInitiatorRid());
        request.setKind(Constants.TRAN_KIND_MODIFY_CONTRACT);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        Contract contract = new Contract();
        contract.setInstId(1L);

        JAXBElement<Long> jaxbElementBranchId = new JAXBElement<>(Constants.NS_BRANCH_QNAME, Long.class, Constants.BRANCH_ID);
        contract.setBranchId(jaxbElementBranchId);
        JAXBElement<Long> jaxbTypeId = new JAXBElement<>(Constants.NS_TYPE_QNAME, Long.class, Constants.TYPE_ID);
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
        if (commonResponse.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
            return commonResponse.getSpecific().getAdmin().getContract().getId();
        }
        return null;
    }

    @Override
    public TerminalResponse createTerminal(POS pos, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        KeyGenerator keyGenerator = new KeyGenerator(util);
        String terminalName = pos.getTerminalName();
        ExtIdGenerator extIdGenerator = new ExtIdGenerator(util);
        TerminalResponse terminalResponse = new TerminalResponse();
        String terminalRid = extIdGenerator.getTerminalRid(headerRequestorInitiatorRid);
        if (terminalRid != null) {
            Request request = new Request();
            Request.Specific specific1 = new Request.Specific();
            Request.Specific.Admin admin1 = new Request.Specific.Admin();
            request.setInitiatorRid(configs.getInitiatorRid());
            request.setKind(Constants.TRAN_KIND_MODIFY_TERMINAL);
            request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
            request.setOriginatorInstId(1L);
            admin1.setObjectMustExist(false);
            Terminal terminal = new Terminal();
            terminal.setName(terminalRid);
            terminal.setTermType(Constants.TERMINAL_TYPE);
            JAXBElement<String> jaxbElementExternalRid = new JAXBElement<>(Constants.NS_EXTERNAL_QNAME, String.class, terminalRid);
            terminal.setExternalRid(jaxbElementExternalRid);
            terminal.setStatus("A");
            JAXBElement<String> jaxTitle = new JAXBElement<>(new QName(ConstantsV2.NS_ACQUIRING_ADMIN, "Title"), String.class, terminalName);
            terminal.setTitle(jaxTitle);

            BranchId branchId = new BranchId();
            branchId.setId(Constants.BRANCH_ID);
            JAXBElement<BranchId> jaxbElementBranch = new JAXBElement<>(Constants.NS_BRANCH_QNAME, BranchId.class, branchId);
            terminal.setBranch(jaxbElementBranch);
            ObjectId objectId = new ObjectId();
            objectId.setId(Constants.CONFIG_ID);
            JAXBElement<ObjectId> jaxbElementConfig = new JAXBElement<>(Constants.NS_CONFIG_QNAME, ObjectId.class, objectId);
            terminal.setConfig(jaxbElementConfig);

            ObjectId contractObj = new ObjectId();
            contractObj.setId(Long.valueOf(pos.getContractId()));
            JAXBElement<ObjectId> jaxbElementContract = new JAXBElement<>(Constants.NS_CONTRACT_QNAME, ObjectId.class, contractObj);
            terminal.setContract(jaxbElementContract);

            ObjectId obj2 = new ObjectId();
            obj2.setId(Constants.RISK_PROFILE_ID);
            JAXBElement<ObjectId> jaxbElementRiskProfile = new JAXBElement<>(Constants.NS_RISK_PROFILE_QNAME, ObjectId.class, obj2);
            terminal.setRiskProfile(jaxbElementRiskProfile);


            ObjectId objectId1 = new ObjectId();
            objectId1.setId(Constants.SETTINGS_ID);
            JAXBElement<ObjectId> jaxbElementSettingsId = new JAXBElement<>(Constants.NS_SETTINGS_QNAME, ObjectId.class, objectId1);
            terminal.setSettings(jaxbElementSettingsId);

            JAXBElement<String> jaxbElementTraceProfile = new JAXBElement<>(Constants.NS_TRACE_PROFILE_QNAME, String.class, Constants.TRACE_PROFILE);
            terminal.setTraceProfile(jaxbElementTraceProfile);


            Terminal.Keys keys = new Terminal.Keys();
            DesKey desKey = new DesKey();
            DesKeyWithKek desKeyWithKek = new DesKeyWithKek();
            KeyValues keyValues = keyGenerator.generateKey(headerRequestorInitiatorRid);
            Long id = Long.valueOf(keyValues.getKeyId());
            desKey.setId(id);
            desKeyWithKek.setId(id);

            JAXBElement<DesKey> desKeyJAXBElement1 = new JAXBElement<>(new QName(Constants.NS_ACQUIRING_ADMIN, "Pmk"), DesKey.class, desKey);
            JAXBElement<DesKeyWithKek> desKeyJAXBElement2 = new JAXBElement<>(new QName(Constants.NS_ACQUIRING_ADMIN, "Mmk"), DesKeyWithKek.class, desKeyWithKek);
            JAXBElement<DesKeyWithKek> desKeyJAXBElement3 = new JAXBElement<>(new QName(Constants.NS_ACQUIRING_ADMIN, "Emk"), DesKeyWithKek.class, desKeyWithKek);

            keys.setPmk(desKeyJAXBElement1);
            keys.setMmk(desKeyJAXBElement2);
            keys.setEmk(desKeyJAXBElement3);
            terminal.setKeys(keys);


            MailAddress mailAddress = new MailAddress();
            mailAddress.setCountryId(Constants.COUNTRY_CODE);
            mailAddress.setCityTitle(pos.getCity());
            mailAddress.setStreetTitle(pos.getAddress());
            JAXBElement<MailAddress> jaxbElementAddress = new JAXBElement<>(Constants.NS_ADDRESS_QNAME, MailAddress.class, mailAddress);
            JAXBElement<String> jaxbElementNotes = new JAXBElement<>(Constants.NS_NOTES_QNAME, String.class, "mPOS_Device");

            terminal.setNotes(jaxbElementNotes);

            terminal.setAddress(jaxbElementAddress);
            admin1.setTerminal(terminal);
            specific1.setAdmin(admin1);
            request.setSpecific(specific1);
            String xml = init.jaxbProcessor.marshallToXml(request);
            Response response = init.callSOAP(xml, configs.getRtpUrl());
            log.info(("tranId: " + response.getId()));
            terminalResponse.setTermRid(response.getSpecific().getAdmin().getTerminal().getName());
            terminalResponse.setTerminalName(terminalName);
            terminalResponse.setId(String.valueOf(response.getSpecific().getAdmin().getTerminal().getId()));
            terminalResponse.setCode(Constants.SUCCESS_CODE_000);
            terminalResponse.setDescription(Constants.APPROVED_RESULT);
            terminalResponse.setKcv(keyValues.getKcv());
            terminalResponse.setKeyValue(keyValues.getKeyVal());
            return terminalResponse;
        }
        return terminalResponse;
    }

    @Override
    public SoftResponse changeStatusTerminal(String id, String headerRequestorInitiatorRid, String status) throws TransAxisException, JAXBException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(configs.getInitiatorRid());
        request.setKind(Constants.TRAN_KIND_MODIFY_TERMINAL);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        admin.setObjectMustExist(true);
        Terminal terminal = new Terminal();
        terminal.setId(Long.valueOf(id));
        terminal.setStatus(status);

        admin.setTerminal(terminal);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        tranInvoke.setRequest(request);
        String xmlBody = init.jaxbProcessor.marshallToXml(request);
        Response response = init.callSOAP(xmlBody, configs.getRtpUrl());
        if (response.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
            softResponse.setId(Constants.SUCCESS_CODE_000);
            softResponse.setResult(Boolean.TRUE);
            softResponse.setMessage(Constants.APPROVED_RESULT);
        } else {
            softResponse.setId(Constants.DECLINED_CODE_001);
            softResponse.setResult(Boolean.FALSE);
            softResponse.setMessage("Failed");
        }
        return softResponse;
    }


    @Override
    public TermStatusResponse getStatusTerminal(Long id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        configs = util.getTxParams(headerRequestorInitiatorRid);
        TermStatusResponse terminalDetails = new TermStatusResponse();
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(configs.getInitiatorRid());
        request.setKind("ReadTerminal");
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
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
        if (response.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
            String status = response.getSpecific().getAdmin().getTerminal().getStatus();
            switch (status) {
                case "N":
                    terminalDetails.setStatus(Constants.TERMINAL_NEW_STATUS);
                    break;
                case "A":
                    terminalDetails.setStatus(Constants.TERMINAL_ACTIVE_STATUS);
                    break;
                case "B":
                    terminalDetails.setStatus(Constants.TERMINAL_BLOCKED_STATUS);
                    break;
                case "C":
                    terminalDetails.setStatus(Constants.TERMINAL_CLOSED_STATUS);
                    break;
                default:
                    terminalDetails.setStatus(status);
            }
            terminalDetails.setCode(Constants.SUCCESS_CODE_000);
            terminalDetails.setTerminalRid(response.getSpecific().getAdmin().getTerminal().getName());
            terminalDetails.setTerminalName(response.getSpecific().getAdmin().getTerminal().getTitle().getValue());
        }
        return terminalDetails;
    }

    @Override
    public SoftResponse deleteTerminal(String id, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        String termStatus = getStatusTerminal(Long.valueOf(id), headerRequestorInitiatorRid).getStatus();
        if (termStatus.equals(Constants.TERMINAL_NEW_STATUS)) {
            configs = util.getTxParams(headerRequestorInitiatorRid);
            TranInvoke tranInvoke = new TranInvoke();
            Request request = new Request();
            Request.Specific specific = new Request.Specific();
            Request.Specific.Admin admin = new Request.Specific.Admin();
            request.setInitiatorRid(configs.getInitiatorRid());
            request.setKind("DeleteTerminal");
            request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
            admin.setObjectMustExist(true);
            Terminal term = new Terminal();
            term.setId(Long.valueOf(id));
            admin.setTerminal(term);
            specific.setAdmin(admin);
            request.setSpecific(specific);
            tranInvoke.setRequest(request);
            String xmlBody = init.jaxbProcessor.marshallToXml(request);
            Response response = init.callSOAP(xmlBody, configs.getRtpUrl());
            if (response.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
                softResponse.setId(Constants.SUCCESS_CODE_000);
                softResponse.setResult(Boolean.TRUE);
                softResponse.setMessage(Constants.APPROVED_RESULT);
            } else {
                softResponse.setId(Constants.DECLINED_CODE_001);
                softResponse.setResult(Boolean.FALSE);
                softResponse.setMessage("Such terminal was not found");
            }
            return softResponse;
        }
        softResponse.setId(Constants.DECLINED_CODE_001);
        softResponse.setResult(Boolean.FALSE);
        softResponse.setMessage("Can't deleted. Terminal had already activated");
        return softResponse;
    }

    @Override
    public SoftResponse changeMcc(String departmentId, String headerRequestorInitiatorRid, String mccId) throws JAXBException, TransAxisException {
        Configs txParams = util.getTxParams(headerRequestorInitiatorRid);
        Request request = new Request();
        request.setInitiatorRid(txParams.getInitiatorRid());
        request.setKind(Constants.TRAN_KIND_MODIFY_SUBJECT);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        admin.setObjectMustExist(true);
        Subject subject = new Subject();
        Department department = new Department();
        department.setId(Long.valueOf(departmentId));
        JAXBElement<Long> jaxbElementMccId = new JAXBElement<>(Constants.NS_MCC_QNAME, Long.class, Long.valueOf(mccId));
        department.setMccId(jaxbElementMccId);
        subject.setDepartment(department);
        admin.setSubject(subject);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String requestBody = init.jaxbProcessor.marshallToXml(request);
        Response response = init.callSOAP(requestBody, txParams.getRtpUrl());
        response.getResult();
        if (response.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
            softResponse.setId(Constants.SUCCESS_CODE_000);
            softResponse.setResult(Boolean.TRUE);
            softResponse.setMessage(Constants.APPROVED_RESULT);
        } else {
            softResponse.setId(Constants.DECLINED_CODE_001);
            softResponse.setResult(Boolean.FALSE);
            softResponse.setMessage("Failed");
        }
        return softResponse;
    }


}

