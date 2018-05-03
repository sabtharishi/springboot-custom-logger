package com.example.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppService {
	
	@Autowired
	RestTemplate restTemplate;

	@NewSpan
	public String sayHello() {
		String subject = restTemplate.getForObject("http://localhost:8090/v1/subjects", String.class);
		return "Hello";
	}
}
