package org.example.controllers;

import org.example.dto.BuildingDTO;
import org.example.entity.Building;
import org.example.service.BuildingService;
import org.example.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BuildingController {
    @Autowired
    protected BuildingService buildingService;
    @Autowired
    protected DeveloperService developerService;

    @GetMapping("/realtor/buildinglist")
    public String buildingList(@RequestParam("developer.id") int id, ModelMap modelMap) {
        modelMap.put("developer", developerService.findDeveloper(id));
        modelMap.put("building", buildingService.findBuildingByDeveloper(id));
        return "/realtor/buildinglist";
    }

    @GetMapping("/createbuilding")
    public String addBuilding(@RequestParam("developer.id") int id, ModelMap modelMap) {
        modelMap.put("developer", developerService.findDeveloper(id));
        modelMap.addAttribute("building", new Building());
        return "/createbuilding";
    }

    @PostMapping("/createbuilding")
    public String saveBuilding(@RequestParam("developer.id") int id, Building building, ModelMap modelMap) {
        buildingService.createBuilding(id, building);
        return "redirect:/realtor/list";
    }

    @GetMapping("/editbuilding")
    public String editBuilding(@RequestParam("building.id") int id, ModelMap modelMap) {
        modelMap.addAttribute("building", new BuildingDTO());
        modelMap.put("building", buildingService.findBuildingById(id));
        return "/editbuilding";
    }

    @PostMapping("/editbuilding")
    public String saveEditBuilding(@RequestParam("building.id") int id, BuildingDTO buildingDTO) {
        buildingService.editBuilding(buildingService.findBuildingById(id), buildingDTO);
        return "redirect:/realtor/list";
    }
}
