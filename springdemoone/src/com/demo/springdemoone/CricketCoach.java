package com.demo.springdemoone;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setter:email");
		this.emailAddress = emailAddress;
	}



	public void setTeam(String team) {
		System.out.println("inside setter:team");
		this.team = team;
	}



	public CricketCoach() {
		System.out.println("inside no arg constructor:cricket caoch");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practise fast bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
