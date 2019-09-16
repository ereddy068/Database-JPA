package com.example.demo.topic.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topic.Topic;

@RestController
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topic/{id}/course")
	public List<Course> getCourses(@PathVariable  Integer id) {
		return courseService.getAllTopics(id);
	}
	
	@RequestMapping("/topic/{id}/course/{courseId}")
	public Optional<Course> getCourseById(@PathVariable  Integer id) {
		return courseService.getTopicById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST ,  value = "/topic/{topicId}/course")
	public void addCourse(@RequestBody Course course,@PathVariable Integer topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT ,  value = "/topic/{topicId}/course{id}")
	public void updateCOurse(@RequestBody Course course , @PathVariable Integer topicId) {
		course.getTopic().setId(topicId);
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE ,  value = "/topic/{topicId}/course/{id}")
	public void deleteCourseById(@PathVariable  Integer id) {
		
		courseService.deleteCourseById(id);
	}
}
