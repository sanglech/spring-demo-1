package com.christian.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach=context.getBean("baseCoach",Coach.class);
		Coach bballCoach=context.getBean("bballCoach",Coach.class);
		
		//call our fortunes
		System.out.println(theCoach.getDailyFortune());
		System.out.println(bballCoach.getDailyFortune());
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(bballCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
