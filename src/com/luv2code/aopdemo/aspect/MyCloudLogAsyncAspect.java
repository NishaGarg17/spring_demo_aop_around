package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyCloudLogAsyncAspect {
	@Before("com.luv2code.aopdemo.aspect.AopExpressions.forDAOPackageNoGeterSetter()")//give fully qualified name if you want to access pointcut present in different class
	public void logToCloudAsync() {
		System.out.println("\n==========>>> Executing @Before Logging to cloud in Async fashion");
	}
}
