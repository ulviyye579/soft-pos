package az.unibank.softpos.service.methods;

import az.unibank.softpos.utils.Util;
import com.tranzaxis.schemas.common_types.ParamValues;
import com.tranzaxis.schemas.tokens_admin.Base;
import com.tranzaxis.schemas.tran.TranInvoke;
import com.tranzaxis.schemas.tran.UndoInvoke;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jettison.mapped.Configuration;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamWriter;
import org.xmlsoap.schemas.soap.envelope.Envelope;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLStreamWriter;
import java.io.Writer;

@Slf4j
public class JaxbProcessor {


    public final MappedNamespaceConvention convention;
    public final JAXBContext jaxbContext;


    private static final JaxbProcessor instance;
    private static final JaxbProcessor instanceParamValues;
    private static final JaxbProcessor instanceRestrictions;
    private static final JaxbProcessor instanceUndoTran;
    private static final JaxbProcessor instanceSoap;

    static {
        try {
            instance = new JaxbProcessor();
            instanceParamValues = new JaxbProcessor(ParamValues.class);
            instanceRestrictions = new JaxbProcessor(Base.Restrictions.class);
            instanceUndoTran = new JaxbProcessor(UndoInvoke.class);
            instanceSoap = new JaxbProcessor(Envelope.class);

        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating singleton instance");
        }
    }

    public static JaxbProcessor getInstance() {
        return instance;
    }

    public static JaxbProcessor getInstanceParamValues() {
        return instanceParamValues;
    }

    public static JaxbProcessor getInstanceRestrictions() {
        return instanceRestrictions;
    }

    public static JaxbProcessor getInstanceUndoInvoke() {
        return instanceUndoTran;
    }

    public static JaxbProcessor getInstanceEnvelope() {
        return instanceSoap;
    }

    private JaxbProcessor() throws JAXBException {

        log.info(Util.getDateTime() + ": before Configuration config = new Configuration()");
        Configuration config = new Configuration();
        log.info(Util.getDateTime() + ":  after Configuration config = new Configuration();");

        log.info(Util.getDateTime() + ":  before convention = new MappedNamespaceConvention(config);");
        convention = new MappedNamespaceConvention(config);
        log.info(Util.getDateTime() + ":  after convention = new MappedNamespaceConvention(config);");

        log.info(Util.getDateTime() + ":  before JAXBContext.newInstance(clazz);");
        jaxbContext = JAXBContext.newInstance(TranInvoke.class);
        log.info(Util.getDateTime() + ":  after JAXBContext.newInstance(clazz);");

    }

    private JaxbProcessor(Class<?> clazz) throws JAXBException {

        log.info("creating instance for " + clazz.getName());
        log.info(Util.getDateTime() + ": before Configuration config = new Configuration()");
        Configuration config = new Configuration();
        log.info(Util.getDateTime() + ":  after Configuration config = new Configuration();");

        log.info(Util.getDateTime() + ":  before convention = new MappedNamespaceConvention(config);");
        convention = new MappedNamespaceConvention(config);
        log.info(Util.getDateTime() + ":  after convention = new MappedNamespaceConvention(config);");

        log.info(Util.getDateTime() + ":  before JAXBContext.newInstance(clazz);");
        jaxbContext = JAXBContext.newInstance(clazz);
        log.info(Util.getDateTime() + ":  after JAXBContext.newInstance(clazz);");
        log.info("created instance for " + clazz.getName());

    }


    public String toXml(Writer writer, Object jaxbObj) throws JAXBException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(jaxbObj, writer);
        return writer.toString();
    }

    public void toJson(Writer writer, Object jaxbAnnotedObj) throws JAXBException {
        XMLStreamWriter xmlStreamWriter = new MappedXMLStreamWriter(convention, writer);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
        marshaller.marshal(jaxbAnnotedObj, xmlStreamWriter);
    }

}
