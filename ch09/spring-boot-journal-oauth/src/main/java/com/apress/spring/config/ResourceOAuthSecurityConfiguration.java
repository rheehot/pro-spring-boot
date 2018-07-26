package com.apress.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableAuthorizationServer
@EnableResourceServer
public class ResourceOAuthSecurityConfiguration extends ResourceServerConfigurerAdapter{

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		   .antMatchers("/").permitAll()
		   .antMatchers("/api/**").authenticated();
	}
	
}
//security.oauth2.client.clientId = 66007335-1e67-4e89-9a12-aaed4390c16e
//security.oauth2.client.secret = 140e8693-d6c0-4fea-b5e1-ad8e13ed5a9a