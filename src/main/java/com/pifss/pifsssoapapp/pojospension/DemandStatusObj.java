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
 * <p>Classe Java pour demandStatusObj complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="demandStatusObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="demandStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Under Process"/&gt;
 *               &lt;enumeration value="Validated"/&gt;
 *               &lt;enumeration value="Rejected"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demandStatusObj", propOrder = {
    "demandStatus"
})
public class DemandStatusObj {

    @XmlElement(required = true)
    protected String demandStatus;

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

}
