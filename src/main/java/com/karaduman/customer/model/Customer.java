package com.karaduman.customer.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Customer {
    private String name;
    private Address address;
    private Date dateOfBirth;
    private String idDocument;
    private String username;
}
