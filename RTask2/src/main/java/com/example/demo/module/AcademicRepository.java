package com.example.demo.module;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Academic;

public interface AcademicRepository extends JpaRepository<Academic, Integer> {

}
