package com.microlopers.redpins.carlogs.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="car")
public class Car  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name= "licencePlateId")
    private String licencePlateId;

    @Column(name= "brand")
    private String brand;

    @Column(name = "color")
    private String color;

    public Car() {
        super();
    }

    public Car(String licencePlateId, String brand, String color) {
        super();
        this.licencePlateId = licencePlateId;
        this.brand = brand;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLicencePlateId() {
        return licencePlateId;
    }

    public void setLicencePlateId(String licencePlateId) {
        this.licencePlateId = licencePlateId;
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
