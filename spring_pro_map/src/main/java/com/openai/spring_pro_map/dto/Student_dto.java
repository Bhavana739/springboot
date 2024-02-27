package com.openai.spring_pro_map.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentdetails")
public class Student_dto {
	
	@Id
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String email;
	private String cname;
	
	@OneToOne
	private Course_dto dto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Course_dto getDto() {
		return dto;
	}

	public void setDto(Course_dto dto) {
		this.dto = dto;
	}

	@Override
	public String toString() {
		return "Student_dto [id=" + id + ", name=" + name + ", email=" + email + ", cname=" + cname + ", dto=" + dto
				+ "]";
	}
	
	

}
