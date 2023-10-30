package com.export2excel.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.export2excel.model.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable>{
	
	

}
