package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnalyticsAspect {
	@Before("com.luv2code.aopdemo.aspect.AopExpressions.forDAOPackageNoGeterSetter()") //give fully qualified name if you want to access pointcut present in different class 
	public void performApiAnalytics() {
		System.out.println("\n==========>>> Executing @Before Performing API Analytics()");
	}
}
