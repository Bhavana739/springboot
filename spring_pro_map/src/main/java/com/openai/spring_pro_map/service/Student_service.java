package com.openai.spring_pro_map.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openai.spring_pro_map.dao.Student_dao;
import com.openai.spring_pro_map.dto.Course_dto;
import com.openai.spring_pro_map.dto.Student_dto;

@Service
public class Student_service {
	
	@Autowired
	Student_dao dao;

	public String inserts(Student_dto dto) {
		return dao.inserts(dto);
	}
	
	public Student_dto fetchstudentById(int id) {
		  Optional<Student_dto> od = dao.fetchstudentById(id);
		 if(od.isPresent()) {
			 return od.get();
		 }
		 else {
			 return null;
		 }
	}

	public List<Student_dto> fetchAllstudent() {
		List<Student_dto> list=dao.fetchAllstudent();
		 if(list.isEmpty()) {
			 return null;
		 }
		 else
			 return list;
	}

}
