package com.yash.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainTest {

	public static void main(String[] args) {
ApplicationContext objAC=new ClassPathXmlApplicationContext("applicationContext.xml");
SetterMessage obj=(SetterMessage) objAC.getBean("obj5");
obj.show();
	}

}
