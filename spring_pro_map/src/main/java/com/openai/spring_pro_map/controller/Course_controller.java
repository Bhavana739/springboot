package com.openai.spring_pro_map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openai.spring_pro_map.dto.Course_dto;
import com.openai.spring_pro_map.service.Course_service;

@Controller
public class Course_controller {
	
	@Autowired
	Course_service ser;
	
	@RequestMapping("/cinsert")
	public String inscou() {
		return "courses";
	}
	
	@PostMapping("/cdetail")
	@ResponseBody
	public String inscourse(@ModelAttribute Course_dto dto) {
		return ser.inscourse(dto);
	}
	

}
