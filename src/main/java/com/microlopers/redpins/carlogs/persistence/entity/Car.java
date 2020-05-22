package com.microlopers.redpins.carlogs.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="car")
public class Car  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name= "licenceplate")
    private String licencePlate;

    @Column(name= "brand")
    private String brand;

    @Column(name = "color")
    private String color;

    public Car() {
        super();
    }

    public Car(String licencePlate, String brand, String color) {
        super();
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.color = color;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
