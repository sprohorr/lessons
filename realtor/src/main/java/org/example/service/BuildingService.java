package org.example.service;

import org.example.dto.BuildingDTO;
import org.example.entity.Building;
import org.example.repository.BuildingRepository;
import org.example.repository.DeveloperRepository;
import org.example.util.TransformerDtoBuilding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BuildingService {
    @Autowired
    protected BuildingRepository buildingRepository;
    @Autowired
    DeveloperRepository developerRepository;
    @Autowired
    protected TransformerDtoBuilding transformerDtoBuilding;

    public Building createBuilding(int id, Building building) {
        building.setDeveloper(developerRepository.findDeveloperById(id));
        building.setAddress(building.getAddress());
        building.setYear(building.getYear());
        building.setApartments(building.getApartments());
        building.setBasement(building.isBasement());
        return buildingRepository.save(building);
    }

    public List<Building> findBuildingByDeveloper(int id) {
        return buildingRepository.findByDeveloperId(id);
    }

    public Building findBuildingById(int id) {
        return buildingRepository.findBuildingById(id);
    }

    public void editBuilding(Building building, BuildingDTO buildingDTO) {
        building.setAddress(buildingDTO.getAddress());
        building.setYear(buildingDTO.getYear());
        building.setApartments(buildingDTO.getApartments());
        building.setBasement(buildingDTO.isBasement());
        buildingRepository.save(building);
    }
}
