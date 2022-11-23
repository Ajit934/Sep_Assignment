package com.yash.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args)
	{
         ApplicationContext objAC=new ClassPathXmlApplicationContext("applicationContext.xml");
		
         ConstructorMessage obj=(ConstructorMessage) objAC.getBean("obj4");
         obj.show();
	}

}
