package com.example.demo.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicPersistance topicPersistance;
	
	
	public List<Topic> getAllTopics(){
		
		//return list;
		List<Topic> topics= new ArrayList<Topic>();
		 topicPersistance.findAll().forEach(topics::add);
		 return topics;
	}
	
	public Optional<Topic> getTopicById(Integer id){
		
		return topicPersistance.findById(id);
			
	}

	public void addTopic(Topic topic) {
		topicPersistance.save(topic);
	}

	public void updateTopic(Topic topic, int id) {
		topicPersistance.save(topic);

	}

	public void deleteTopicById(Integer id) {
		// TODO Auto-generated method stub
		 topicPersistance.deleteById(id);;
	}
}
