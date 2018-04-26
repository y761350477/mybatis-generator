package com.demo.testmybatis;

public class TUser {
    private Integer tId;

    private String tName;

    private Byte tAge;

    private String tAddress;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Byte gettAge() {
        return tAge;
    }

    public void settAge(Byte tAge) {
        this.tAge = tAge;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress == null ? null : tAddress.trim();
    }
}