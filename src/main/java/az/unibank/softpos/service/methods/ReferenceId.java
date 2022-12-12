package az.unibank.softpos.service.methods;

import az.unibank.softpos.utils.Constants;
import az.unibank.softpos.utils.Util;
import com.tranzaxis.schemas.subjects_admin.Corporation;
import com.tranzaxis.schemas.subjects_admin.Subject;
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

import static az.unibank.softpos.utils.Constants.APPROVED_RESULT;
import static az.unibank.softpos.utils.Constants.NS_SUBJECTS_ADMIN;

@Slf4j
@RequiredArgsConstructor
@Service

public class ReferenceId {

    Init init = new Init();
   private final Util util ;
    private Map<String, String> txParamsMap;

    public String setExternalId(Long clientId, String headerRequestorInitiatorRid) throws Exception {
        TranInvoke tranInvoke = new TranInvoke();
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        String externalId = "UP" + clientId;
        Request RTP_Request = new Request();
        RTP_Request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
        RTP_Request.setKind(Constants.TRAN_KIND_MODIFY_SUBJECT);
        RTP_Request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        Request.Parties parties = new Request.Parties();
        Request.Parties.Party party = new Request.Parties.Party();
        party.setId(clientId);
        parties.setParty(party);
        RTP_Request.setParties(parties);
        Request.Specific specific = new Request.Specific();
        Request.Specific.Admin admin = new Request.Specific.Admin();
        admin.setObjectMustExist(true);
        Subject subject = new Subject();
        Corporation corporation = new Corporation();
        JAXBElement<String> jaxbElementRid = new JAXBElement<>(new QName(NS_SUBJECTS_ADMIN, "Rid"), String.class, externalId);
        corporation.setRid(jaxbElementRid);
        subject.setCorporation(corporation);
        admin.setSubject(subject);
        specific.setAdmin(admin);
        RTP_Request.setSpecific(specific);
        tranInvoke.setRequest(RTP_Request);
        StringWriter sw = new StringWriter();
        String request = init.jaxbProcessor.toXml(sw, tranInvoke);
        log.trace("request: " + request);
        Response response = init.callSOAP(request, txParamsMap.get(Constants.RTP_URL));
        if (response.getResult().equalsIgnoreCase(APPROVED_RESULT)) {
        return externalId;
    }
        return null;
    }

    public String getTerminalRid(String headerRequestorInitiatorRid) throws Exception {
        String termRid = null;
        this.txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        request.setInitiatorRid(txParamsMap.get(Constants.INITIATOR_RID));
        request.setKind("Udt");
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        request.setUdtType("GetLastTerminalRid");
        tranInvoke.setRequest(request);
        StringWriter sw = new StringWriter();
        String xmlBody = init.jaxbProcessor.toXml(sw, tranInvoke);
        Response response = init.callSOAP(xmlBody, txParamsMap.get(Constants.RTP_URL));
        if (response.getResult().equalsIgnoreCase(APPROVED_RESULT)) {
            long id = Long.parseLong(response.getUserAttrs().getParamValue().get(0).getVal().getValue().substring(2,8)) +1;
            termRid = "SP" + id;
        }
        return termRid;
    }

}
