/*
 * Copyright (c) 2021.
 *
 *
 *  @author Sanan Garibli
 *
 */

package az.unibank.softpos.service.methods;

import az.unibank.softpos.exceptions.TransAxisException;
import az.unibank.softpos.utils.Util;
import com.tranzaxis.schemas.tran.*;
import lombok.extern.slf4j.Slf4j;

import javax.xml.XMLConstants;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.SchemaFactory;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
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
    public static final int CREATE_CARD_TIMEOUT = 30000;
    public static final int LATENCY_TIMEOUT = 60000;
    public static final int PRE_PRODUCE_CARD_TIMEOUT = 1200000;
    public static final int HSM_TIMEOUT = 10000;


    Response callSOAP(String body, int readTimeout, String txUrl) throws Exception {
        try {
            log.debug("Request : " + Util.maskPan(body));
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
            log.trace("SOAP Response: " + Util.maskPan(printResponseAsXmlString(sb)));
            final TranInvoke tran = jaxbProcessor.jaxbContext.createUnmarshaller().unmarshal(source, TranInvoke.class).getValue();
            log.trace("End unmarshal");
            return tran.getResponse();
        } catch (Exception e) {
            throw new TransAxisException(e);
        }
    }


    Response callSOAP(String body, int readTimeout, String txUrl, String contentType, String accept) throws Exception {
        try {
            log.trace("Sending request to " + txUrl);
            URL url = new URL(txUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            con.setRequestProperty("Content-Type", contentType);
            con.setRequestProperty("Accept", accept);
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
            log.trace("SOAP Response: " + Util.maskPan(printResponseAsXmlString(sb)));
            final TranInvoke tran = jaxbProcessor.jaxbContext.createUnmarshaller().unmarshal(source, TranInvoke.class).getValue();
            log.trace("End unmarshal");
            return tran.getResponse();
        } catch (Exception e) {
            throw new TransAxisException(e);
        }
    }


    UserOperResponse callSOAPCbsTranList(String body, int readTimeout, String txUrl) throws Exception {
        try {
            log.debug("Request : " + Util.maskPan(body));
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
            log.trace("SOAP Response: " + Util.maskPan(printResponseAsXmlString(sb)));
            final UserOperInvoke userOperInvoke = jaxbProcessor.jaxbContext.createUnmarshaller().unmarshal(source, UserOperInvoke.class).getValue();
            log.trace("End unmarshal");
            return userOperInvoke.getUserOperResponse();
        } catch (Exception e) {
            throw new TransAxisException(e);
        }
    }

    Response callUndoTran(String body, int readTimeout, String txUrl) throws Exception {
        try {
            log.debug("Request : " + Util.maskPan(body));
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
            log.trace("SOAP Response: " + Util.maskPan(printResponseAsXmlString(sb)));
            final UndoInvoke undoInvoke = jaxbProcessorUndoInvoke.jaxbContext.createUnmarshaller().unmarshal(source, UndoInvoke.class).getValue();
            log.trace("End unmarshal");
            return undoInvoke.getUndoResponse();
        } catch (Exception ex) {
            throw new TransAxisException(ex);
        }
    }


    private static String printResponseAsXmlString(Node node) {
        StringWriter sw = new StringWriter();
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            factory.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            factory.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
            Transformer transformer = transformerFactory.newTransformer();
            transformer.transform(new DOMSource(node), new StreamResult(sw));
        } catch (Exception e) {
            log.error(e.getLocalizedMessage());
        }
        return sw.toString().replaceAll("[\r\n]+", " ");
    }

}
