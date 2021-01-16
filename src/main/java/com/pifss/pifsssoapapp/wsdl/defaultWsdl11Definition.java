package com.pifss.pifsssoapapp.wsdl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class defaultWsdl11Definition {

    @Bean(name = "customers")
    public DefaultWsdl11Definition defaultWsdl11Definition1() {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("UpdateIndividualData");
        definition.setTargetNamespace("http://UpdateIndividualData");
        definition.setLocationUri("/ws");
        definition.setSchema(customersSchema());
        return definition;
    }

    @Bean
    public XsdSchema customersSchema() {
        return new SimpleXsdSchema(new ClassPathResource("wsdlcustomer/UpdateIndividualData_InlineSchema1.xsd"));
    }

    @Bean(name = "pensions")
    public DefaultWsdl11Definition defaultWsdl11Definition2() {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("ProvisionPension");
        definition.setTargetNamespace("http://ProvisionPension");
        definition.setLocationUri("/ws");
        definition.setSchema(pensionSchema());
        return definition;
    }

    @Bean
    public XsdSchema pensionSchema() {
        return new SimpleXsdSchema(new ClassPathResource("wsdlpension/ProvisionPension_InlineSchema1.xsd"));
    }
}
