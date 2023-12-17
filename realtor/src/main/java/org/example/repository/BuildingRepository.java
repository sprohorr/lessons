package org.example.repository;

import org.example.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BuildingRepository extends JpaRepository<Building, Integer> {
    List<Building> findBuildingByDeveloperId(int id);
}
