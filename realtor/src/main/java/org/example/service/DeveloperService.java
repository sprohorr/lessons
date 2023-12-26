package org.example.service;

import org.example.dto.DeveloperDTO;
import org.example.entity.Developer;
import org.example.repository.DeveloperRepository;
import org.example.util.TransformerDtoDeveloper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {
    @Autowired
    protected DeveloperRepository developerRepository;
    @Autowired
    protected TransformerDtoDeveloper transformerDTO;

    public List<Developer> findAll() {
        return developerRepository.findAll();
    }

    public Developer findDeveloper(int id) {
        return developerRepository.findDeveloperById(id);
    }

    public Developer createDeveloper(DeveloperDTO developerDTO) {
        return developerRepository.save(transformerDTO.saveDtoTransformDeveloper(developerDTO));
    }

    public Developer editDeveloper(int id, DeveloperDTO developerDTO) {
        Developer developer = developerRepository.findDeveloperById(id);
        return developerRepository.save(transformerDTO.editDtoTransformDeveloper(developerDTO, developer));
    }
}
