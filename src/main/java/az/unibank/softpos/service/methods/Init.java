/*
 * Copyright (c) 2021.
 *
 *
 *  @author Sanan Garibli
 *
 */

package az.unibank.softpos.service.methods;

import com.tranzaxis.schemas.digitized_card.exceptions.TransAxisException;
import com.tranzaxis.schemas.tran.*;
import lombok.extern.slf4j.Slf4j;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.dom.DOMSource;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@Slf4j
public class Init {

    public final JaxbProcessor jaxbProcessor = JaxbProcessor.getInstance();
    public final JaxbProcessor jaxbProcessorParamValues = JaxbProcessor.getInstanceParamValues();
    public final JaxbProcessor jaxbProcessorRestrictions = JaxbProcessor.getInstanceRestrictions();
    public final JaxbProcessor jaxbProcessorUndoInvoke = JaxbProcessor.getInstanceUndoInvoke();
    public final JaxbProcessor jaxbProcessorEnvelope = JaxbProcessor.getInstanceEnvelope();
    public static final int STANDARD_TIMEOUT = 10000;

    Response callSOAP(String body, int readTimeout, String txUrl) throws Exception {
        try {
            log.trace("Sending request to " + txUrl);
            URL url = new URL(txUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            con.setRequestProperty("Content-Type", "application/xml");
            con.setRequestProperty("Accept", "*/*");
            con.setReadTimeout(readTimeout);

            log.trace("Before try connection");

            try (OutputStream os = con.getOutputStream()) {
                byte[] input = body.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            InputStream is = con.getInputStream();
            MessageFactory factory = MessageFactory.newInstance();
            SOAPMessage message = factory.createMessage(null, is);
            log.trace("End try connection");
            final SOAPBody sb = message.getSOAPBody();
            DOMSource source = new DOMSource(sb.getFirstChild());
            log.trace("Before unmarshal");
            final TranInvoke tran = jaxbProcessor.jaxbContext.createUnmarshaller().unmarshal(source, TranInvoke.class).getValue();
            log.trace("End unmarshal");
            return tran.getResponse();
        } catch (Exception e) {
            throw new TransAxisException(e);
        }
    }


    Response callUndoTran(String body, int readTimeout, String txUrl) throws Exception {
        try {
            log.trace("Sending request to " + txUrl);
            URL url = new URL(txUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            con.setRequestProperty("Content-Type", "application/xml");
            con.setRequestProperty("Accept", "*/*");
            con.setReadTimeout(readTimeout);
            log.trace("Before try connection");
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = body.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
            InputStream is = con.getInputStream();
            MessageFactory factory = MessageFactory.newInstance();
            SOAPMessage message = factory.createMessage(null, is);
            log.trace("End try connection");
            final SOAPBody sb = message.getSOAPBody();
            DOMSource source = new DOMSource(sb.getFirstChild());
            log.trace("Before unmarshal");
            final UndoInvoke undoInvoke = jaxbProcessorUndoInvoke.jaxbContext.createUnmarshaller().unmarshal(source, UndoInvoke.class).getValue();
            log.trace("End unmarshal");
            return undoInvoke.getUndoResponse();
        } catch (Exception ex) {
            throw new TransAxisException(ex);
        }
    }

}
