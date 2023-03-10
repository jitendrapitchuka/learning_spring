package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		
		System.out.println(result);
		
		
		context.close();

	}

}
