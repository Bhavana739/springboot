package com.openai.spring_pro_map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openai.spring_pro_map.dto.Course_dto;

@Repository
public interface Course_repo extends JpaRepository<Course_dto, String> {

}
