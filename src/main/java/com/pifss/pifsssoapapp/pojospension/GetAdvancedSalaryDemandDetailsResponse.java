//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.09.10 à 03:44:36 PM CEST 
//


package com.pifss.pifsssoapapp.pojospension;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageHeader" type="{http://ProvisionPension}messageHeaderObj"/&gt;
 *         &lt;element name="demandId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="demandDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="demandNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="customerIdentity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pensionAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestedMonths" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestedPensionAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="demandStatus" type="{http://ProvisionPension}demandStatusObj"/&gt;
 *         &lt;element name="messageStatus" type="{http://ProvisionPension}messageStatusObj"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageHeader",
    "demandId",
    "demandDate",
    "demandNumber",
    "customerIdentity",
    "customerName",
    "country",
    "pensionAmount",
    "requestedMonths",
    "requestedPensionAmount",
    "demandStatus",
    "messageStatus"
})
@XmlRootElement(name = "getAdvancedSalaryDemandDetailsResponse")
public class GetAdvancedSalaryDemandDetailsResponse {

    @XmlElement(required = true)
    protected MessageHeaderObj messageHeader;
    @XmlElement(required = true, nillable = true)
    protected String demandId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar demandDate;
    @XmlElement(required = true, nillable = true)
    protected BigInteger demandNumber;
    @XmlElement(required = true, nillable = true)
    protected BigInteger customerIdentity;
    @XmlElement(required = true, nillable = true)
    protected String customerName;
    @XmlElement(required = true, nillable = true)
    protected String country;
    @XmlElement(required = true, nillable = true)
    protected String pensionAmount;
    @XmlElement(required = true, nillable = true)
    protected String requestedMonths;
    @XmlElement(required = true, nillable = true)
    protected String requestedPensionAmount;
    @XmlElement(required = true)
    protected DemandStatusObj demandStatus;
    @XmlElement(required = true, nillable = true)
    protected MessageStatusObj messageStatus;

    /**
     * Obtient la valeur de la propriété messageHeader.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderObj }
     *     
     */
    public MessageHeaderObj getMessageHeader() {
        return messageHeader;
    }

    /**
     * Définit la valeur de la propriété messageHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderObj }
     *     
     */
    public void setMessageHeader(MessageHeaderObj value) {
        this.messageHeader = value;
    }

    /**
     * Obtient la valeur de la propriété demandId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandId() {
        return demandId;
    }

    /**
     * Définit la valeur de la propriété demandId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandId(String value) {
        this.demandId = value;
    }

    /**
     * Obtient la valeur de la propriété demandDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDemandDate() {
        return demandDate;
    }

    /**
     * Définit la valeur de la propriété demandDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDemandDate(XMLGregorianCalendar value) {
        this.demandDate = value;
    }

    /**
     * Obtient la valeur de la propriété demandNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDemandNumber() {
        return demandNumber;
    }

    /**
     * Définit la valeur de la propriété demandNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDemandNumber(BigInteger value) {
        this.demandNumber = value;
    }

    /**
     * Obtient la valeur de la propriété customerIdentity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerIdentity() {
        return customerIdentity;
    }

    /**
     * Définit la valeur de la propriété customerIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerIdentity(BigInteger value) {
        this.customerIdentity = value;
    }

    /**
     * Obtient la valeur de la propriété customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Définit la valeur de la propriété customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtient la valeur de la propriété country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Définit la valeur de la propriété country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtient la valeur de la propriété pensionAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionAmount() {
        return pensionAmount;
    }

    /**
     * Définit la valeur de la propriété pensionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionAmount(String value) {
        this.pensionAmount = value;
    }

    /**
     * Obtient la valeur de la propriété requestedMonths.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedMonths() {
        return requestedMonths;
    }

    /**
     * Définit la valeur de la propriété requestedMonths.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedMonths(String value) {
        this.requestedMonths = value;
    }

    /**
     * Obtient la valeur de la propriété requestedPensionAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedPensionAmount() {
        return requestedPensionAmount;
    }

    /**
     * Définit la valeur de la propriété requestedPensionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedPensionAmount(String value) {
        this.requestedPensionAmount = value;
    }

    /**
     * Obtient la valeur de la propriété demandStatus.
     * 
     * @return
     *     possible object is
     *     {@link DemandStatusObj }
     *     
     */
    public DemandStatusObj getDemandStatus() {
        return demandStatus;
    }

    /**
     * Définit la valeur de la propriété demandStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandStatusObj }
     *     
     */
    public void setDemandStatus(DemandStatusObj value) {
        this.demandStatus = value;
    }

    /**
     * Obtient la valeur de la propriété messageStatus.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusObj }
     *     
     */
    public MessageStatusObj getMessageStatus() {
        return messageStatus;
    }

    /**
     * Définit la valeur de la propriété messageStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusObj }
     *     
     */
    public void setMessageStatus(MessageStatusObj value) {
        this.messageStatus = value;
    }

}
