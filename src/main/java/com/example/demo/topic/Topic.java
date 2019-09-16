package com.example.demo.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	
	@Id
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Topic() {
		
	}

	private String topic;
	
	private String description;

	

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Topic(Integer id, String topic, String description) {
		super();
		this.id = id;
		this.topic = topic;
		this.description = description;
	}
	
	
	

}
