package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topics> allTopics(){
		return topicService.getAllTopic();
	}
	
	@RequestMapping("/topics/{id}")
	public Topics getOneTopic(@PathVariable String id) {
		return topicService.getOne(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void saveTopic(@RequestBody Topics topic) {
		topicService.saveTopic(topic);
	}
	
	@PutMapping("topics/{id}")
	public void updateTopic(@RequestBody Topics topic, @PathVariable String id) {
		topicService.update(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void delete(@PathVariable String id) {
		topicService.delete(id);
	}
	
	
	
	
}
