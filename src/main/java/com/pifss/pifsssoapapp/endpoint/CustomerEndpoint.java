package com.pifss.pifsssoapapp.endpoint;

import com.pifss.pifsssoapapp.entities.Customer;
import com.pifss.pifsssoapapp.pojoscustomer.*;
import com.pifss.pifsssoapapp.dao.ICustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigInteger;
import java.util.Date;

@Endpoint
public class CustomerEndpoint {

    @Autowired
    ICustomerDAO customerdao;


    @PayloadRoot(namespace = "http://UpdateIndividualData", localPart = "getCustomerInfoRequest")
    @ResponsePayload
    public GetCustomerInfoResponse getCustomerInfoRequest(@RequestPayload GetCustomerInfoRequest request) {
        GetCustomerInfoResponse response = new GetCustomerInfoResponse();

        Customer c = new Customer();

        c = customerdao.findById(request.getCustomerIdentityNumber()).get();

        BigInteger id = new BigInteger(request.getCustomerIdentityNumber());
        response.setCustomerIdentity(id);
        response.setSocSecurityNumber(c.getSocSecurityNumber());
        response.setHolderType(c.getHolderType());
        response.setHolderDescription(c.getHolderDescription());
        response.setComOutLstStpEmpRsn(c.getComOutLstStpEmpRsn());
        response.setSex(c.getSex());
        response.setDeathDate(c.getDeathDate());
        response.setEnglishName(c.getEnglishName());
        response.setPaciNumber(c.getPaciNumber());
        response.setRegion(c.getRegion());
        response.setStreet(c.getStreet());
        response.setHouseNumber(c.getHouseNumber());
        response.setFloorNumber(c.getFloorNumber());
        response.setAllotmentNumber(c.getAllotmentNumber());
        response.setApartmentNumber(c.getApartmentNumber());
        response.setAvenueNumber(c.getAvenueNumber());
        response.setBirthday(c.getBirthday());
        response.setCustomerName(c.getCustomerName());
        response.setEmail(c.getEmail());
        response.setMobileNumber(c.getMobileNumber());
        response.setPhoneNumber(c.getPhoneNumber());


        return response;
    }


    @PayloadRoot(namespace = "http://UpdateIndividualData", localPart = "updateCustomerProfileRequest")
    @ResponsePayload
    public UpdateCustomerProfileResponse processCourseDetailsRequest(@RequestPayload UpdateCustomerProfileRequest request) {
        UpdateCustomerProfileResponse response = new UpdateCustomerProfileResponse();

        Customer c = new Customer();


        String id = (request.getCustomerIdentity()).toString();
        c = customerdao.findById(id).get();
System.out.println("hello"+c.getEnglishName());
        System.out.println("hello"+request.getCustomerIdentity());

        c.setAllotmentNumber(new BigInteger(request.getAllotmentNumber()));
        c.setEnglishName(request.getEnglishName());
        c.setPaciNumber(request.getPaciNumber());
        c.setRegion(request.getRegion());
        c.setAvenueNumber(new BigInteger(request.getAvenueNumber()));
        c.setStreet(request.getStreet());
        c.setHouseNumber(new BigInteger(request.getHouseNumber()));
        c.setFloorNumber(new BigInteger(request.getFloorNumber()));
        c.setApartmentNumber(new BigInteger(request.getApartmentNumber()));
        c.setEmail(request.getEmail());
        c.setPhoneNumber(new BigInteger(request.getPhoneNumber()));
        c.setMobileNumber(new BigInteger(request.getMobileNumber()));
        c.setCivilCardExpirationDate(new Date());

        customerdao.saveAndFlush(c);
        response.setResult(Boolean.TRUE);

        return response;
    }


}
