package com.boot.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Component;

@Service
public class Consumer {
	private final Logger logger = LoggerFactory.getLogger(Consumer.class);
	
	@KafkaListener(topics="test",groupId="group_id")
	public void consume(String message) {
		
		logger.info(String.format("#### -> Consumed message -> %s", message));
		
	}
	

}
