package com.demo.springdemoone;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "just do it "+fortuneService.getFortune();
	}
	
	//add init method
	
	public void doMyStartupStuff() {
		System.out.println("Trackcoach:inside method doMyStartupStuff");
	}
	//add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("Trackcoach:inside method doMyCleanupStuff");
	}
	

}
