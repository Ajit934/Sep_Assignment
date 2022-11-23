package com.yash.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainTest
{
	public static void main(String[] args)
	{

	ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext2.xml"); 
	Rectangle rect =(Rectangle) objAC.getBean("rectangleBean");
	System.out.println();
	rect.areaofRec();
	}
}
