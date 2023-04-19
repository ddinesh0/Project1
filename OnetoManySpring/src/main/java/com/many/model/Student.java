package com.many.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer std_id;
	private String std_name;
	private Integer std_age;
	private Integer std_class;
	
	public Integer getStd_id() {
		return std_id;
	}
	public void setStd_id(Integer std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public Integer getStd_age() {
		return std_age;
	}
	public void setStd_age(Integer std_age) {
		this.std_age = std_age;
	}
	public Integer getStd_class() {
		return std_class;
	}
	public void setStd_class(Integer std_class) {
		this.std_class = std_class;
	}
	
	
	

}
