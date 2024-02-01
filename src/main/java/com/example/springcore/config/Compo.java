package com.example.springcore.config;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Compo {

	public String displaymessage() {
		return "this is returned using component";
		
	}
	@PostConstruct
	public void init() {
		System.out.println("initalising the bean");
		
	}
	@PreDestroy
	public void destroy() {
		System.out.println("deleting the bean");
		
	}
	

}
