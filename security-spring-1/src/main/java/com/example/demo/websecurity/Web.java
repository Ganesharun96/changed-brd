package com.example.demo.websecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Web extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userDetailsService;
	


	@Bean
	public PasswordEncoder getpass()
	{
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.userDetailsService(userDetailsService)
		.passwordEncoder(getpass());
		
		
//		auth.inMemoryAuthentication()
//		.passwordEncoder(getpass())
//		.withUser("ganesh")
//		.password(getpass().encode("ganesh"))
//		.roles("User");
	}


@Override
	protected void configure(HttpSecurity http) throws Exception {
	http
//	http.csrf().disable()
	.authorizeRequests()
	.antMatchers("/").permitAll()
	.antMatchers("/register").permitAll()
	.antMatchers("/admin").hasRole("Admin")
	.anyRequest().hasRole("User").and()
 .formLogin()   
    .loginPage("/login")
    .defaultSuccessUrl("/success")
   .permitAll()
   .and()
   .logout()
   .logoutUrl("/logout")
   .permitAll();
	
}

	
	
}
