package v1.az.unibank.softpos.service.impl;

import v1.az.unibank.softpos.exceptionsV2.TransAxisException;
import v1.az.unibank.softpos.methodsV2.Init;
import v1.az.unibank.softpos.service.ExternalIdGeneratorV2;
import v1.az.unibank.softpos.utils.ConstantsV2;
import v1.az.unibank.softpos.utils.UtilV2;
import com.tranzaxis.schemas.subjects_admin.Corporation;
import com.tranzaxis.schemas.subjects_admin.Subject;
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

public class ExtIdGeneratorV2 implements ExternalIdGeneratorV2 {

    Init init = new Init();
    private final UtilV2 utilV2;
    private Map<String, String> txParamsMap;

    @Override
    public String setExternalId(Long clientId, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        TranInvoke tranInvoke = new TranInvoke();
        this.txParamsMap = utilV2.getTxParams(headerRequestorInitiatorRid);
        String externalId = "UP" + clientId;
        Request rtpRequest = new Request();
        rtpRequest.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
        rtpRequest.setKind(ConstantsV2.TRAN_KIND_MODIFY_SUBJECT);
        rtpRequest.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        Request.Parties parties = new Request.Parties();
        Request.Parties.Party party = new Request.Parties.Party();
        party.setId(clientId);
        parties.setParty(party);
        rtpRequest.setParties(parties);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        admin.setObjectMustExist(true);
        Subject subject = new Subject();
        Corporation corporation = new Corporation();
        JAXBElement<String> jaxbElementRid = new JAXBElement<>(new QName(ConstantsV2.NS_SUBJECTS_ADMIN, "Rid"), String.class, externalId);
        corporation.setRid(jaxbElementRid);
        subject.setCorporation(corporation);
        admin.setSubject(subject);
        specific.setAdmin(admin);
        rtpRequest.setSpecific(specific);
        tranInvoke.setRequest(rtpRequest);
        StringWriter sw = new StringWriter();
        String request = init.jaxbProcessor.toXml(sw, tranInvoke);
        log.trace("request: " + request);
        Response response = init.callSOAP(request, txParamsMap.get(ConstantsV2.RTP_URL));
        if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
        return externalId;
    }
        return null;
    }

    @Override
    public String getTerminalRid(String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
        String termRid = null;
        this.txParamsMap = utilV2.getTxParams(headerRequestorInitiatorRid);
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
        request.setKind("Udt");
        request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        request.setUdtType("GetLastTerminalRid");
        tranInvoke.setRequest(request);
        StringWriter sw = new StringWriter();
        String xmlBody = init.jaxbProcessor.toXml(sw, tranInvoke);
        Response response = init.callSOAP(xmlBody, txParamsMap.get(ConstantsV2.RTP_URL));
        if (response.getResult().equalsIgnoreCase(ConstantsV2.APPROVED_RESULT)) {
            long id = Long.parseLong(response.getUserAttrs().getParamValue().get(0).getVal().getValue().substring(2,8)) +1;
            termRid = "SP" + id;
        }
        return termRid;
    }

}
