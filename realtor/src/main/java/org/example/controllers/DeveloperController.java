package org.example.controllers;

import org.example.dto.DeveloperDTO;
import org.example.entity.Developer;
import org.example.repository.DeveloperRepository;
import org.example.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeveloperController {
    @Autowired
    protected DeveloperService developerService;
    @Autowired
    protected DeveloperRepository developerRepository;

    @GetMapping("/realtor/list")
    public String showDeveloper(ModelMap modelMap) {
        modelMap.put("developer", developerRepository.findAll());
        return "/realtor/list";
    }

    @GetMapping("/createdeveloper")
    public String addDeveloper(ModelMap model) {
        model.addAttribute("developer", new DeveloperDTO());
        return "/createdeveloper";
    }

    @PostMapping("/createdeveloper")
    public String saveDeveloper(ModelMap modelMap, DeveloperDTO developerDTO, Developer developer) {
        developerService.transformerDeveloperDTO(developerDTO);
        developerRepository.save(developer);
        modelMap.put("developer", developer);
        return "/successfullycreatedeveloper";
    }

    @GetMapping("/editdeveloper")
    public String editDeveloper(ModelMap modelMap, Developer developer) {
        modelMap.addAttribute("developer", developer);
        return "/editdeveloper";
    }

    @PostMapping("/editdeveloper")
    public String saveEditDeveloper(@RequestParam("id") int id) {
        developerService.editDeveloper(id);
        return "/realtor/list";
    }
}
