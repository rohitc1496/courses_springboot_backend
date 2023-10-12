package com.springproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {
	
}
