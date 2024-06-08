package com.karaduman.customer.model;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Address {
    private String postCode;
    private String houseNumber;
    private String houseNumberAddition;
    private String city;
}
