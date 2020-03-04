package com.knoldus.model;


import java.util.Optional;

public class Address {
    private String primaryAddress;
    private Optional<String> secondaryAddress;

    public Address(String primaryAddress, Optional<String> secondaryAddress) {
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = secondaryAddress;
    }

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public Optional<String> getSecondaryAddress() {
        return secondaryAddress;
    }
}

