package com.christian.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring config xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle-applicationContext2.xml");
		
		//retrieve bean from spring config
		
		Coach theCoach=context.getBean("baseCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		//closing context
		context.close();
	}

}
