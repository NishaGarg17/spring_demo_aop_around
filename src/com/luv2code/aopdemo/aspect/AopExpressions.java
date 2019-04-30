package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
	// Pointcut declaration for dao package
	@Pointcut("execution(* com.luv2code.aopdemo.*.*.*(..))")
	public void forDaoPackage() {
	}

	// Create Pointcut for getter methods
	@Pointcut("execution(* com.luv2code.aopdemo.*.*.get*(..))")
	public void getter() {
	}

	// Create Pointcut for setter methods
	@Pointcut("execution(* com.luv2code.aopdemo.*.*.set*(..))")
	public void setter() {
	}

	// Create Pointcut to include package.. exclude getters and setters
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDAOPackageNoGeterSetter() {
	}
}
