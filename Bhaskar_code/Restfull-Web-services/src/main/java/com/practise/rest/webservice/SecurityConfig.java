package com.practise.rest.webservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) {
		
		http.authorizeHttpRequests(authotize -> authotize.anyRequest().authenticated());
		http.httpBasic(Customizer.withDefaults());
		http.csrf(csrf -> csrf.disable());
		return http.build();
	}
}
