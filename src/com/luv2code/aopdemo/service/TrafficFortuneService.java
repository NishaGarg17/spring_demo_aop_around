package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class TrafficFortuneService {
	public String getFortune() {
		// simulate a delay
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		// return a fortune
		return "Expect heavy traffic this morning";
	}
}