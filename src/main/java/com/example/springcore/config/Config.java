package com.example.springcore.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
@Scope("prototype")
public class Config {

	 @Value("${app.message}")
	public String printmssgvar;
	
	@Bean
	public String printmessage() {
		return printmssgvar;
	}
	@Bean
	@Qualifier("description")
	@Lazy
	public String descriptionMethod() {
		return "spring core demo";
	}
	
	
}
