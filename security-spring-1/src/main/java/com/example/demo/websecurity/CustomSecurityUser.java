package com.example.demo.websecurity;

//import java.util.HashSet;
import java.util.Set;

//import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.domain.Usersdetails;

public class CustomSecurityUser extends Usersdetails implements UserDetails {

	
	private static final long serialVersionUID = 8373998487772881696L;

	public CustomSecurityUser(Usersdetails usersdetails) {
		this.setAuthorities(usersdetails.getAuthorities());
		this.setId(usersdetails.getId());
		this.setName(usersdetails.getName());
		this.setPassword(usersdetails.getPassword());
		this.setUsername(usersdetails.getUsername());
		
		
	}

	@Override
	public Set<Authority> getAuthorities() {
	
		return super.getAuthorities();
		
	}

	@Override
	public String getPassword() {
		
		return super.getPassword();
	}

	@Override
	public String getUsername() {
	
		return super.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
	
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
