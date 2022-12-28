package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		System.out.println("checking email "+email);
		return "Swim 1000meters daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
