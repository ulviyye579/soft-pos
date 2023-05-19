package az.unibank.softpos.methods;

import az.unibank.softpos.dto.responses.KeyValues;
import az.unibank.softpos.exceptions.TransAxisException;
import az.unibank.softpos.utils.Configs;
import az.unibank.softpos.utils.Constants;
import az.unibank.softpos.utils.Util;
import com.tranzaxis.schemas.tran.Request;
import com.tranzaxis.schemas.tran.Response;

import javax.xml.bind.JAXBException;

public class KeyGenerator {

    Init init = new Init();

    private final Util util;

    public KeyGenerator(Util util) {
        this.util = util;
    }

    public KeyValues generateKey(String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
        Configs configs = util.getTxParams(headerRequestorInitiatorRid);
        KeyValues keyValues = new KeyValues();
        Request request = new Request();
        request.setInitiatorRid(configs.getInitiatorRid());
        request.setKind("Udt");
        request.setLifePhase(Constants.LIFE_PHASE_SINGLE);
        request.setUdtType("KeyGeneration");
        String xmlBody = init.jaxbProcessor.marshallToXml(request);
        Response responseKeyGeneration = init.callSOAP(xmlBody, configs.getRtpUrl());

        keyValues.setKeyVal(responseKeyGeneration.getUserAttrs().getParamValue().get(1).getVal().getValue());
        keyValues.setKeyId(responseKeyGeneration.getUserAttrs().getParamValue().get(0).getVal().getValue());
        keyValues.setKcv(responseKeyGeneration.getUserAttrs().getParamValue().get(2).getVal().getValue());
        return keyValues;
    }
}
