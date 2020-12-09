package com.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.org.HelloController;

@SpringBootTest
public class Test1 {

	@Autowired
	private HelloController controller;
	
	@Test
	public void testControllerMethod()
	{
		assertThat(controller).isNotNull();
	}
	
}
