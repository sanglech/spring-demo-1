package com.christian.springdemo1;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create the object
		Coach theCoach =new BaseballCoach();
		Coach Coach2 =new BasketballCoach();
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(Coach2.getDailyWorkout());
	}

}
