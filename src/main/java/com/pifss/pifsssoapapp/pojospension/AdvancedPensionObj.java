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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour advancedPensionObj complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="advancedPensionObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="demandId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="demandDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="demandNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="customerIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="demandStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Under Process"/&gt;
 *               &lt;enumeration value="Validated"/&gt;
 *               &lt;enumeration value="Rejected"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customerPhone" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advancedPensionObj", propOrder = {
    "demandId",
    "demandDate",
    "demandNumber",
    "customerIdentity",
    "customerName",
    "demandStatus",
    "customerPhone"
})
public class AdvancedPensionObj {

    @XmlElement(required = true, nillable = true)
    protected BigInteger demandId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar demandDate;
    @XmlElement(required = true, nillable = true)
    protected BigInteger demandNumber;
    @XmlElement(required = true, nillable = true)
    protected String customerIdentity;
    @XmlElement(required = true, nillable = true)
    protected BigInteger customerName;
    @XmlElement(required = true)
    protected String demandStatus;
    @XmlElement(required = true, nillable = true)
    protected BigInteger customerPhone;

    /**
     * Obtient la valeur de la propriété demandId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDemandId() {
        return demandId;
    }

    /**
     * Définit la valeur de la propriété demandId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDemandId(BigInteger value) {
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
     *     {@link String }
     *     
     */
    public String getCustomerIdentity() {
        return customerIdentity;
    }

    /**
     * Définit la valeur de la propriété customerIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdentity(String value) {
        this.customerIdentity = value;
    }

    /**
     * Obtient la valeur de la propriété customerName.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerName() {
        return customerName;
    }

    /**
     * Définit la valeur de la propriété customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerName(BigInteger value) {
        this.customerName = value;
    }

    /**
     * Obtient la valeur de la propriété demandStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandStatus() {
        return demandStatus;
    }

    /**
     * Définit la valeur de la propriété demandStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandStatus(String value) {
        this.demandStatus = value;
    }

    /**
     * Obtient la valeur de la propriété customerPhone.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerPhone() {
        return customerPhone;
    }

    /**
     * Définit la valeur de la propriété customerPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerPhone(BigInteger value) {
        this.customerPhone = value;
    }

}
