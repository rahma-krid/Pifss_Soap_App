//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.09.10 à 03:46:42 PM CEST 
//


package com.pifss.pifsssoapapp.pojoscustomer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pifss.pifsssoapapp.pojoscustomer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCustomerInfoResponseCivilCardExpirationDate_QNAME = new QName("http://UpdateIndividualData", "civilCardExpirationDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pifss.pifsssoapapp.pojoscustomer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerInfoRequest }
     * 
     */
    public GetCustomerInfoRequest createGetCustomerInfoRequest() {
        return new GetCustomerInfoRequest();
    }

    /**
     * Create an instance of {@link MessageHeaderObj }
     * 
     */
    public MessageHeaderObj createMessageHeaderObj() {
        return new MessageHeaderObj();
    }

    /**
     * Create an instance of {@link GetCustomerInfoResponse }
     * 
     */
    public GetCustomerInfoResponse createGetCustomerInfoResponse() {
        return new GetCustomerInfoResponse();
    }

    /**
     * Create an instance of {@link MessageStatusObj }
     * 
     */
    public MessageStatusObj createMessageStatusObj() {
        return new MessageStatusObj();
    }

    /**
     * Create an instance of {@link UpdateCustomerProfileRequest }
     * 
     */
    public UpdateCustomerProfileRequest createUpdateCustomerProfileRequest() {
        return new UpdateCustomerProfileRequest();
    }

    /**
     * Create an instance of {@link UpdateCustomerProfileResponse }
     * 
     */
    public UpdateCustomerProfileResponse createUpdateCustomerProfileResponse() {
        return new UpdateCustomerProfileResponse();
    }

    /**
     * Create an instance of {@link ReturnStatusObj }
     * 
     */
    public ReturnStatusObj createReturnStatusObj() {
        return new ReturnStatusObj();
    }

    /**
     * Create an instance of {@link ReturnStatusProviderObj }
     * 
     */
    public ReturnStatusProviderObj createReturnStatusProviderObj() {
        return new ReturnStatusProviderObj();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://UpdateIndividualData", name = "civilCardExpirationDate", scope = GetCustomerInfoResponse.class)
    public JAXBElement<XMLGregorianCalendar> createGetCustomerInfoResponseCivilCardExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetCustomerInfoResponseCivilCardExpirationDate_QNAME, XMLGregorianCalendar.class, GetCustomerInfoResponse.class, value);
    }

}
