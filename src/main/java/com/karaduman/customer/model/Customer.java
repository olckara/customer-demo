package com.karaduman.customer.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.AccessType;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AccessType(AccessType.Type.PROPERTY)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Customer {
    private @Id String customerId;
    private String name;
    private Address address;
    private Date dateOfBirth;
    private String idDocument;
    private String username;
}
