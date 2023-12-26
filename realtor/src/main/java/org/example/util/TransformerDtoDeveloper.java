package org.example.util;

import org.example.dto.DeveloperDTO;
import org.example.entity.Developer;
import org.springframework.stereotype.Component;

@Component
public class TransformerDtoDeveloper {
    public Developer editDtoTransformDeveloper(DeveloperDTO developerDTO, Developer developer) {
        developer.setName(developerDTO.getName());
        developer.setEmail(developerDTO.getEmail());
        developer.setNameDirector(developerDTO.getNameDirector());
        return developer;
    }

    public Developer saveDtoTransformDeveloper(DeveloperDTO developerDTO) {
        Developer developer = new Developer();
        developer.setName(developerDTO.getName());
        developer.setEmail(developerDTO.getEmail());
        developer.setNameDirector(developerDTO.getNameDirector());
        return developer;
    }

}
