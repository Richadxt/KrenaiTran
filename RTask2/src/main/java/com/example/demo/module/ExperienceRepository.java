package com.example.demo.module;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long>{

}
