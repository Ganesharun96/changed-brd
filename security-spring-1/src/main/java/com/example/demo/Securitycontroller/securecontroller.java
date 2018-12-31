package com.example.demo.Securitycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class securecontroller {

	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String method() {
		
		
		return "indexes";
		
	}
	@GetMapping("/success") 
	public String print() {
		return "printed";
		
	}
	
	

}
