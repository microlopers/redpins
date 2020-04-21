package com.microlopers.redpins.carlogs.entity;

public class CarDetails {
    private long id;
    private String licencePlate;

    public CarDetails() {
        this.id = 0;
        this.licencePlate = null;
    }

    public CarDetails(long id, String licencePlate) {
        this.id = id;
        this.licencePlate = licencePlate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}
