package com.example.demo.topic.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CoursePersistance coursePersistance;
	
	
	public List<Course> getAllTopics(Integer id){
		
		//return list;
		List<Course> courses= new ArrayList<Course>();
		 coursePersistance.findByTopicId(id).forEach(courses::add);
		 return courses;
	}
	
	public Optional<Course> getTopicById(Integer id){
		return coursePersistance.findById(id);
			
	}

	public void addCourse(Course course) {
		coursePersistance.save(course);
	}

	public void updateCourse(Course course) {
		coursePersistance.save(course);

	}

	public void deleteCourseById(Integer id) {
		 coursePersistance.deleteById(id);;
	}
}
