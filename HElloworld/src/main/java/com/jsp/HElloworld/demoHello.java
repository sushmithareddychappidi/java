package com.jsp.HElloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoHello 
{
	@GetMapping("/hello")
	public String getHello()
	{
		return "Hello World";
	}
	@PostMapping("/hii")
	public String update()
	{
		return "Hello, World";
	}	
}
