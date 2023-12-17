package org.example.service;

import org.example.dto.DeveloperDTO;
import org.example.entity.Developer;
import org.example.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class DeveloperService {
    @Autowired
    protected DeveloperRepository developerRepository;

    public Developer transformerDeveloperDTO(DeveloperDTO developerDTO) {
        Developer developer = new Developer();
        developer.setName(developerDTO.getName());
        developer.setEmail(developer.getEmail());
        developer.setNameDirector(developerDTO.getNameDirector());
        return developer;
    }

    public Developer editDeveloper(@RequestParam("id") int id) {
        Developer developer = new Developer();
        DeveloperDTO developerDTO = developerRepository.findDeveloperById(id);
        transformerDeveloperDTO(developerDTO);
        developerRepository.save(developer);
        return developer;
    }
}
