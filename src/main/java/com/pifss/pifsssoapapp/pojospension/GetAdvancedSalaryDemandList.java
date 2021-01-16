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
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIdentity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="demandNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="sortBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "customerName",
    "customerIdentity",
    "demandNumber",
    "pageNumber",
    "pageSize",
    "sortBy"
})
@XmlRootElement(name = "getAdvancedSalaryDemandList")
public class GetAdvancedSalaryDemandList {

    @XmlElement(required = true)
    protected MessageHeaderObj messageHeader;
    @XmlElement(required = true, nillable = true)
    protected String customerName;
    @XmlElement(required = true, nillable = true)
    protected BigInteger customerIdentity;
    @XmlElement(required = true, nillable = true)
    protected BigInteger demandNumber;
    @XmlElement(required = true, nillable = true)
    protected BigInteger pageNumber;
    @XmlElement(required = true, nillable = true)
    protected BigInteger pageSize;
    @XmlElement(required = true, nillable = true)
    protected String sortBy;

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
     * Obtient la valeur de la propriété pageNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageNumber() {
        return pageNumber;
    }

    /**
     * Définit la valeur de la propriété pageNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageNumber(BigInteger value) {
        this.pageNumber = value;
    }

    /**
     * Obtient la valeur de la propriété pageSize.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageSize() {
        return pageSize;
    }

    /**
     * Définit la valeur de la propriété pageSize.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageSize(BigInteger value) {
        this.pageSize = value;
    }

    /**
     * Obtient la valeur de la propriété sortBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * Définit la valeur de la propriété sortBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortBy(String value) {
        this.sortBy = value;
    }

}
