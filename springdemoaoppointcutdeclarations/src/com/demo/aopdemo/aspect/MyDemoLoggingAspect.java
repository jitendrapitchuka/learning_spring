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
	
	
	@Pointcut("execution(* com.demo.aopdemo.dao.*.get*(..))")
	private void getter() {}
	
	@Pointcut("execution(* com.demo.aopdemo.dao.*.set*(..))")
	private void setter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetSet() {}
	
	@Before("forDaoPackageNoGetSet()")
	public void beforeAddAccount() {
		System.out.println("calling before target object called");
	}
	
	@Before("forDaoPackageNoGetSet()")
	public void performApiAnalysis() {
		System.out.println("performing api analysis");
	}
	
}
