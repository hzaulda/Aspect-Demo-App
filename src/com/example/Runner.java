package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				 new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AopTargetInterface aopTarget = 
				(AopTargetInterface) applicationContext.getBean("aopTarget"); 
		System.out.println(aopTarget.getMessage());

	}

}
