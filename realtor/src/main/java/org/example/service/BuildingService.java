package org.example.service;

import org.example.dto.BuildingDTO;
import org.example.entity.Building;
import org.example.repository.BuildingRepository;
import org.example.util.BooleanConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BuildingService {
    @Autowired
    protected BuildingRepository buildingRepository;
    @Autowired
    protected BooleanConverter booleanConverter;

    public Building transformerBuildingDTO(BuildingDTO buildingDTO) {
        Building building = new Building();
        building.setDeveloperId(buildingDTO.getDeveloperId());
        building.setAddress(buildingDTO.getAddress());
        building.setApartment(buildingDTO.getApartment());
        building.setYear(buildingDTO.getYear());
        building.setBasement(booleanConverter.convertToEntityAttribute(buildingDTO.getBasement()));
        return building;
    }
}
