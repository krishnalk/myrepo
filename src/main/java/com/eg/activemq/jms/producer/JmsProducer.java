package com.eg.activemq.jms.producer;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${jsa.activemq.queue}")
	String queue;
	
	public void send(String msg){
		System.out.println("The message published is : "+msg);
		jmsTemplate.convertAndSend(queue, msg);
	}
}