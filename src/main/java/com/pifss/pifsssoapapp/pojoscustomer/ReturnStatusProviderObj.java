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
 * <p>Classe Java pour returnStatusProviderObj complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="returnStatusProviderObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="returnCodeProvider" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5"/&gt;
 *         &lt;element name="returnCodeDescProviderAr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="23"/&gt;
 *         &lt;element name="returnCodeDescProviderEn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="23"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnStatusProviderObj", propOrder = {
    "returnCodeProvider",
    "returnCodeDescProviderAr",
    "returnCodeDescProviderEn"
})
public class ReturnStatusProviderObj {

    @XmlElement(required = true)
    protected List<String> returnCodeProvider;
    @XmlElement(required = true)
    protected List<String> returnCodeDescProviderAr;
    @XmlElement(required = true)
    protected List<String> returnCodeDescProviderEn;

    /**
     * Gets the value of the returnCodeProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnCodeProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnCodeProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReturnCodeProvider() {
        if (returnCodeProvider == null) {
            returnCodeProvider = new ArrayList<String>();
        }
        return this.returnCodeProvider;
    }

    /**
     * Gets the value of the returnCodeDescProviderAr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnCodeDescProviderAr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnCodeDescProviderAr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReturnCodeDescProviderAr() {
        if (returnCodeDescProviderAr == null) {
            returnCodeDescProviderAr = new ArrayList<String>();
        }
        return this.returnCodeDescProviderAr;
    }

    /**
     * Gets the value of the returnCodeDescProviderEn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnCodeDescProviderEn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnCodeDescProviderEn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReturnCodeDescProviderEn() {
        if (returnCodeDescProviderEn == null) {
            returnCodeDescProviderEn = new ArrayList<String>();
        }
        return this.returnCodeDescProviderEn;
    }

}
