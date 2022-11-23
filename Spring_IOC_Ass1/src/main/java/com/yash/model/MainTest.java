package com.yash.model;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args)
	{

	ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	City objSCBean =(City) objAC.getBean("city");
	System.out.println();
	City objSCBean1 =(City) objAC.getBean("city1");
	 objSCBean.show();	
	 System.out.println();
	 objSCBean1.show();
	}
}
