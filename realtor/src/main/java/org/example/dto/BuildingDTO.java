package org.example.dto;


import java.util.Objects;

public class BuildingDTO {
    private int id;
    private String address;
    private int year;
    private int apartments;
    private boolean basement;
    private Integer developer;

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

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }

    public boolean isBasement() {
        return basement;
    }

    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    public Integer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Integer developer) {
        this.developer = developer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingDTO that = (BuildingDTO) o;
        return id == that.id && year == that.year && apartments == that.apartments && basement == that.basement && Objects.equals(address, that.address) && Objects.equals(developer, that.developer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, year, apartments, basement, developer);
    }
}
