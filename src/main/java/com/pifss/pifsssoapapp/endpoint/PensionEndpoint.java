package com.pifss.pifsssoapapp.endpoint;

import com.pifss.pifsssoapapp.dao.*;
import com.pifss.pifsssoapapp.pojospension.*;
import com.pifss.pifsssoapapp.entities.CustomerSalary;
import com.pifss.pifsssoapapp.entities.Pension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigInteger;

@Endpoint
public class PensionEndpoint {

    @Autowired
    IPensionDAO pensiondao;

    @Autowired
    ICustomerSalaryDAO customerdao;

    @PayloadRoot(namespace = "http://ProvisionPension" , localPart = "performAdvancedSalaryDemandRequest")
    @ResponsePayload
    public PerformAdvancedSalaryDemandResponse processCourseDetailsRequest(@RequestPayload PerformAdvancedSalaryDemandRequest request) {
        PerformAdvancedSalaryDemandResponse response = new PerformAdvancedSalaryDemandResponse();
        System.out.println("response");

        Pension p = new Pension();
        p.setCustomerIdentityNumber(request.getCustomerIdentityNumber());
        p.setDeductionsAmount(request.getDeductionsAmount());
        p.setIbanNumber(request.getIbanNumber());
        p.setNetPension(request.getNetPension());
        p.setNumberOfMonthTobeSpent(request.getNumberOfMonthTobeSpent());
        p.setPensionAuthority(request.getPensionAuthority());
        p.setTotalPension(request.getTotalPension());

        p = pensiondao.save(p);

        response.setResult(Boolean.TRUE);

        return response;
    }



    @PayloadRoot(namespace = "http://ProvisionPension" , localPart = "getCustomerSalaryInformationRequest")
    @ResponsePayload
    public GetCustomerSalaryInformationResponse processCourseDetailsRequest(@RequestPayload GetCustomerSalaryInformationRequest request) {
        GetCustomerSalaryInformationResponse response = new GetCustomerSalaryInformationResponse();
        System.out.println("response");


       CustomerSalary c =customerdao.findById(request.getCustomerIdentity()).get();
        response.setCustomerIdentity(c.getCustomerIdentity());
        response.setDeductionsAmount(c.getDeductionsAmount());
        response.setIbanNumber(c.getIbanNumber());
        response.setNetPension(c.getNetPension());
        response.setPensionAuthority(c.getPensionAuthority());
        response.setTotalPension(c.getTotalPension());
        response.setMonth1(c.getMonth1());
        response.setMonth2(c.getMonth2());

        return response;
    }
}
