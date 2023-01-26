package v1.az.unibank.softpos.methodsV2;

import v1.az.unibank.softpos.dtoV2.responses.KeyValues;
import v1.az.unibank.softpos.exceptionsV2.TransAxisException;
import v1.az.unibank.softpos.utils.ConstantsV2;
import com.tranzaxis.schemas.tran.Request;
import com.tranzaxis.schemas.tran.Response;
import v1.az.unibank.softpos.utils.Util;

import javax.xml.bind.JAXBException;
import java.util.Map;

public class KeyGenerator {

    Init init = new Init();

    private final Util util;

    public KeyGenerator(Util util) {
        this.util = util;
    }

    public KeyValues generateKey(String headerRequestorInitiatorRid) throws TransAxisException, JAXBException {
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
