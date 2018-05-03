package com.example.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	
	@Autowired
	AppService appService;
	
	@GetMapping("/hello")
	public String sayHello() {
		return appService.sayHello();
	}
}
