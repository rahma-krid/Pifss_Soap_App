package com.pifss.pifsssoapapp.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pension {


    @Id
    private String customerIdentityNumber;
    private Double totalPension;
    private String pensionAuthority;
    private Double deductionsAmount;
    private Double netPension;
    private String ibanNumber;
    private String numberOfMonthTobeSpent;

    public Pension() {
    }

    public String getCustomerIdentityNumber() {
        return customerIdentityNumber;
    }

    public void setCustomerIdentityNumber(String customerIdentityNumber) {
        this.customerIdentityNumber = customerIdentityNumber;
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

    public String getNumberOfMonthTobeSpent() {
        return numberOfMonthTobeSpent;
    }

    public void setNumberOfMonthTobeSpent(String numberOfMonthTobeSpent) {
        this.numberOfMonthTobeSpent = numberOfMonthTobeSpent;
    }
}


