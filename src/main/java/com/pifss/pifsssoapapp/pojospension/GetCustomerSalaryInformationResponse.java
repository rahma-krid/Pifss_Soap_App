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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="customerIdentity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="totalPension" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="pensionAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deductionsAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="netPension" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IbanNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Month1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Month2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "customerIdentity",
    "totalPension",
    "pensionAuthority",
    "deductionsAmount",
    "netPension",
    "ibanNumber",
    "month1",
    "month2",
    "messageStatus"
})
@XmlRootElement(name = "getCustomerSalaryInformationResponse")
public class GetCustomerSalaryInformationResponse {

    @XmlElement(required = true)
    protected MessageHeaderObj messageHeader;
    @XmlElement(required = true, nillable = true)
    protected BigInteger customerIdentity;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double totalPension;
    @XmlElement(required = true, nillable = true)
    protected String pensionAuthority;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double deductionsAmount;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double netPension;
    @XmlElement(name = "IbanNumber", required = true, nillable = true)
    protected String ibanNumber;
    @XmlElement(name = "Month1", required = true)
    protected String month1;
    @XmlElement(name = "Month2", required = true)
    protected String month2;
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
     * Obtient la valeur de la propriété totalPension.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPension() {
        return totalPension;
    }

    /**
     * Définit la valeur de la propriété totalPension.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPension(Double value) {
        this.totalPension = value;
    }

    /**
     * Obtient la valeur de la propriété pensionAuthority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionAuthority() {
        return pensionAuthority;
    }

    /**
     * Définit la valeur de la propriété pensionAuthority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionAuthority(String value) {
        this.pensionAuthority = value;
    }

    /**
     * Obtient la valeur de la propriété deductionsAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeductionsAmount() {
        return deductionsAmount;
    }

    /**
     * Définit la valeur de la propriété deductionsAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeductionsAmount(Double value) {
        this.deductionsAmount = value;
    }

    /**
     * Obtient la valeur de la propriété netPension.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetPension() {
        return netPension;
    }

    /**
     * Définit la valeur de la propriété netPension.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetPension(Double value) {
        this.netPension = value;
    }

    /**
     * Obtient la valeur de la propriété ibanNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbanNumber() {
        return ibanNumber;
    }

    /**
     * Définit la valeur de la propriété ibanNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbanNumber(String value) {
        this.ibanNumber = value;
    }

    /**
     * Obtient la valeur de la propriété month1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth1() {
        return month1;
    }

    /**
     * Définit la valeur de la propriété month1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth1(String value) {
        this.month1 = value;
    }

    /**
     * Obtient la valeur de la propriété month2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth2() {
        return month2;
    }

    /**
     * Définit la valeur de la propriété month2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth2(String value) {
        this.month2 = value;
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
