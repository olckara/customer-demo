package com.karaduman.customer.model;

public class Address {
    private String postCode;
    private String houseNumber;
    private String houseNumberAddition;
    private String city;

    public Address(String postCode, String houseNumber, String houseNumberAddition, String city) {
        this.postCode = postCode;
        this.houseNumber = houseNumber;
        this.houseNumberAddition = houseNumberAddition;
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseNumberAddition() {
        return houseNumberAddition;
    }

    public void setHouseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
