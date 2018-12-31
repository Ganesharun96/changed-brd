package com.example.demo.Securitycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.Usersdetails;
import com.example.demo.service.UserService;

import ch.qos.logback.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy;

@Controller
public class loginController {
	@Autowired 
	private UserService userservice;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
//	@GetMapping("/login")
	public String login() {
		return "login";
		
	}
	
	
	@GetMapping("/register")
	  public String register (Model model) {
	    model.addAttribute("register", new Usersdetails());
	    return "register";
	  }

	@PostMapping("/register")
	public String registerpost(@ModelAttribute("register") Usersdetails usersdetails) {
		Usersdetails saved=	userservice.save(usersdetails);
//		System.out.println("non saved"+usersdetails);
//		System.out.println(" saved"+saved);
		
		return	"redirect:/login";
		
	}
}
