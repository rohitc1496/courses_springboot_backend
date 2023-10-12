package com.springproject.services;

import java.util.List;

import com.springproject.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long id);
	public Course addCourse(Course course);
	public Course updateOneCourse(Course course);
	public void deleteOneCourse(long id);
}
