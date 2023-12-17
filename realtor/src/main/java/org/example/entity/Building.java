package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "building")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(name = "address")
    private String address;
    @Column(name = "year")
    private int year;
    @Column(name = "apartment")
    private int apartment;
    @Column(name = "basement")
    private boolean basement;
    @ManyToOne
    @JoinColumn(name = "developer_id")
    private Developer developerId;

    public Building() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public boolean isBasement() {
        return basement;
    }

    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    public Developer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Developer developerId) {
        this.developerId = developerId;
    }
}
