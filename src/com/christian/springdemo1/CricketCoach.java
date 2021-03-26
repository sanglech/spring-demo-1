package com.christian.springdemo1;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("In cricket coach no arg-constructor");
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "SIXXXXERRR";
	}

	public FortuneService getFortuneService() {
		System.out.println("In cricket coach in getter fortune method");
		return fortuneService;
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In cricket coach Setter fortune method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyFortune() {
		return "Swag on em "+fortuneService.getFortune();
	}
	
	public String getDailyFortune(int day) {
		return "Remeber to Swag on em. "+fortuneService.getFortune(day);
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("In cricket coach Setter email method");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("In cricket coach Setter team method");
		this.team = team;
	}

}
