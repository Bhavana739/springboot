package com.openai.spring_pro_map.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.openai.spring_pro_map.dto.Student_dto;
import com.openai.spring_pro_map.repository.Student_repo;

@Component
public class Student_dao {
	
	@Autowired
	Student_repo rep;

	public String inserts(Student_dto dto) {
		rep.save(dto);
		return "data inserted";
	}

	public Optional<Student_dto> fetchstudentById(int id) {
		return rep.findById(id);
	}

	public List<Student_dto> fetchAllstudent() {
		List<Student_dto> list = rep.findAll();
		return list;
	}
	
//	public Optional<Stude> fbyid(){
//		
//	}
//	

}
