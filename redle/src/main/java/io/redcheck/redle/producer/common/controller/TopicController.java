package io.redcheck.redle.producer.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/broker/topic")
	public String retrieveTopicInfo() {
		String topicInfo;
		
		topicInfo = "No topic available.";
		
		return topicInfo;
	}

}
