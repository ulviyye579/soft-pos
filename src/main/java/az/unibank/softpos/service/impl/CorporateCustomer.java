package az.unibank.softpos.service.impl;


import az.unibank.softpos.dto.requests.Company;
import az.unibank.softpos.dto.requests.Branch;
import az.unibank.softpos.dto.requests.POS;
import az.unibank.softpos.dto.responses.*;
import az.unibank.softpos.methods.ExtIdGenerator;
import az.unibank.softpos.service.CustomerCreator;
import az.unibank.softpos.methods.Init;
import az.unibank.softpos.methods.KeyGenerator;
import az.unibank.softpos.utils.Constants;
import az.unibank.softpos.utils.Util;
import com.tranzaxis.schemas.acquiring_admin.BranchId;
import com.tranzaxis.schemas.acquiring_admin.DesKey;
import com.tranzaxis.schemas.acquiring_admin.DesKeyWithKek;
import com.tranzaxis.schemas.acquiring_admin.Terminal;
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
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.util.Map;

import static az.unibank.softpos.utils.Constants.*;


@Slf4j
@RequiredArgsConstructor
@Service
public class CorporateCustomer implements CustomerCreator {
    Init init = new Init();

    private final Util util;
    private Map<String, String> txParamsMap;

@Override
    public ResponseCustomer createCustomer(Company cust, String headerRequestorInitiatorRid) throws Exception {
        try {

            this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
            ExtIdGenerator extIdGenerator = new ExtIdGenerator(util);
            ResponseCustomer responseCustomer = new ResponseCustomer();
            String title = TITLE_MERCHANT + cust.getCompanyName();
            Person.SubjectDocuments subjectdocuments = new Person.SubjectDocuments();
            Request request = new Request();
            request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
            request.setKind(Constants.TRAN_KIND_MODIFY_SUBJECT);
            request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
            Request.Specific specific = new Request.Specific();
            Request.Specific.Admin admin = new Request.Specific.Admin();
            Subject subject1 = new Subject();
            Corporation corp = new Corporation();
            corp.setTypeRid(TYPE_RID_CORPORATE);
            JAXBElement<SubjectBase.SubjectDocuments> documentsJAXBElement = new JAXBElement<>(Constants.NS_SUBJECTS_ADMIN_QNAME, SubjectBase.SubjectDocuments.class, subjectdocuments);
            Document document = new Document();
            document.setTypeRid(TYPE_RID_DOC);
            document.setRid(cust.getInnRid());
            subjectdocuments.getDocument().add(document);
            corp.setSubjectDocuments(documentsJAXBElement);
            JAXBElement<String> jaxbElementTitle = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "Title"), String.class, title);
            corp.setTitle(jaxbElementTitle);
            corp.setLatTitle(jaxbElementTitle);
            corp.setLegalTitle(jaxbElementTitle);
            corp.setShortTitle(jaxbElementTitle);
            com.tranzaxis.schemas.common_types.ContactAddress contactAddress = new com.tranzaxis.schemas.common_types.ContactAddress();
            contactAddress.setCountryId(COUNTRY_CODE);
            JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress> jaxbElementContactAddress = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "Address"), com.tranzaxis.schemas.common_types.ContactAddress.class,
                    contactAddress);
            corp.setAddress(jaxbElementContactAddress);
            subject1.setCorporation(corp);
            admin.setSubject(subject1);
            specific.setAdmin(admin);
            request.setSpecific(specific);
            String xmlBody = init.jaxbProcessor.marshallToXml(request);
            log.trace("xmlBody : " + xmlBody);
            Response response = init.callSOAP(xmlBody, txParamsMap.get(RTP_URL));
            if (response.getResult().equalsIgnoreCase(APPROVED_RESULT)) {
                Long customerId = response.getSpecific().getAdmin().getSubject().getCorporation().getId();
                String externalId = extIdGenerator.setExternalId(customerId, headerRequestorInitiatorRid);
                responseCustomer.setId(customerId.toString());
                responseCustomer.setExternalId(externalId);
                responseCustomer.setCode(SUCCESS_CODE_000);
                responseCustomer.setDescription(OK_RESULT);
            } else {
                responseCustomer.setCode(DECLINED_CODE_001);
                responseCustomer.setDescription(response.getResult() + ", " + response.getDeclineReason());
            }

            return responseCustomer;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
    }

    @Override
    public CustomerResponse createSubCustomer(Branch subcust, String headerRequestorInitiatorRid) throws Exception {
        ExtIdGenerator extIdGenerator = new ExtIdGenerator(util);
        CustomerResponse customerResponse = new CustomerResponse();
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        String title = TITLE_MERCHANT + subcust.getCompanyName();
        Request request = new Request();
        request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
        request.setKind(Constants.TRAN_KIND_MODIFY_SUBJECT);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        Subject subject = new Subject();
        Department department = new Department();
        department.setTypeId(3L);
        JAXBElement<Long> JAXInstID = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "InstId"), Long.class, 1L);
        department.setInstId(JAXInstID);
        JAXBElement<String> jaxbElementTitle = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "Title"), String.class, title);
        department.setTitle(jaxbElementTitle);
        department.setLatTitle(jaxbElementTitle);
        department.setLegalTitle(jaxbElementTitle);
        department.setShortTitle(jaxbElementTitle);
        JAXBElement<Long> jaxbElementParentOrgId = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "ParentOrgId"), Long.class, Long.valueOf(subcust.getClientID()));
        department.setParentOrgId(jaxbElementParentOrgId);
        JAXBElement<Long> jaxbElementMccId = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "MccId"), Long.class, Long.valueOf(subcust.getMccCode()));
        department.setMccId(jaxbElementMccId);
        subject.setDepartment(department);
        admin.setSubject(subject);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String requestBody = init.jaxbProcessor.marshallToXml(request);
        log.trace("request: " + request);
        Response response = init.callSOAP(requestBody, txParamsMap.get(Constants.RTP_URL));
        if (response.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
            String departmentId = response.getSpecific().getAdmin().getSubject().getDepartment().getId().toString();
            String externalId = extIdGenerator.setExternalId(Long.valueOf(departmentId), headerRequestorInitiatorRid);
            String contractRid = generateSettlementContractRequest(departmentId, subcust, headerRequestorInitiatorRid);
            if (!contractRid.isEmpty()) {
                Long contractId = generateRtpRequestForCommonContract(departmentId, contractRid, headerRequestorInitiatorRid);
                customerResponse.setMerchantId(departmentId);
                customerResponse.setContractId(contractId.toString());
                customerResponse.setExternalId(externalId);
                customerResponse.setResult(APPROVED_RESULT);
            }
        }
        return customerResponse;
    }

    @Override
    public String generateSettlementContractRequest(String departmentId, Branch branch, String headerRequestorInitiatorRid) throws Exception {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        Request request = new Request();
        request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
        request.setKind(Constants.TRAN_KIND_MODIFY_CONTRACT);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        Contract contract = new Contract();
        JAXBElement<Long> jaxbElementBranchId = new JAXBElement<>(new QName(NS_CONTRACTS_ADMIN, "BranchId"), Long.class, 21L);
        contract.setBranchId(jaxbElementBranchId);
        JAXBElement<Long> jaxbElementTypeId = new JAXBElement<>(new QName(NS_CONTRACTS_ADMIN, "TypeId"), Long.class, 344L);
        contract.setTypeId(jaxbElementTypeId);
        contract.setClientId(Long.valueOf(departmentId));
        contract.setStatus("A");

        Accounts accounts = new Accounts();
        Account account = new Account();
        account.setExtNumber(branch.getAccount());
        account.setCcy(CCY);
        account.setRole("Current");
        account.setAcctRoleInContract("Current");
        accounts.getAccount().add(account);
        contract.setAccounts(accounts);

        contract.setMainCcy(CCY);
        admin.setContract(contract);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        String bodyXml = init.jaxbProcessor.marshallToXml(request);
        Response response = init.callSOAP(bodyXml, txParamsMap.get(Constants.RTP_URL));
        log.trace("request: " + bodyXml);
        return response.getSpecific().getAdmin().getContract().getRid();
    }

    @Override
    public Long generateRtpRequestForCommonContract(String departmentId, String contractRid, String headerRequestorInitiatorRid) throws Exception {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
        request.setKind(Constants.TRAN_KIND_MODIFY_CONTRACT);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        Contract contract = new Contract();
        contract.setInstId(1L);

        JAXBElement<Long> jaxbBranchId = new JAXBElement<>(new QName(NS_CONTRACTS_ADMIN, "BranchId"), Long.class,
                BRANCH_ID);
        contract.setBranchId(jaxbBranchId);
        JAXBElement<Long> jaxbTypeId = new JAXBElement<>(new QName(NS_CONTRACTS_ADMIN, "TypeId"), Long.class,
                TYPE_ID);
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
        request.setSpecific(specific);
        String requestCont = init.jaxbProcessor.marshallToXml(request);
        Response commonResponse = init.callSOAP(requestCont, txParamsMap.get(Constants.RTP_URL));
        if (commonResponse.getResult().equalsIgnoreCase("Approved")) {
            return commonResponse.getSpecific().getAdmin().getContract().getId();
        }

        return null;
    }

    @Override
    public TerminalResponse createTerminal(POS POS, String headerRequestorInitiatorRid) throws Exception {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        KeyGenerator keyGenerator = new KeyGenerator(util);
        String terminalName = POS.getTerminalName();
        ExtIdGenerator extIdGenerator = new ExtIdGenerator(util);
        TerminalResponse terminalResponse = new TerminalResponse();
        String customerId = POS.getClientID();
        String terminalRid = extIdGenerator.getTerminalRid(headerRequestorInitiatorRid);
        if (terminalRid != null || customerId != null) {
            Request request = new Request();
            Request.Specific specific1 = new Request.Specific();
            Request.Specific.Admin admin1 = new Request.Specific.Admin();
            request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
            request.setKind(Constants.TRAN_KIND_MODIFY_TERMINAL);
            request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
            request.setOriginatorInstId(1L);
            admin1.setObjectMustExist(false);
            Terminal terminal = new Terminal();
            terminal.setName(terminalRid);
            terminal.setTermType("Pos");
            JAXBElement<String> jaxbElementExternalRid = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "ExternalRid"), String.class, terminalRid);
            terminal.setExternalRid(jaxbElementExternalRid);
            terminal.setStatus("N");
            JAXBElement<String> jaxbElementTitle = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Title"), String.class, terminalName);
            terminal.setTitle(jaxbElementTitle);

            BranchId branchId = new BranchId();
            branchId.setId(21L);
            JAXBElement<BranchId> jaxbElementBranch = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Branch"), BranchId.class, branchId);
            terminal.setBranch(jaxbElementBranch);
            ObjectId objectId = new ObjectId();
            objectId.setId(21L);
            JAXBElement<ObjectId> JAXConfigId = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Config"), ObjectId.class, objectId);
            terminal.setConfig(JAXConfigId);

            ObjectId contractObj = new ObjectId();
            contractObj.setId(POS.getContractId());
            JAXBElement<ObjectId> jaxbElementContract = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Contract"), ObjectId.class, contractObj);
            terminal.setContract(jaxbElementContract);

            ObjectId obj2 = new ObjectId();
            obj2.setId(610L);
            JAXBElement<ObjectId> jaxbElementRiskProfile = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "RiskProfile"), ObjectId.class, obj2);
            terminal.setRiskProfile(jaxbElementRiskProfile);


            ObjectId objectId1 = new ObjectId();

            objectId1.setId(221L);
            JAXBElement<ObjectId> jaxbElementSettingsId = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Settings"), ObjectId.class, objectId1);
            terminal.setSettings(jaxbElementSettingsId);

            JAXBElement<String> jaxbElementTraceProfile = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "TraceProfile"), String.class,
                    "Warning");
            terminal.setTraceProfile(jaxbElementTraceProfile);


            Terminal.Keys keys = new Terminal.Keys();
            DesKey desKey = new DesKey();
            DesKeyWithKek desKeyWithKek = new DesKeyWithKek();
            desKey.setId(Long.valueOf(keyGenerator.generateKey(headerRequestorInitiatorRid).getKeyId()));
            desKeyWithKek.setId(Long.valueOf(keyGenerator.generateKey(headerRequestorInitiatorRid).getKeyId()));

            JAXBElement<DesKey> desKeyJAXBElement1 = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Pmk"), DesKey.class, desKey);
            JAXBElement<DesKeyWithKek> desKeyJAXBElement2 = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Mmk"), DesKeyWithKek.class, desKeyWithKek);
            JAXBElement<DesKeyWithKek> desKeyJAXBElement3 = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Emk"), DesKeyWithKek.class, desKeyWithKek);

            keys.setPmk(desKeyJAXBElement1);
            keys.setMmk(desKeyJAXBElement2);
            keys.setEmk(desKeyJAXBElement3);
            terminal.setKeys(keys);


            MailAddress mailAddress = new MailAddress();
            mailAddress.setCountryId(31L);
            mailAddress.setCityTitle(POS.getCity());
            mailAddress.setStreetTitle(POS.getAddress());
            JAXBElement<MailAddress> jaxbElementAddress = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Address"), MailAddress.class,
                    mailAddress);


            terminal.setAddress(jaxbElementAddress);
            admin1.setTerminal(terminal);
            specific1.setAdmin(admin1);
            request.setSpecific(specific1);
            String xml = init.jaxbProcessor.marshallToXml(request);
            Response response = init.callSOAP(xml, txParamsMap.get(Constants.RTP_URL));
            log.info(("tranId: " + response.getId()));
            terminalResponse.setTermRid(response.getSpecific().getAdmin().getTerminal().getName());
            terminalResponse.setTerminalName(terminalName);
            terminalResponse.setId(String.valueOf(response.getSpecific().getAdmin().getTerminal().getId()));
            terminalResponse.setCode(SUCCESS_CODE_000);
            terminalResponse.setDescription(APPROVED_RESULT);
            terminalResponse.setKcv(keyGenerator.generateKey(headerRequestorInitiatorRid).getKcv());
            terminalResponse.setKeyValue(keyGenerator.generateKey(headerRequestorInitiatorRid).getKeyVal());
            return terminalResponse;
        }
        return terminalResponse;
    }

    @Override
    public SoftResponse activateStatusTerminal(String id, String headerRequestorInitiatorRid) throws Exception {
        SoftResponse softResponse = new SoftResponse();
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
        request.setKind(Constants.TRAN_KIND_MODIFY_TERMINAL);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        admin.setObjectMustExist(true);
        Terminal terminal = new Terminal();
        terminal.setId(Long.valueOf(id));
        terminal.setStatus("A");

        admin.setTerminal(terminal);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        tranInvoke.setRequest(request);
        StringWriter sw = new StringWriter();
        String xmlBody = init.jaxbProcessor.toXml(sw, tranInvoke);
        Response response = init.callSOAP(xmlBody, txParamsMap.get(Constants.RTP_URL));
        if (response.getResult().equalsIgnoreCase(APPROVED_RESULT)) {
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
    public SoftResponse deactivateStatusTerminal(Long id, String headerRequestorInitiatorRid) throws Exception {
        SoftResponse softResponse = new SoftResponse();

        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
        request.setKind(Constants.TRAN_KIND_MODIFY_TERMINAL);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        admin.setObjectMustExist(true);
        Terminal terminal = new Terminal();
        terminal.setId(id);
        terminal.setStatus("C");

        admin.setTerminal(terminal);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        tranInvoke.setRequest(request);
        StringWriter sw = new StringWriter();
        String xmlBody = init.jaxbProcessor.toXml(sw, tranInvoke);
        Response response = init.callSOAP(xmlBody, txParamsMap.get(Constants.RTP_URL));
        if (response.getResult().equalsIgnoreCase(APPROVED_RESULT)) {
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
    public TermStatusResponse getStatusTerminal(Long id, String headerRequestorInitiatorRid) throws Exception {
        TermStatusResponse terminalDetails = new TermStatusResponse();
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
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
        Response response = init.callSOAP(xml, txParamsMap.get(Constants.RTP_URL));
        if (response.getResult().equalsIgnoreCase(APPROVED_RESULT)) {
            String status = response.getSpecific().getAdmin().getTerminal().getStatus();
            switch (status) {
                case "N":
                    terminalDetails.setStatus("New");
                    break;
                case "A":
                    terminalDetails.setStatus("Active");
                    break;
                case "B":
                    terminalDetails.setStatus("Blocked");
                    break;
                case "C":
                    terminalDetails.setStatus("Closed");
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

}
