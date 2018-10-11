package com.eg.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eg.activemq.jms.producer.JmsProducer;

@RestController
public class WebController {
	
	@Autowired
	JmsProducer jmsProducer;
	
	//@RequestMapping(value="/produce")
	@RequestMapping("/")
	public String produce() {//@RequestParam("msg")String msg){
	    
		jmsProducer.send("Hello how are you?");
		return "Message published";
	}
}
