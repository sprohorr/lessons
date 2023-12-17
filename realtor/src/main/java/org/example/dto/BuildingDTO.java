package org.example.dto;


import org.example.entity.Developer;

public class BuildingDTO {
    private int id;
    private String address;
    private int year;
    private int apartment;
    private Character basement;
    private Developer developerId;

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

    public Character getBasement() {
        return basement;
    }

    public void setBasement(Character basement) {
        this.basement = basement;
    }

    public Developer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Developer developerId) {
        this.developerId = developerId;
    }
}
