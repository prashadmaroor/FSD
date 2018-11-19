package com.fsdassignment.Fsdapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 class FsdController {

	@RequestMapping("/")
	public String defaultMethod()
	{
		return "Spring Boot Application Welcome to the FSD Assignment Page!!!";
	}
	
	@RequestMapping("/greeting")
	public String greetingMethod()
	{
		return "Spring Boot Application says: Greetings !! Requests Mapped working as expected";
	}
	
}
