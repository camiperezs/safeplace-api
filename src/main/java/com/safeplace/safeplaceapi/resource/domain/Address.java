package com.safeplace.safeplaceapi.resource.domain;

public class Address {
    private Long id;
    private String province;
    private String city;
    private String street;
    private String streetNumber;
    private String apartment;
    private String floor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", apartment='" + apartment + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }

    public String getFullAddress() {
        return  province +
                ", " + city +
                ", " + street +
                " " + streetNumber +
                ", " + apartment +
                " " + floor;
    }
}
