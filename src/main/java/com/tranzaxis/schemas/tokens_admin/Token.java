
package com.tranzaxis.schemas.tokens_admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Token complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Token"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Card" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}Card"/&gt;
 *         &lt;element name="CardMagnetic" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}Card"/&gt;
 *         &lt;element name="CardVirtual" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}Card"/&gt;
 *         &lt;element name="CardEmv" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardEmv"/&gt;
 *         &lt;element name="CardMcLite" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardMcLite"/&gt;
 *         &lt;element name="CardMcSelect" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardMcSelect"/&gt;
 *         &lt;element name="CardMcAdvance" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardMcAdvance"/&gt;
 *         &lt;element name="CardVsdc" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardVsdc"/&gt;
 *         &lt;element name="CardAmex" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardAmex"/&gt;
 *         &lt;element name="CardJcb" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardJcb"/&gt;
 *         &lt;element name="CardNsiccs" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardNsiccs"/&gt;
 *         &lt;element name="CardVccs" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardVccs"/&gt;
 *         &lt;element name="CardCupIc" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardCupIc"/&gt;
 *         &lt;element name="CardCcd" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardCcd"/&gt;
 *         &lt;element name="CardCpa" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardCpa"/&gt;
 *         &lt;element name="CardNspk" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}CardNspk"/&gt;
 *         &lt;element name="Login" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}Login"/&gt;
 *         &lt;element name="Phone" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}Phone"/&gt;
 *         &lt;element name="Cert" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}Cert"/&gt;
 *         &lt;element name="ExtAuthApp" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}ExtAuthApp"/&gt;
 *         &lt;element name="MobileApp" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}MobileApp"/&gt;
 *         &lt;element name="WebApp" type="{http://schemas.tranzaxis.com/tokens-admin.xsd}WebApp"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Token", propOrder = {
    "card",
    "cardMagnetic",
    "cardVirtual",
    "cardEmv",
    "cardMcLite",
    "cardMcSelect",
    "cardMcAdvance",
    "cardVsdc",
    "cardAmex",
    "cardJcb",
    "cardNsiccs",
    "cardVccs",
    "cardCupIc",
    "cardCcd",
    "cardCpa",
    "cardNspk",
    "login",
    "phone",
    "cert",
    "extAuthApp",
    "mobileApp",
    "webApp"
})
public class Token {

    @XmlElement(name = "Card")
    protected Card card;
    @XmlElement(name = "CardMagnetic")
    protected Card cardMagnetic;
    @XmlElement(name = "CardVirtual")
    protected Card cardVirtual;
    @XmlElement(name = "CardEmv")
    protected CardEmv cardEmv;
    @XmlElement(name = "CardMcLite")
    protected CardMcLite cardMcLite;
    @XmlElement(name = "CardMcSelect")
    protected CardMcSelect cardMcSelect;
    @XmlElement(name = "CardMcAdvance")
    protected CardMcAdvance cardMcAdvance;
    @XmlElement(name = "CardVsdc")
    protected CardVsdc cardVsdc;
    @XmlElement(name = "CardAmex")
    protected CardAmex cardAmex;
    @XmlElement(name = "CardJcb")
    protected CardJcb cardJcb;
    @XmlElement(name = "CardNsiccs")
    protected CardNsiccs cardNsiccs;
    @XmlElement(name = "CardVccs")
    protected CardVccs cardVccs;
    @XmlElement(name = "CardCupIc")
    protected CardCupIc cardCupIc;
    @XmlElement(name = "CardCcd")
    protected CardCcd cardCcd;
    @XmlElement(name = "CardCpa")
    protected CardCpa cardCpa;
    @XmlElement(name = "CardNspk")
    protected CardNspk cardNspk;
    @XmlElement(name = "Login")
    protected Login login;
    @XmlElement(name = "Phone")
    protected Phone phone;
    @XmlElement(name = "Cert")
    protected Cert cert;
    @XmlElement(name = "ExtAuthApp")
    protected ExtAuthApp extAuthApp;
    @XmlElement(name = "MobileApp")
    protected MobileApp mobileApp;
    @XmlElement(name = "WebApp")
    protected WebApp webApp;

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link Card }
     *     
     */
    public Card getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card }
     *     
     */
    public void setCard(Card value) {
        this.card = value;
    }

    /**
     * Gets the value of the cardMagnetic property.
     * 
     * @return
     *     possible object is
     *     {@link Card }
     *     
     */
    public Card getCardMagnetic() {
        return cardMagnetic;
    }

    /**
     * Sets the value of the cardMagnetic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card }
     *     
     */
    public void setCardMagnetic(Card value) {
        this.cardMagnetic = value;
    }

    /**
     * Gets the value of the cardVirtual property.
     * 
     * @return
     *     possible object is
     *     {@link Card }
     *     
     */
    public Card getCardVirtual() {
        return cardVirtual;
    }

    /**
     * Sets the value of the cardVirtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card }
     *     
     */
    public void setCardVirtual(Card value) {
        this.cardVirtual = value;
    }

    /**
     * Gets the value of the cardEmv property.
     * 
     * @return
     *     possible object is
     *     {@link CardEmv }
     *     
     */
    public CardEmv getCardEmv() {
        return cardEmv;
    }

    /**
     * Sets the value of the cardEmv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardEmv }
     *     
     */
    public void setCardEmv(CardEmv value) {
        this.cardEmv = value;
    }

    /**
     * Gets the value of the cardMcLite property.
     * 
     * @return
     *     possible object is
     *     {@link CardMcLite }
     *     
     */
    public CardMcLite getCardMcLite() {
        return cardMcLite;
    }

    /**
     * Sets the value of the cardMcLite property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardMcLite }
     *     
     */
    public void setCardMcLite(CardMcLite value) {
        this.cardMcLite = value;
    }

    /**
     * Gets the value of the cardMcSelect property.
     * 
     * @return
     *     possible object is
     *     {@link CardMcSelect }
     *     
     */
    public CardMcSelect getCardMcSelect() {
        return cardMcSelect;
    }

    /**
     * Sets the value of the cardMcSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardMcSelect }
     *     
     */
    public void setCardMcSelect(CardMcSelect value) {
        this.cardMcSelect = value;
    }

    /**
     * Gets the value of the cardMcAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link CardMcAdvance }
     *     
     */
    public CardMcAdvance getCardMcAdvance() {
        return cardMcAdvance;
    }

    /**
     * Sets the value of the cardMcAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardMcAdvance }
     *     
     */
    public void setCardMcAdvance(CardMcAdvance value) {
        this.cardMcAdvance = value;
    }

    /**
     * Gets the value of the cardVsdc property.
     * 
     * @return
     *     possible object is
     *     {@link CardVsdc }
     *     
     */
    public CardVsdc getCardVsdc() {
        return cardVsdc;
    }

    /**
     * Sets the value of the cardVsdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardVsdc }
     *     
     */
    public void setCardVsdc(CardVsdc value) {
        this.cardVsdc = value;
    }

    /**
     * Gets the value of the cardAmex property.
     * 
     * @return
     *     possible object is
     *     {@link CardAmex }
     *     
     */
    public CardAmex getCardAmex() {
        return cardAmex;
    }

    /**
     * Sets the value of the cardAmex property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAmex }
     *     
     */
    public void setCardAmex(CardAmex value) {
        this.cardAmex = value;
    }

    /**
     * Gets the value of the cardJcb property.
     * 
     * @return
     *     possible object is
     *     {@link CardJcb }
     *     
     */
    public CardJcb getCardJcb() {
        return cardJcb;
    }

    /**
     * Sets the value of the cardJcb property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardJcb }
     *     
     */
    public void setCardJcb(CardJcb value) {
        this.cardJcb = value;
    }

    /**
     * Gets the value of the cardNsiccs property.
     * 
     * @return
     *     possible object is
     *     {@link CardNsiccs }
     *     
     */
    public CardNsiccs getCardNsiccs() {
        return cardNsiccs;
    }

    /**
     * Sets the value of the cardNsiccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardNsiccs }
     *     
     */
    public void setCardNsiccs(CardNsiccs value) {
        this.cardNsiccs = value;
    }

    /**
     * Gets the value of the cardVccs property.
     * 
     * @return
     *     possible object is
     *     {@link CardVccs }
     *     
     */
    public CardVccs getCardVccs() {
        return cardVccs;
    }

    /**
     * Sets the value of the cardVccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardVccs }
     *     
     */
    public void setCardVccs(CardVccs value) {
        this.cardVccs = value;
    }

    /**
     * Gets the value of the cardCupIc property.
     * 
     * @return
     *     possible object is
     *     {@link CardCupIc }
     *     
     */
    public CardCupIc getCardCupIc() {
        return cardCupIc;
    }

    /**
     * Sets the value of the cardCupIc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardCupIc }
     *     
     */
    public void setCardCupIc(CardCupIc value) {
        this.cardCupIc = value;
    }

    /**
     * Gets the value of the cardCcd property.
     * 
     * @return
     *     possible object is
     *     {@link CardCcd }
     *     
     */
    public CardCcd getCardCcd() {
        return cardCcd;
    }

    /**
     * Sets the value of the cardCcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardCcd }
     *     
     */
    public void setCardCcd(CardCcd value) {
        this.cardCcd = value;
    }

    /**
     * Gets the value of the cardCpa property.
     * 
     * @return
     *     possible object is
     *     {@link CardCpa }
     *     
     */
    public CardCpa getCardCpa() {
        return cardCpa;
    }

    /**
     * Sets the value of the cardCpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardCpa }
     *     
     */
    public void setCardCpa(CardCpa value) {
        this.cardCpa = value;
    }

    /**
     * Gets the value of the cardNspk property.
     * 
     * @return
     *     possible object is
     *     {@link CardNspk }
     *     
     */
    public CardNspk getCardNspk() {
        return cardNspk;
    }

    /**
     * Sets the value of the cardNspk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardNspk }
     *     
     */
    public void setCardNspk(CardNspk value) {
        this.cardNspk = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link Login }
     *     
     */
    public Login getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link Login }
     *     
     */
    public void setLogin(Login value) {
        this.login = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Phone }
     *     
     */
    public Phone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phone }
     *     
     */
    public void setPhone(Phone value) {
        this.phone = value;
    }

    /**
     * Gets the value of the cert property.
     * 
     * @return
     *     possible object is
     *     {@link Cert }
     *     
     */
    public Cert getCert() {
        return cert;
    }

    /**
     * Sets the value of the cert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cert }
     *     
     */
    public void setCert(Cert value) {
        this.cert = value;
    }

    /**
     * Gets the value of the extAuthApp property.
     * 
     * @return
     *     possible object is
     *     {@link ExtAuthApp }
     *     
     */
    public ExtAuthApp getExtAuthApp() {
        return extAuthApp;
    }

    /**
     * Sets the value of the extAuthApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtAuthApp }
     *     
     */
    public void setExtAuthApp(ExtAuthApp value) {
        this.extAuthApp = value;
    }

    /**
     * Gets the value of the mobileApp property.
     * 
     * @return
     *     possible object is
     *     {@link MobileApp }
     *     
     */
    public MobileApp getMobileApp() {
        return mobileApp;
    }

    /**
     * Sets the value of the mobileApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileApp }
     *     
     */
    public void setMobileApp(MobileApp value) {
        this.mobileApp = value;
    }

    /**
     * Gets the value of the webApp property.
     * 
     * @return
     *     possible object is
     *     {@link WebApp }
     *     
     */
    public WebApp getWebApp() {
        return webApp;
    }

    /**
     * Sets the value of the webApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebApp }
     *     
     */
    public void setWebApp(WebApp value) {
        this.webApp = value;
    }

}
