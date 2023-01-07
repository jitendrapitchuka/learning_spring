package com.demo.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

public void addAccount() {
		
		System.out.println(getClass()+" Doing my work Memership account");
	}

public void goToSleep() {
	System.out.println("going to sleep");
}
}
