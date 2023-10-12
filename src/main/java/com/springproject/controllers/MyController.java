package com.springproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.entities.Course;
import com.springproject.services.CourseService;

@RestController
@CrossOrigin
public class MyController {
	
	@Autowired
	public CourseService cs;
	
	@GetMapping("/")
	public ResponseEntity<String> okay() {
		return ResponseEntity.ok("okay i know");
	}
	
	//list of courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.cs.getCourses();
	}
	
	//get single course
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable("id") long id) {
		System.out.println(id);
		return this.cs.getCourse(id);
	}
	
	//add single course 
	@PostMapping("/courses")
	public Course addOneCourse(@RequestBody Course toAdd) {
		System.out.println(toAdd);
		return this.cs.addCourse(toAdd);
	}
	
	//update single course
	@PutMapping("/courses")
	public Course updateOneCourse(@RequestBody Course course) {
		System.out.println(course);
		return this.cs.updateOneCourse(course);
	}
	
	//delete single course
	@DeleteMapping("/courses/{id}")
	public String deleteOneCourse(@PathVariable long id) {
		this.cs.deleteOneCourse(id);
		return "yes deleted";
	}
}
