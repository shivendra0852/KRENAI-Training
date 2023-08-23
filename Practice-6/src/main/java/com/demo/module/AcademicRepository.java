package com.demo.module;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Academic;

public interface AcademicRepository extends JpaRepository<Academic, Integer>{

}
