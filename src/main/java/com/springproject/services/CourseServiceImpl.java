package com.springproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dao.CourseDao;
import com.springproject.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

//	public List<Course> list = new ArrayList<>();
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
//		list.add(new Course(121, "java", "one of the best language"));
//		list.add(new Course(1001, "C", "one of the fastest"));
//		list.add(new Course(12, "C++", "baap of all"));
	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
//		return list;
	}
	
	@Override
	public Course getCourse(long id) {
//		Course c = null;
//		for(Course course:list) {
//			if(course.getId()==id) {
//				c=course;
//				break;
//			}
//		}
//		return c;
		return courseDao.getOne(id);
	}

	@Override
	public Course addCourse(Course course) {
//		this.list.add(course);
//		return course;
		return courseDao.save(course);
	}

	@Override
	public Course updateOneCourse(Course course) {
//		for(Course courseee: list) {
//			if(courseee.getId()==course.getId()) {
//				courseee.setId(course.getId());
//				courseee.setDescription(course.getDescription());
//				courseee.setTitle(course.getTitle());
//			}
//		}
//		return course;
			return courseDao.save(course);
	}

	@Override
	public void deleteOneCourse(long id) {
//		for(Course courseee: list) {
//			if(courseee.getId()==id) {
//				list.remove(courseee);
//			}
//		}
		courseDao.deleteById(id);
	}
}
