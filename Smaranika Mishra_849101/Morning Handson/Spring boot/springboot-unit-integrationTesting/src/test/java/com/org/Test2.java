package com.org;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
public class Test2 {

	
	@Autowired
	private MockMvc mockmvc;
	
	@Test
	public void statusShouldBe202() throws Exception
	{
		this.mockmvc.perform(get("/hello")).andExpect(status().isAccepted());
	}
	@Test
	public void contentShouldHaveSomeMessage() throws Exception
	{
		this.mockmvc.perform(get("/hello")).andExpect(content().string(containsString("Welcome user")));
	}
}
