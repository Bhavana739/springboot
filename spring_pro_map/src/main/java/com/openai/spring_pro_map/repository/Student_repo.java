package com.openai.spring_pro_map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openai.spring_pro_map.dto.Student_dto;

@Repository
public interface Student_repo extends JpaRepository<Student_dto, Integer> {
	

}
