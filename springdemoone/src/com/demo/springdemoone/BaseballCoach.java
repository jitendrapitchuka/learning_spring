package com.demo.springdemoone;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30min on batting practise";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
