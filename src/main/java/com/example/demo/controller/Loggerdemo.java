package com.example.demo.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Loggerdemo {
	
  Logger logger = LoggerFactory.getLogger(Loggerdemo.class);

	
	@RequestMapping("/")
	public String home() {
		
		logger.info("welcome in method");
		return "Welcome in spring boot application";
	}

	@GetMapping("/test/{name}")
	public String method(@PathVariable String name) {
		
		logger.debug("request{}",name);
		
		String response = "Hi" + name+ "welcome in java";
		logger.debug("response{}",response);
		
		return response;
		
	}
	
	
	
	
	
}
