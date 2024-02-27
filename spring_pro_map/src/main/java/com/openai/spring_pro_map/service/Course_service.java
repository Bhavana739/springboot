package com.openai.spring_pro_map.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openai.spring_pro_map.dao.Course_dao;
import com.openai.spring_pro_map.dto.Course_dto;

@Service
public class Course_service {
	
	@Autowired
	Course_dao dao;

	public String inscourse(Course_dto dto) {
		return dao.inscourse(dto);
	}
	
	public Course_dto fetchcourse(String cname) {
		return dao.fetchcourse(cname);
	}

}
