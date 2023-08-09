package com.example.demo.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Control {
	
	@Autowired
	private Emailservice Emailservice;
	
		@GetMapping("/sendmail")
		public String sendEmail() {
			Emailservice.sendSimpleEmail("ohmsethu0022@gmail.com","hi bro","va bro breakfast sapta polam.");
					 return "Email sent!"; 
		}
	}


