package com.openai.spring_pro_map.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.openai.spring_pro_map.dao.Student_dao;
import com.openai.spring_pro_map.dto.Course_dto;
import com.openai.spring_pro_map.dto.Student_dto;
import com.openai.spring_pro_map.service.Course_service;
import com.openai.spring_pro_map.service.Student_service;

@Controller
public class Student_controller {
	
	@Autowired
	Student_service ser;
	
	@Autowired
	Course_service cser;
	
	@RequestMapping("/shtml")
	public String stdhtml() {
		return "students";
	}
	
	@PostMapping("/si")
	@ResponseBody
	public String ins(@ModelAttribute Student_dto dto) {
		System.out.println(dto);
		String cn=dto.getCname();
		Course_dto cdto=cser.fetchcourse(cn);
		dto.setDto(cdto);
		return ser.inserts(dto);
	}
	
	@GetMapping("/fsid")
	public String fetchstudentById(@RequestParam int id,ModelMap map) {
		Student_dto sdto = ser.fetchstudentById(id);
		map.put("object", sdto);
		return "fetchById";
	}
	
	@GetMapping("/fetchallstudent")
    public String fetchAllstudent(ModelMap map) {
	 List<Student_dto> list=ser.fetchAllstudent();
	 map.put("objects", list);
	 return "fetchall";
 }

}
