package com.demo.module;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Integer>{

}
