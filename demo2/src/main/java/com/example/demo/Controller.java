package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	

		@RequestMapping("/")
		public String index() {
			return "Greetings from Spring Boot!";
		}
		
		@RequestMapping("/msg")
		public String index1() {
			return "index1";
		}


	}


