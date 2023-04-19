package com.many.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.many.model.Teacher;

import com.many.repository.Teacherrepo;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	Teacherrepo teachrepo;
	
	@PostMapping
	public Teacher create(@RequestBody Teacher teach) {
		return teachrepo.save(teach);
	}
	@GetMapping("/get")
	public List<Teacher> getall(){
		return teachrepo.findAll();
	}

}
