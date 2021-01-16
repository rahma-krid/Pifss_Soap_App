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
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="advancedPensionList" type="{http://ProvisionPension}advancedPension"/&gt;
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
    "count",
    "pageNumber",
    "pageSize",
    "advancedPensionList",
    "messageStatus"
})
@XmlRootElement(name = "getAdvancedSalaryDemandListResponse")
public class GetAdvancedSalaryDemandListResponse {

    @XmlElement(required = true)
    protected MessageHeaderObj messageHeader;
    @XmlElement(required = true, nillable = true)
    protected BigInteger count;
    @XmlElement(required = true, nillable = true)
    protected BigInteger pageNumber;
    @XmlElement(required = true, nillable = true)
    protected BigInteger pageSize;
    @XmlElement(required = true)
    protected AdvancedPension advancedPensionList;
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
     * Obtient la valeur de la propriété count.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Définit la valeur de la propriété count.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
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
     * Obtient la valeur de la propriété advancedPensionList.
     * 
     * @return
     *     possible object is
     *     {@link AdvancedPension }
     *     
     */
    public AdvancedPension getAdvancedPensionList() {
        return advancedPensionList;
    }

    /**
     * Définit la valeur de la propriété advancedPensionList.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvancedPension }
     *     
     */
    public void setAdvancedPensionList(AdvancedPension value) {
        this.advancedPensionList = value;
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
