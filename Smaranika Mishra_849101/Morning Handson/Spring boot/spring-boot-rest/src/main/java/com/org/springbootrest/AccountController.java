package com.org.springbootrest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class AccountController {

	@RequestMapping(value="/balance",method=RequestMethod.GET,
			produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Account getBalance()
	{
		Account acc=new Account();
		acc.setAccountNo(23456);
		acc.setAmount(30000);
		return acc;
	}
	@RequestMapping(value="/balance",method=RequestMethod.PUT,
			produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Account getBalance2()
	{
		Account acc=new Account();
		acc.setAccountNo(123456);
		acc.setAmount(50000);
		return acc;
	}
	@DeleteMapping(value="/balance",
			produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Account getBalance3()
	{
		Account acc=new Account();
		acc.setAccountNo(123456);
		acc.setAmount(50000);
		return acc;
	}
	@RequestMapping(value="{accountNo}",method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance1(@PathVariable("accountNo") int accountNo)
	{
		Account account=new Account();
		account.setAccountNo(accountNo);
		account.setAmount((accountNo * 34));
		return account;
	}
}
