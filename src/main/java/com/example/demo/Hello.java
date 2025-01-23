package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController

public class Hello {
	@GetMapping("/")
	public String hello()
	{
		return "HELLO";
	}
}