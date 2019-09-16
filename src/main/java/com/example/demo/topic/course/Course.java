package com.example.demo.topic.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.topic.Topic;

@Entity
public class Course {
	
	
	@Id
	private Integer id;
	private String course;
	private String description;

	@ManyToOne
	private Topic topic;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Course() {
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Course(Integer id, String course, String description,Integer topicId) {
		super();
		this.id = id;
		this.course = course;
		this.description = description;
		this.topic= new Topic(topicId, "", "");
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	

}
