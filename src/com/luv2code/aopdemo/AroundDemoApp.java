package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
		// read the spring java config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		System.out.println("\nMain Program : Around Demo App");
		System.out.println("Calling get forutne");
		System.out.println("\nMy fortune is: " + trafficFortuneService.getFortune());
		System.out.println("Finished");
		
		// close the context
		context.close();

	}

}
