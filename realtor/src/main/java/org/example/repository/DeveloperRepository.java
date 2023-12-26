package org.example.repository;

import org.example.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Integer> {
    Developer findDeveloperById(int id);
}
