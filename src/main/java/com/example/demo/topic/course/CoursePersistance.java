package com.example.demo.topic.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

interface CoursePersistance extends CrudRepository<Course, Integer> {
	
	List<Course> findByTopicId(Integer id);

}
