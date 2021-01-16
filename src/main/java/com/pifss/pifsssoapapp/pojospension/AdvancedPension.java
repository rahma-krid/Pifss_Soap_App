//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.09.10 à 03:44:36 PM CEST 
//


package com.pifss.pifsssoapapp.pojospension;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour advancedPension complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="advancedPension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="advancedPensionListObj" type="{http://ProvisionPension}advancedPensionObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advancedPension", propOrder = {
    "advancedPensionListObj"
})
public class AdvancedPension {

    protected List<AdvancedPensionObj> advancedPensionListObj;

    /**
     * Gets the value of the advancedPensionListObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advancedPensionListObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvancedPensionListObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvancedPensionObj }
     * 
     * 
     */
    public List<AdvancedPensionObj> getAdvancedPensionListObj() {
        if (advancedPensionListObj == null) {
            advancedPensionListObj = new ArrayList<AdvancedPensionObj>();
        }
        return this.advancedPensionListObj;
    }

}
