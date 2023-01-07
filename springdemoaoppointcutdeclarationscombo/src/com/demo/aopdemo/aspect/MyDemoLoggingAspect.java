package com.demo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

//	@Before("execution(public void add*())")
//	@Before("execution(public void addAccount())")
//	@Before("execution(public void com.demo.aopdemo.dao.AccountDao.addAccount())")

//	@Before("execution(* add*(com.demo.aopdemo.Account))")
//	@Before("execution(* add*(com.demo.aopdemo.Account,..))")
//	@Before("execution(* add*(..))")
	@Pointcut("execution(* com.demo.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Before("forDaoPackage()")
	public void beforeAddAccount() {
		System.out.println("calling before target object called");
	}
	
	@Before("forDaoPackage()")
	public void performApiAnalysis() {
		System.out.println("performing api analysis");
	}
	
}
