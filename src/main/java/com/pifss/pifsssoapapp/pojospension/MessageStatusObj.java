//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.09.10 à 03:44:36 PM CEST 
//


package com.pifss.pifsssoapapp.pojospension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour messageStatusObj complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="messageStatusObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="returnStatus" type="{http://ProvisionPension}returnStatusObj"/&gt;
 *         &lt;element name="returnStatusProvider" type="{http://ProvisionPension}returnStatusProviderObj"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageStatusObj", propOrder = {
    "returnStatus",
    "returnStatusProvider"
})
public class MessageStatusObj {

    @XmlElement(required = true, nillable = true)
    protected ReturnStatusObj returnStatus;
    @XmlElement(required = true, nillable = true)
    protected ReturnStatusProviderObj returnStatusProvider;

    /**
     * Obtient la valeur de la propriété returnStatus.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStatusObj }
     *     
     */
    public ReturnStatusObj getReturnStatus() {
        return returnStatus;
    }

    /**
     * Définit la valeur de la propriété returnStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStatusObj }
     *     
     */
    public void setReturnStatus(ReturnStatusObj value) {
        this.returnStatus = value;
    }

    /**
     * Obtient la valeur de la propriété returnStatusProvider.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStatusProviderObj }
     *     
     */
    public ReturnStatusProviderObj getReturnStatusProvider() {
        return returnStatusProvider;
    }

    /**
     * Définit la valeur de la propriété returnStatusProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStatusProviderObj }
     *     
     */
    public void setReturnStatusProvider(ReturnStatusProviderObj value) {
        this.returnStatusProvider = value;
    }

}
