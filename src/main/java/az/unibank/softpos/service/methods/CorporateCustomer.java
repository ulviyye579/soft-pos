package az.unibank.softpos.service.methods;


import az.unibank.softpos.dto.MiniResponse;
import az.unibank.softpos.dto.SoftResponse;
import az.unibank.softpos.dto.requests.Company;
import az.unibank.softpos.dto.requests.CorpCustomer;
import az.unibank.softpos.dto.requests.Device;
import az.unibank.softpos.dto.requests.SubCustomer;
import az.unibank.softpos.utils.Constants;
import az.unibank.softpos.utils.Util;
import com.tranzaxis.schemas.acquiring_admin.BranchId;
import com.tranzaxis.schemas.acquiring_admin.Terminal;
import com.tranzaxis.schemas.common_types.MailAddress;
import com.tranzaxis.schemas.common_types.ObjectId;
import com.tranzaxis.schemas.common_types.ParamValue;
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

import static az.unibank.softpos.utils.Constants.*;


@Slf4j
@RequiredArgsConstructor
@Service
public class CorporateCustomer {
    Init init = new Init();
    private final Util util;
    private Map<String, String> txParamsMap;

    public Company createCustomer(CorpCustomer cust, String headerRequestorInitiatorRid) throws Exception {
        try {

            this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
            Company company = new Company();
            ReferenceId referenceId = new ReferenceId(util);
            String title = "MPOS " + cust.getCompanyName();
            String inn = cust.getInnRid();
            Person.SubjectDocuments subjectdocuments = new Person.SubjectDocuments();
            TranInvoke tranInvoke = new TranInvoke();
            Request RTP_Request = new Request();
            RTP_Request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
            RTP_Request.setKind(Constants.TRAN_KIND_MODIFY_SUBJECT);
            RTP_Request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
            Request.Specific specific = new Request.Specific();
            Request.Specific.Admin admin = new Request.Specific.Admin();
            Subject subject = new Subject();
            Corporation corporation = new Corporation();
            corporation.setTypeRid("Corporation customer");
            JAXBElement<SubjectBase.SubjectDocuments> JAXSubjectDocuments = new JAXBElement<>(Constants.NS_SUBJECTS_ADMIN_QNAME, SubjectBase.SubjectDocuments.class, subjectdocuments);
            Document document = new Document();
            document.setTypeRid("INN");
            document.setRid(inn);
            subjectdocuments.getDocument().add(document);
            corporation.setSubjectDocuments(JAXSubjectDocuments);

            JAXBElement<String> JAXTitle = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "Title"), String.class, title);
            corporation.setTitle(JAXTitle);
            JAXBElement<String> JAXLegalTitle = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "LegalTitle"), String.class, title);
            corporation.setLegalTitle(JAXLegalTitle);
            JAXBElement<String> JAXLatTitle = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "LatTitle"), String.class, title);
            corporation.setLatTitle(JAXLatTitle);
            JAXBElement<String> JAXShortTitle = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "ShortTitle"), String.class, title);
            corporation.setShortTitle(JAXShortTitle);
            com.tranzaxis.schemas.common_types.ContactAddress ContactAddress = new com.tranzaxis.schemas.common_types.ContactAddress();
            ContactAddress.setZip("1022");
            ContactAddress.setCityTitle("Baku");
            ContactAddress.setCountryId(31L);
            JAXBElement<com.tranzaxis.schemas.common_types.ContactAddress> JAXContactAddress = new JAXBElement(new QName(NS_SUBJECTS_ADMIN, "Address"), String.class,
                    "");
            JAXContactAddress.setValue(ContactAddress);
            corporation.setAddress(JAXContactAddress);
            subject.setCorporation(corporation);
            admin.setSubject(subject);
            specific.setAdmin(admin);
            RTP_Request.setSpecific(specific);
            tranInvoke.setRequest(RTP_Request);
            StringWriter sw = new StringWriter();
            String request = init.jaxbProcessor.toXml(sw, tranInvoke);
            log.trace("request: " + request);
            Response response = init.callSOAP(request, Init.STANDARD_TIMEOUT, txParamsMap.get(Constants.RTP_URL));
            if (response.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
                String customerId = response.getSpecific().getAdmin().getSubject().getCorporation().getId().toString();
                String externalId = referenceId.setExternalId(customerId, headerRequestorInitiatorRid);
                company.setId(customerId);
                company.setExternalId(externalId);
                company.setCode(Constants.SUCCESS_CODE_000);
                company.setDescription(Constants.OK_RESULT);
            } else {
                company.setCode(Constants.DECLINED_CODE_001);
                company.setDescription(response.getResult() + ", " + response.getDeclineReason());
            }

            return company;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
    }

    public MiniResponse createSubCustomer(SubCustomer subcust, String headerRequestorInitiatorRid) throws Exception {
        MiniResponse miniResponse = new MiniResponse();
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        String title = "MPOS " + subcust.getCompanyName();
        TranInvoke tranInvoke = new TranInvoke();
        Request RTP_Request = new Request();
        RTP_Request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
        RTP_Request.setKind(Constants.TRAN_KIND_MODIFY_SUBJECT);
        RTP_Request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        Subject subject = new Subject();

        Department department = new Department();
        department.setTypeId(3L);
        JAXBElement<Long> JAXInstID = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "InstId"), Long.class, 1L);
        department.setInstId(JAXInstID);
        JAXBElement<String> jaxbElementTitle = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "Title"), String.class, title);
        department.setTitle(jaxbElementTitle);
        JAXBElement<String> JAXLegalTitle = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "LegalTitle"), String.class, title);
        department.setLegalTitle(JAXLegalTitle);
        JAXBElement<String> JAXLatTitle = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "LatTitle"), String.class, title);
        department.setLatTitle(JAXLatTitle);
        JAXBElement<String> JAXShortTitle = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "ShortTitle"), String.class, title);
        department.setShortTitle(JAXShortTitle);
        JAXBElement<Long> jaxbElementParentOrgId = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "ParentOrgId"), Long.class, Long.valueOf(subcust.getClientID()));
        department.setParentOrgId(jaxbElementParentOrgId);
        JAXBElement<Long> jaxbElementMccId = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "MccId"), Long.class, Long.valueOf(subcust.getMccCode()));
        department.setMccId(jaxbElementMccId);
        subject.setDepartment(department);
        admin.setSubject(subject);
        specific.setAdmin(admin);
        RTP_Request.setSpecific(specific);
        tranInvoke.setRequest(RTP_Request);
        StringWriter sw = new StringWriter();
        String request = init.jaxbProcessor.toXml(sw, tranInvoke);
        log.trace("request: " + request);
        Response response = init.callSOAP(request, Init.STANDARD_TIMEOUT, txParamsMap.get(Constants.RTP_URL));
        if (response.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
            String departmentId = response.getSpecific().getAdmin().getSubject().getDepartment().getId().toString();
            miniResponse.setId(departmentId);
            miniResponse.setCode(Constants.SUCCESS_CODE_000);
            miniResponse.setDescription(Constants.OK_RESULT);
            String contractRid = generateSettlementContractRequest(departmentId, headerRequestorInitiatorRid);
            if (!contractRid.isEmpty()) {
                Long contractId = generateRtpRequestForCommonContract(departmentId, contractRid, headerRequestorInitiatorRid);

            }
        }
        return miniResponse;
    }


    public String generateSettlementContractRequest(String departmentId, String headerRequestorInitiatorRid) throws Exception {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));

        request.setKind(Constants.TRAN_KIND_MODIFY_CONTRACT);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        Contract contract = new Contract();
        JAXBElement<Long> jaxbElementBranchId = new JAXBElement<>(new QName(NS_CONTRACTS_ADMIN, "BranchId"), Long.class, 21L);
        contract.setBranchId(jaxbElementBranchId);
        JAXBElement<Long> jaxbElementTypeId = new JAXBElement<>(new QName(NS_CONTRACTS_ADMIN, "TypeId"), Long.class, 344l);
        contract.setTypeId(jaxbElementTypeId);
        contract.setClientId(Long.valueOf(departmentId));
        contract.setStatus("A");
        contract.setMainCcy(944L);
        admin.setContract(contract);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        tranInvoke.setRequest(request);
        StringWriter sw = new StringWriter();
        String bodyXml = init.jaxbProcessor.toXml(sw, tranInvoke);
        Response response = init.callSOAP(bodyXml, Init.STANDARD_TIMEOUT, txParamsMap.get(Constants.RTP_URL));
        log.trace("request: " + bodyXml);
        return response.getSpecific().getAdmin().getContract().getRid();
    }


    public Long generateRtpRequestForCommonContract(String departmentId, String contractRid, String headerRequestorInitiatorRid) throws Exception {
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
        request.setKind(Constants.TRAN_KIND_MODIFY_CONTRACT);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        Contract contract = new Contract();
        contract.setInstId(1L);

        JAXBElement<Long> JAXBBranchId = new JAXBElement(new QName(NS_CONTRACTS_ADMIN, "BranchId"), String.class,
                21l);
        contract.setBranchId(JAXBBranchId);
        JAXBElement<Long> JAXBTypeId = new JAXBElement(new QName(NS_CONTRACTS_ADMIN, "TypeId"), String.class,
                81L);
        contract.setTypeId(JAXBTypeId);
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
        tranInvoke.setRequest(request);
        request.setSpecific(specific);
        StringWriter sw = new StringWriter();
        String requestCont = init.jaxbProcessor.toXml(sw, tranInvoke);
        Response commonResponse = init.callSOAP(requestCont, Init.STANDARD_TIMEOUT, txParamsMap.get(Constants.RTP_URL));
        if (commonResponse.getResult().equalsIgnoreCase("Approved")) {
            return commonResponse.getSpecific().getAdmin().getContract().getId();
        }

        return null;
    }


    public MiniResponse createTerminal(Device device, String headerRequestorInitiatorRid) throws Exception {
        MiniResponse miniResponse = new MiniResponse();
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
        request.setKind(Constants.TRAN_KIND_MODIFY_TERMINAL);
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);

        admin.setObjectMustExist(false);
        Terminal terminal = new Terminal();
        terminal.setName("SP00003");
        terminal.setTermType("Pos");
        JAXBElement<String> jaxbElementExternalRid = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "ExternalRid"), String.class, device.getClientID());
        terminal.setExternalRid(jaxbElementExternalRid);
        terminal.setStatus("N");
        JAXBElement<String> jaxbElementTitle = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Title"), String.class, device.getTerminalName());
        terminal.setTitle(jaxbElementTitle);

        BranchId branchId = new BranchId();
//        branchId.setCode(21L);
        branchId.setId(21L);
        JAXBElement<BranchId> jaxbElementBranch = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Branch"), BranchId.class, branchId);
        terminal.setBranch(jaxbElementBranch);
        ObjectId objectId = new ObjectId();
        objectId.setId(21L);
        JAXBElement<ObjectId> JAXConfigId = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Config"), ObjectId.class, objectId);
        terminal.setConfig(JAXConfigId);

        ObjectId contractObj = new ObjectId();
        contractObj.setId(device.getContractId());
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
                "");
        jaxbElementTraceProfile.setValue("Warning");
        terminal.setTraceProfile(jaxbElementTraceProfile);


        MailAddress mailAddress = new MailAddress();
        mailAddress.setCountryId(31L);
        mailAddress.setCityTitle(device.getCity());
        mailAddress.setStreetTitle(device.getAddress());
        JAXBElement<MailAddress> jaxbElementAddress = new JAXBElement<>(new QName(NS_ACQUIRING_ADMIN, "Address"), MailAddress.class,
                mailAddress);
        terminal.setAddress(jaxbElementAddress);
        admin.setTerminal(terminal);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        tranInvoke.setRequest(request);
        StringWriter sw = new StringWriter();
        String xmlBody = init.jaxbProcessor.toXml(sw, tranInvoke);
        Response response = init.callSOAP(xmlBody, Init.STANDARD_TIMEOUT, txParamsMap.get(Constants.RTP_URL));
//        if (response.getResult().equalsIgnoreCase(APPROVED_RESULT)) {
//            request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
//            request.setKind("Udt");
//            request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
//            request.setUdtType("GetLastTerminalRid");
//            tranInvoke.setRequest(request);
//            String xml = init.jaxbProcessor.toXml(sw, tranInvoke);
//            Response responseTerminalId = init.callSOAP(xml, Init.STANDARD_TIMEOUT, txParamsMap.get(Constants.RTP_URL));
//            String lastTerminalRid = responseTerminalId.getUserAttrs().getParamValue().get(0).toString();
        miniResponse.setId(response.getSpecific().getAdmin().getTerminal().getName());
        miniResponse.setCode(SUCCESS_CODE_000);
        miniResponse.setDescription(APPROVED_RESULT);

    return miniResponse;
    }

    public SoftResponse activateStatusTerminal(Long id, String headerRequestorInitiatorRid) throws Exception {
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
        terminal.setStatus("A");

        admin.setTerminal(terminal);
        specific.setAdmin(admin);
        request.setSpecific(specific);
        tranInvoke.setRequest(request);
        StringWriter sw = new StringWriter();
        String xmlBody = init.jaxbProcessor.toXml(sw, tranInvoke);
        Response response = init.callSOAP(xmlBody, Init.STANDARD_TIMEOUT, txParamsMap.get(Constants.RTP_URL));
        if (response.getResult().equalsIgnoreCase(APPROVED_RESULT)) {
            softResponse.setId(Constants.SUCCESS_CODE_000);
            softResponse.setResult(String.valueOf(Boolean.TRUE));
            softResponse.setMessage(Constants.APPROVED_RESULT);
        } else {
            softResponse.setId(Constants.DECLINED_CODE_001);
            softResponse.setResult(String.valueOf(Boolean.FALSE));
            softResponse.setMessage("Failed");

        }
        return softResponse;
    }

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
        Response response = init.callSOAP(xmlBody, Init.STANDARD_TIMEOUT, txParamsMap.get(Constants.RTP_URL));
        if (response.getResult().equalsIgnoreCase(APPROVED_RESULT)) {
            softResponse.setId(Constants.SUCCESS_CODE_000);
            softResponse.setResult(String.valueOf(Boolean.TRUE));
            softResponse.setMessage(Constants.APPROVED_RESULT);
        } else {
            softResponse.setId(Constants.DECLINED_CODE_001);
            softResponse.setResult(String.valueOf(Boolean.FALSE));
            softResponse.setMessage("Failed");

        }
        return softResponse;
    }

    public MiniResponse getStatusTerminal(String id) {
        MiniResponse miniResponse = new MiniResponse();

        if (!id.isEmpty()) {
            miniResponse.setCode(Constants.SUCCESS_CODE_000);
            miniResponse.setDescription("active");
            miniResponse.setId("1");
        } else {
            miniResponse.setCode(Constants.DECLINED_CODE_001);
            miniResponse.setDescription("deactive/closed");
            miniResponse.setId("0");
        }
        return miniResponse;
    }
}

