package com.christian.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");
		
		//retrieve bean from spring config
		
		Coach theCoach=context.getBean("baseCoach",Coach.class);
		Coach alphaCoach=context.getBean("baseCoach",Coach.class);
		
		//check if beans are the same
		if(theCoach==alphaCoach){
			System.out.println("They be the same");
		}else {
			System.out.println("They be not");
		}
		
		//closing context
		context.close();
	}

}
