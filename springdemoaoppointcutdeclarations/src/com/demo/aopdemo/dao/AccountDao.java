package com.demo.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.demo.aopdemo.Account;

@Component
public class AccountDao {

	private String name;
	private String serviceCode;
	
	public void addAccount(Account theAccount,boolean vipFlag) {
		
		System.out.println(getClass()+" Doing my work addaccount");
	}
	
	public boolean doWork() {
		System.out.println(getClass()+" dowork()");
		return false;
	}

	public String getName() {
		System.out.println(getClass()+" getname()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass()+" setname()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass()+" getserivrcecode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass()+" setservicecode");
		this.serviceCode = serviceCode;
	}
	
	
}

