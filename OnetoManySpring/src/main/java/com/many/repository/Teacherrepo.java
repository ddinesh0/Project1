package com.many.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.many.model.Teacher;

public interface Teacherrepo extends JpaRepository<Teacher, Integer>{

	Teacher findAllById(int teach_id);

}
