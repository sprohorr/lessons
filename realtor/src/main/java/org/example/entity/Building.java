package org.example.entity;

import org.example.util.BooleanConverter;

import javax.persistence.*;
import java.util.Objects;

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
    @Column(name = "apartments")
    private int apartments;
    @Column(name = "basement")
    @Convert(converter = BooleanConverter.class)
    private boolean basement;
    @ManyToOne
    @JoinColumn(name = "developer_id")
    private Developer developer;

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

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return id == building.id && year == building.year && apartments == building.apartments && basement == building.basement && Objects.equals(address, building.address) && Objects.equals(developer, building.developer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, year, apartments, basement, developer);
    }
}
