package com.many.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.many.model.Subject;

public interface Subjectrepo  extends JpaRepository<Subject, Integer>{
	
	//Subject findAllById(int sub_id);

}
