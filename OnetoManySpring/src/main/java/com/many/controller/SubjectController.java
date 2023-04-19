package com.many.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.many.model.Subject;
import com.many.model.Teacher;
import com.many.repository.Subjectrepo;
import com.many.repository.Teacherrepo;

@RestController

@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	Subjectrepo subrepo;
	@Autowired
	Teacherrepo teachrepo;
	
	@PostMapping
	public Subject create(@RequestBody Subject subject) {
		return subrepo.save(subject);
	}
	@GetMapping("/get")
	public List<Subject> getall(){
		return subrepo.findAll();
	}
	
//	@PutMapping("/{sub_id}/teacher/{teacher_id}")
//	public Subject Assgin(@PathVariable int sub_id,@PathVariable int teach_id) {
//		Subject sub=subrepo.findAllById(sub_id).get();
//		Teacher teach= teachrepo.findAllById(teach_id);
//		sub.assign(teach);
//		return subrepo.save(sub);
//	}

}
