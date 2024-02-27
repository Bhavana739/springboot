package com.openai.spring_pro_map.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "coursedetails")
public class Course_dto {
	
	@Id
	private String cname;
	@Column(nullable = false)
	private int cfee;
	@Column(nullable = false)
	private int cdur;
	
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCfee() {
		return cfee;
	}
	public void setCfee(int cfee) {
		this.cfee = cfee;
	}
	public int getCdur() {
		return cdur;
	}
	public void setCdur(int cdur) {
		this.cdur = cdur;
	}
	@Override
	public String toString() {
		return "Course_dto [cname=" + cname + ", cfee=" + cfee + ", cdur=" + cdur + "]";
	}

}
