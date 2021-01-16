//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.09.10 à 03:46:42 PM CEST 
//


package com.pifss.pifsssoapapp.pojoscustomer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour messageHeaderObj complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="messageHeaderObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="27"/&gt;
 *         &lt;element name="RequestChannel" maxOccurs="3"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="MOB"/&gt;
 *               &lt;enumeration value="WEB"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestTime" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="17"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageHeaderObj", propOrder = {
    "requestId",
    "requestChannel",
    "requestTime"
})
public class MessageHeaderObj {

    @XmlElement(name = "RequestId", required = true)
    protected List<String> requestId;
    @XmlElement(name = "RequestChannel", required = true)
    protected List<String> requestChannel;
    @XmlElement(name = "RequestTime", required = true)
    protected List<String> requestTime;

    /**
     * Gets the value of the requestId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestId() {
        if (requestId == null) {
            requestId = new ArrayList<String>();
        }
        return this.requestId;
    }

    /**
     * Gets the value of the requestChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestChannel() {
        if (requestChannel == null) {
            requestChannel = new ArrayList<String>();
        }
        return this.requestChannel;
    }

    /**
     * Gets the value of the requestTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestTime() {
        if (requestTime == null) {
            requestTime = new ArrayList<String>();
        }
        return this.requestTime;
    }

}
