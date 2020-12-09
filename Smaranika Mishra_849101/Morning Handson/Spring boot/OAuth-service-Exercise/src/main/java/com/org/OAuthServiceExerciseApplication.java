package com.org;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@RestController
@EnableResourceServer
public class OAuthServiceExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthServiceExerciseApplication.class, args);
	}

	@RequestMapping(value="/user",produces =MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> userInfo(OAuth2Authentication oauth2){
		Map<String,Object> userinformation = new HashMap<>();
		userinformation.put("user",oauth2.getUserAuthentication().getPrincipal());
		userinformation.put("authorities",AuthorityUtils.authorityListToSet(oauth2.getUserAuthentication().getAuthorities()));
		return userinformation;
	}
}
