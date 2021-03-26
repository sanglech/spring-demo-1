package com.christian.springdemo1;

public class BaseballCoach implements Coach {
	
	//define private field
	private FortuneService fortuneService;
	
	public BaseballCoach () {
		
	}
	
	
	//define a constructor for dependancy injection
	public BaseballCoach (FortuneService _fortuneService) {
		fortuneService=_fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run you fool";
	}

	@Override
	public String getDailyFortune() {
		
		//use fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	
	//add init method
	public void doMyStartupStuff() {
		System.out.println("BaseballCoach: Do start up stuff");
	}
	
	
	//add destroy method
	public void doMyCleanUpStuff() {
		System.out.println("BaseballCoach: Do clean up stuff");
	}
	
}
