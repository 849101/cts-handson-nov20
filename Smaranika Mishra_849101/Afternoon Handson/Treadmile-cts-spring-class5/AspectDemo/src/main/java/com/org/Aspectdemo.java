package com.org;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspectdemo {

	//can have multiple advice here
	@Before("execution(public void com.org.ServiceClass.store())")
	public void logger()
	{
	   System.out.println("Logger() is executed and it is an advice");
	}

}
