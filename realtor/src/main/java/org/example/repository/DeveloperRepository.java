package org.example.repository;

import org.example.dto.DeveloperDTO;
import org.example.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeveloperRepository extends JpaRepository<Developer, Integer> {
    List<Developer> findAll();

    DeveloperDTO findDeveloperById(int id);
}
