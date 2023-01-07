package com.demo.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.demo.aopdemo.Account;

@Component
public class AccountDao {

	public void addAccount(Account theAccount,boolean vipFlag) {
		
		System.out.println(getClass()+" Doing my work addaccount");
	}
	
	public boolean doWork() {
		System.out.println(getClass()+" dowork()");
		return false;
	}
}
