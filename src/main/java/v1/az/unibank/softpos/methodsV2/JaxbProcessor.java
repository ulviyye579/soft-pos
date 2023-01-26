package v1.az.unibank.softpos.methodsV2;

import v1.az.unibank.softpos.utils.ConstantsV2;
import com.tranzaxis.schemas.tran.Request;
import com.tranzaxis.schemas.tran.TranInvoke;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jettison.mapped.Configuration;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import v1.az.unibank.softpos.utils.Util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.io.Writer;

@Slf4j
public class JaxbProcessor {


    public final MappedNamespaceConvention convention;
    public final JAXBContext jaxbContext;


    private static final JaxbProcessor instance;

    static {
        try {
            instance = new JaxbProcessor();

        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating singleton instance" + e.getMessage());
        }
    }

    public static JaxbProcessor getInstance() {
        return instance;
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



    public String toXml(Writer writer, Object jaxbObj) throws JAXBException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(jaxbObj, writer);
        return writer.toString();
    }

    public String marshallToXml(Request request) throws JAXBException {
        TranInvoke tranInvoke = new TranInvoke();
        tranInvoke.setRequest(request);
        StringWriter stringWriter = new StringWriter();
        Marshaller marshaller = jaxbContext.createMarshaller();
        QName qName = new QName(ConstantsV2.NS_TRAN_WSDL, "Tran");
        JAXBElement<TranInvoke> root = new JAXBElement<>(qName, TranInvoke.class, tranInvoke);
        marshaller.marshal(root, stringWriter);
        return stringWriter.toString();
    }

}
