package com.demo.springdemoone;

import java.util.Random;

public class HappyFortuneService implements FortuneService{
	
	String arr[]= {"today is first lucky","second lucky","third lucky"};
	@Override
	public String getFortune() {
		Random rand = new Random();

		int max=2;
		int min=0;

		int randomNum = rand.nextInt((max - min) + 1) + min;
		return arr[randomNum]	 ;
	}

}
