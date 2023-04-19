package com.many.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.many.model.Student;
import com.many.repository.Studentrepo;

@RestController

@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	Studentrepo stdrepo;
	
	@PostMapping
	public Student create(@RequestBody Student student) {
		return stdrepo.save(student);
	}
	@GetMapping("/get")
	public List<Student> getall(){
		return stdrepo.findAll();
	}

}
