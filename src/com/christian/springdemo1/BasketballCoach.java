package com.christian.springdemo1;

public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public BasketballCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Free Throws";
	}

	@Override
	public String getDailyFortune() {
		return "Do your best! "+fortuneService.getFortune();
	}

}
