package com.example.demo.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topic")
	public List<Topic> getTopics() {
		
		return topicService.getAllTopics();
	}

	
	@RequestMapping("/topic/{id}")
	public Optional<Topic> getTopicById(@PathVariable  Integer id) {
		
		return topicService.getTopicById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST ,  value = "/topic")
	public void addTopic(@RequestBody Topic topic) {
		
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT ,  value = "/topic/{id}")
	public void updateTopic(@RequestBody Topic topic , @PathVariable Integer id) {
		
		topicService.updateTopic(topic,id);
	}


	
	@RequestMapping(method = RequestMethod.DELETE ,  value = "/topic/{id}")
	public void deleteTopicById(@PathVariable  Integer id) {
		
		topicService.deleteTopicById(id);
	}
}
