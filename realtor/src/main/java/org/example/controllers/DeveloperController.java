package org.example.controllers;

import org.example.dto.DeveloperDTO;
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

    @GetMapping("/realtor/list")
    public String showDeveloper(ModelMap modelMap) {
        modelMap.put("developers", developerService.findAll());
        return "/realtor/list";
    }

    @GetMapping("/createdeveloper")
    public String addDeveloper(ModelMap model) {
        model.addAttribute("developer", new DeveloperDTO());
        return "/createdeveloper";
    }

    @PostMapping("/createdeveloper")
    public String saveDeveloper(ModelMap modelMap, DeveloperDTO developerDTO) {
        modelMap.put("developer", developerService.createDeveloper(developerDTO));
        return "redirect:/realtor/list";
    }

    @GetMapping("/editdeveloper")
    public String editDeveloper(@RequestParam("developer.id") int id, ModelMap modelMap) {
        modelMap.addAttribute("developer", new DeveloperDTO());
        modelMap.put("developer", developerService.findDeveloper(id));
        return "/editdeveloper";
    }

    @PostMapping("/editdeveloper")
    public String saveEditDeveloper(@RequestParam("developer.id") int id, ModelMap modelMap, DeveloperDTO developerDTO) {
        modelMap.put("developer", developerService.editDeveloper(id, developerDTO));
        return "redirect:/realtor/list";
    }
}
