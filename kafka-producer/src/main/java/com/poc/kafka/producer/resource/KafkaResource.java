package com.poc.kafka.producer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.kafka.producer.service.KafkaSender;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaResource {

	@Autowired
	KafkaSender kafkaSender;
	
	
	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);

		return "Message sent to the Kafka Topic Successfully";
	}	
	
}
