package com.yash.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainTest 
{

	public static void main(String[] args) 
	{
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp=(Employee) context.getBean("obj6");
		emp.print(); 
	}

}
