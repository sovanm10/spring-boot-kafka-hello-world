package com.poc.kafka.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Value("${kafka.topic}")
	private String kafkaTopic;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void send(String message) {
		kafkaTemplate.send(kafkaTopic, message);
	}
}
