package az.unibank.softpos.methodsv2;

import az.unibank.softpos.dtov2.responses.KeyValues;
import az.unibank.softpos.exceptions.TransAxisException;
import az.unibank.softpos.utils.Configs;
import az.unibank.softpos.utils.ConstantsV2;
import az.unibank.softpos.utils.Util;
import com.tranzaxis.schemas.tran.Request;
import com.tranzaxis.schemas.tran.Response;

import javax.xml.bind.JAXBException;

public class KeyGeneratorV2 {

    Init init = new Init();

    private final Util util;
    private Configs configs;

    public KeyGeneratorV2(Util util) {
        this.util = util;
    }

    public KeyValues generateKey(String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
        configs = util.getTxParams(headerRequestorInitiatorRid);           KeyValues keyValues = new KeyValues();
        Request request = new Request();
        request.setInitiatorRid(configs.getInitiatorRid());
        request.setKind("Udt");
        request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        request.setUdtType("KeyGeneration");
        String xmlBody = init.jaxbProcessor.marshallToXml(request);
        Response responseKeyGeneration = init.callSOAP(xmlBody, configs.getRtpUrl());

        keyValues.setKeyVal(responseKeyGeneration.getUserAttrs().getParamValue().get(1).getVal().getValue());
        keyValues.setKeyId(responseKeyGeneration.getUserAttrs().getParamValue().get(0).getVal().getValue());
        keyValues.setKcv(responseKeyGeneration.getUserAttrs().getParamValue().get(2).getVal().getValue());
        return keyValues;
    }
}
