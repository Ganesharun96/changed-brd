package com.example.demo.service;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

public class UserDetailsServiceTest {

	@Test
	public void generate_encrypted_password() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "ganesh";
	    String encodedPassword = encoder.encode(rawPassword);
	
	    
	    System.out.println(encodedPassword);
	    
	    assertThat(rawPassword, not(encodedPassword));
	}

}
