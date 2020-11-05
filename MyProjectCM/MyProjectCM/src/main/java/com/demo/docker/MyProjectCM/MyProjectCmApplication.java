package com.demo.docker.MyProjectCM;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class MyProjectCmApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
		}
	
	
	private String senderUsername ="Shivi";
	
	
	
	@GetMapping("/helloCM")
	public String helloCM() {
		return "Hello World::"+senderUsername;
	}  
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyProjectCmApplication.class, args);
	}

}
