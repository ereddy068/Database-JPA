package com.example.demo.topic;

import org.springframework.data.repository.CrudRepository;

interface TopicPersistance extends CrudRepository<Topic, Integer> {

}
