package com.example.demo.service;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Usersdetails;
import com.example.demo.repositories.UserRepositories;
import com.example.demo.websecurity.Authority;

@Service
public class UserService { 
	
	@Autowired
	private UserRepositories userrepo;

@Autowired
private PasswordEncoder passwordencoder;

	public Usersdetails save(Usersdetails usersdetails) {
		String encodedPassword =passwordencoder.encode(usersdetails.getPassword());
		usersdetails.setPassword(encodedPassword);
		
		Authority authority = new Authority();
	    authority.setAuthority("ROLE_User");
	    authority.setUsersdetails(usersdetails);
	    
	    usersdetails.getAuthorities().add(authority);

		return userrepo.save(usersdetails);
		
	}

}
