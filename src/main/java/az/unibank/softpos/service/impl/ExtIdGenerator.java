package az.unibank.softpos.service.impl;

import az.unibank.softpos.exceptions.TransAxisException;
import az.unibank.softpos.methods.Init;
import az.unibank.softpos.service.ExternalIdGenerator;
import az.unibank.softpos.utils.Configs;
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
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.io.StringWriter;

@Slf4j
@RequiredArgsConstructor
@Service

public class ExtIdGenerator implements ExternalIdGenerator {

    Init init = new Init();
    private final Util util ;
    private Configs configs;

    @Override
    public String setExternalId(Long clientId, String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        TranInvoke tranInvoke = new TranInvoke();
        configs = util.getTxParams(headerRequestorInitiatorRid);
        String externalId = "UP" + clientId;
        Request rtpRequest = new Request();
        rtpRequest.setInitiatorRid(configs.getInitiatorRid());
        rtpRequest.setKind(Constants.TRAN_KIND_MODIFY_SUBJECT);
        rtpRequest.setLifePhase(Constants.LIFE_PHASE_SINGLE);
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
        JAXBElement<String> jaxbElementRid = new JAXBElement<>(new QName(Constants.NS_SUBJECTS_ADMIN, "Rid"), String.class, externalId);
        corporation.setRid(jaxbElementRid);
        subject.setCorporation(corporation);
        admin.setSubject(subject);
        specific.setAdmin(admin);
        rtpRequest.setSpecific(specific);
        tranInvoke.setRequest(rtpRequest);
        StringWriter sw = new StringWriter();
        String request = init.jaxbProcessor.toXml(sw, tranInvoke);
        log.trace("request: " + request);
        Response response = init.callSOAP(request, configs.getRtpUrl());
        if (response.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
        return externalId;
    }
        return null;
    }

    @Override
    public String getTerminalRid(String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
        String termRid = null;
        configs = util.getTxParams(headerRequestorInitiatorRid);
        TranInvoke tranInvoke = new TranInvoke();
        Request request = new Request();
        request.setInitiatorRid(configs.getInitiatorRid());
        request.setKind("Udt");
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        request.setUdtType("GetLastTerminalRid");
        tranInvoke.setRequest(request);
        StringWriter sw = new StringWriter();
        String xmlBody = init.jaxbProcessor.toXml(sw, tranInvoke);
        Response response = init.callSOAP(xmlBody, configs.getRtpUrl());
        if (response.getResult().equalsIgnoreCase(Constants.APPROVED_RESULT)) {
            long id = Long.parseLong(response.getUserAttrs().getParamValue().get(0).getVal().getValue().substring(2,8)) +1;
            termRid = "SP" + id;
        }
        return termRid;
    }

}
