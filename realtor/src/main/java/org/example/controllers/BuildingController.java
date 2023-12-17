package org.example.controllers;

import org.example.dto.BuildingDTO;
import org.example.entity.Developer;
import org.example.repository.BuildingRepository;
import org.example.repository.DeveloperRepository;
import org.example.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BuildingController {
    @Autowired
    protected BuildingRepository buildingRepository;
    @Autowired
    protected DeveloperRepository developerRepository;
    @Autowired
    protected BuildingService buildingService;

    @GetMapping("/realtor/buildinglist")
    public String buildingList(@RequestParam("id") int id, Developer developer, ModelMap modelMap) {
        modelMap.put("developer", developer);
        modelMap.put("building", buildingRepository.findBuildingByDeveloperId(id));
        return "/realtor/buildinglist";
    }

    @GetMapping("/createbuilding")
    public String addBuilding(ModelMap modelMap) {
        modelMap.addAttribute("building", new BuildingDTO());
        return "/createbuilding";
    }

    @PostMapping("/createbuilding")
    public String saveBuilding(BuildingDTO buildingDTO) {
        buildingRepository.save(buildingService.transformerBuildingDTO(buildingDTO));
        return "/realtor/building";
    }
}
