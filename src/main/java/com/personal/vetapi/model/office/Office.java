package com.personal.vetapi.model.office;

import javax.persistence.*;

@Entity(name = "offices")
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long officeId;

    @Column(name = "office_name", nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false, length = 5)
    private String zipCode;
    @Column(nullable = false, length = 10)
    private String phoneNumber;

    public Office() {};

    public Office(String name, String address, String city, String state, String zipCode, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    };

    public Long getOfficeId() {
        return officeId;
    };

    public Office setOfficeId(Long officeId) {
        this.officeId = officeId;
        return this;
    };

    public String getName() {
        return name;
    };

    public Office setName(String name) {
        this.name = name;
        return this;
    };

    public String getAddress() {
        return address;
    };

    public Office setAddress(String address) {
        this.address = address;
        return this;
    };

    public String getCity() {
        return city;
    };

    public Office setCity(String city) {
        this.city = city;
        return this;
    };

    public String getState() {
        return state;
    };

    public Office setState(String state) {
        this.state = state;
        return this;
    };

    public String getZipCode() {
        return zipCode;
    };

    public Office setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    };

    public String getPhoneNumber() {
        return phoneNumber;
    };

    public Office setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    };
};
