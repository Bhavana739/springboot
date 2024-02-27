package com.openai.spring_pro_map.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.openai.spring_pro_map.dto.Course_dto;
import com.openai.spring_pro_map.repository.Course_repo;

@Component
public class Course_dao {
	
	@Autowired
	Course_repo rep;

	public String inscourse(Course_dto dto) {
		rep.save(dto);
		return "inserted";
	}

	
	public Course_dto fetchcourse(String cname) {
		Optional<Course_dto> co=rep.findById(cname);
		return co.get();
		
	}
}
