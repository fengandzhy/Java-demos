package org.zhouhy.java;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Student {

    @JsonProperty("name")
    private String trueName;

    @JsonProperty("addresses")
    private List<Address> addresses;

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
