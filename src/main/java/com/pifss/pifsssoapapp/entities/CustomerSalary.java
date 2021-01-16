package com.pifss.pifsssoapapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigInteger;

@Entity
public class CustomerSalary {

    @Id
    private BigInteger customerIdentity;
    private Double totalPension;
    private String pensionAuthority;
    private Double deductionsAmount;
    private Double netPension;
    private String ibanNumber;
    private String month1;
    private String month2;

    public CustomerSalary() {
    }

    public BigInteger getCustomerIdentity() {
        return customerIdentity;
    }

    public void setCustomerIdentity(BigInteger customerIdentity) {
        this.customerIdentity = customerIdentity;
    }

    public Double getTotalPension() {
        return totalPension;
    }

    public void setTotalPension(Double totalPension) {
        this.totalPension = totalPension;
    }

    public String getPensionAuthority() {
        return pensionAuthority;
    }

    public void setPensionAuthority(String pensionAuthority) {
        this.pensionAuthority = pensionAuthority;
    }

    public Double getDeductionsAmount() {
        return deductionsAmount;
    }

    public void setDeductionsAmount(Double deductionsAmount) {
        this.deductionsAmount = deductionsAmount;
    }

    public Double getNetPension() {
        return netPension;
    }

    public void setNetPension(Double netPension) {
        this.netPension = netPension;
    }

    public String getIbanNumber() {
        return ibanNumber;
    }

    public void setIbanNumber(String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }

    public String getMonth1() {
        return month1;
    }

    public void setMonth1(String month1) {
        this.month1 = month1;
    }

    public String getMonth2() {
        return month2;
    }

    public void setMonth2(String month2) {
        this.month2 = month2;
    }
}
