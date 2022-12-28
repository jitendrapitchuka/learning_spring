package com.demo.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	
//	@Value("${foo.email}")
//	private String email;
//	
//	@Value("${foo.team}")
//	private String team;
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("inside no arg consstuctor:Tennis");
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside doMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside doMycleanupStuff");
	}
	/*
	@Autowired
	public void DoSomeCrazyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
*/

	/*
	@Autowired
	public TennisCoach(FortuneService theFortune) {
		this.fortuneService=theFortune;
	}
	*/
	@Override
	public String getDailyWorkout() {
//		System.out.println("checking email "+email);
		return "practise hard tennis daily";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
