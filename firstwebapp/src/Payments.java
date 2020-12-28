package org.example.firstwebapp.dto;

public class Payments {
    private Integer customerNumber;
    private String checkNumber;

    public Payments() {

    }

    public Payments(Integer customerNumber, String checkNumber) {
        super();
        this.customerNumber = customerNumber;
        this.checkNumber = checkNumber;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String toString() {
        return "Payments [customerNumber=" + customerNumber + ", checkNumber=" + checkNumber + "]";
    }
}

