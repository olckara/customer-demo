package com.karaduman.customer.model;

import java.util.Date;

public class Customer {
    private String name;
    private Address address;
    private Date dateOfBirth;
    private String idDocument;
    private String username;

    public Customer(String name, Address address, Date dateOfBirth, String idDocument, String username) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.idDocument = idDocument;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(String idDocument) {
        this.idDocument = idDocument;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
