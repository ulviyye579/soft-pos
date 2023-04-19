package az.unibank.softpos.methodsv2;

import az.unibank.softpos.dtov2.responses.KeyValues;
import az.unibank.softpos.exceptions.TransAxisException;
import az.unibank.softpos.utils.ConstantsV2;
import az.unibank.softpos.utils.Util;
import com.tranzaxis.schemas.tran.Request;
import com.tranzaxis.schemas.tran.Response;

import javax.xml.bind.JAXBException;
import java.util.Map;

public class KeyGenerator {

    Init init = new Init();

    private final Util util;

    public KeyGenerator(Util util) {
        this.util = util;
    }

    public KeyValues generateKey(String headerRequestorInitiatorRid) throws JAXBException, TransAxisException {
        Map<String, String> txParamsMap = util.getTxParams(headerRequestorInitiatorRid);
        KeyValues keyValues = new KeyValues();
        Request request = new Request();
        request.setInitiatorRid(txParamsMap.get(ConstantsV2.INITIATOR_RID));
        request.setKind("Udt");
        request.setLifePhase(ConstantsV2.LIFE_PHASE_SINGLE);
        request.setUdtType("KeyGeneration");
        String xmlBody = init.jaxbProcessor.marshallToXml(request);
        Response responseKeyGeneration = init.callSOAP(xmlBody, txParamsMap.get(ConstantsV2.RTP_URL));

        keyValues.setKeyVal(responseKeyGeneration.getUserAttrs().getParamValue().get(1).getVal().getValue());
        keyValues.setKeyId(responseKeyGeneration.getUserAttrs().getParamValue().get(0).getVal().getValue());
        keyValues.setKcv(responseKeyGeneration.getUserAttrs().getParamValue().get(2).getVal().getValue());
        return keyValues;
    }
}
