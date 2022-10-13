
package org.radixware.schemas.cfgmanagement_impexp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.radixware.schemas.cfgmanagement_impexp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Packet_QNAME = new QName("http://schemas.radixware.org/cfgManagement-impExp.xsd", "Packet");
    private final static QName _Settings_QNAME = new QName("http://schemas.radixware.org/cfgManagement-impExp.xsd", "Settings");
    private final static QName _SnapshotRecord_QNAME = new QName("http://schemas.radixware.org/cfgManagement-impExp.xsd", "SnapshotRecord");
    private final static QName _Snapshot_QNAME = new QName("http://schemas.radixware.org/cfgManagement-impExp.xsd", "Snapshot");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.radixware.schemas.cfgmanagement_impexp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link SnapshotRecord }
     * 
     */
    public SnapshotRecord createSnapshotRecord() {
        return new SnapshotRecord();
    }

    /**
     * Create an instance of {@link ItemSettings }
     * 
     */
    public ItemSettings createItemSettings() {
        return new ItemSettings();
    }

    /**
     * Create an instance of {@link ItemSettings.XmlParams }
     * 
     */
    public ItemSettings.XmlParams createItemSettingsXmlParams() {
        return new ItemSettings.XmlParams();
    }

    /**
     * Create an instance of {@link Packet }
     * 
     */
    public Packet createPacket() {
        return new Packet();
    }

    /**
     * Create an instance of {@link Snapshot }
     * 
     */
    public Snapshot createSnapshot() {
        return new Snapshot();
    }

    /**
     * Create an instance of {@link Item.Children }
     * 
     */
    public Item.Children createItemChildren() {
        return new Item.Children();
    }

    /**
     * Create an instance of {@link SnapshotRecord.Prop }
     * 
     */
    public SnapshotRecord.Prop createSnapshotRecordProp() {
        return new SnapshotRecord.Prop();
    }

    /**
     * Create an instance of {@link ItemSettings.XmlParams.XmlParam }
     * 
     */
    public ItemSettings.XmlParams.XmlParam createItemSettingsXmlParamsXmlParam() {
        return new ItemSettings.XmlParams.XmlParam();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Packet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Packet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/cfgManagement-impExp.xsd", name = "Packet")
    public JAXBElement<Packet> createPacket(Packet value) {
        return new JAXBElement<Packet>(_Packet_QNAME, Packet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemSettings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemSettings }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/cfgManagement-impExp.xsd", name = "Settings")
    public JAXBElement<ItemSettings> createSettings(ItemSettings value) {
        return new JAXBElement<ItemSettings>(_Settings_QNAME, ItemSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnapshotRecord }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SnapshotRecord }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/cfgManagement-impExp.xsd", name = "SnapshotRecord")
    public JAXBElement<SnapshotRecord> createSnapshotRecord(SnapshotRecord value) {
        return new JAXBElement<SnapshotRecord>(_SnapshotRecord_QNAME, SnapshotRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snapshot }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Snapshot }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.radixware.org/cfgManagement-impExp.xsd", name = "Snapshot")
    public JAXBElement<Snapshot> createSnapshot(Snapshot value) {
        return new JAXBElement<Snapshot>(_Snapshot_QNAME, Snapshot.class, null, value);
    }

}
