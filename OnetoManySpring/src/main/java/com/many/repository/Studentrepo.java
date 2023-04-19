package com.many.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.many.model.Student;

public interface Studentrepo extends JpaRepository<Student, Integer>{
	

}
