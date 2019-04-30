package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	public String getName() {
		System.out.println(getClass() + ": in getName()");
		return name;
	}
	public void setName(String name) {
		System.out.println(getClass() + ": in setName()");
		this.name = name;
	}
	public String getServiceCode() {
		System.out.println(getClass() + ": in getServiceCode()");
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setSericeCode()");
		this.serviceCode = serviceCode;
	}
	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	public boolean doWork() {
		System.out.println(getClass() + ": DO YOUR WORK");
		return false;
	}
	

	public List<Account> findAccounts(boolean tripWire) {
		// for academic purpose...simulate an exception
		if(tripWire == true) {
			throw new RuntimeException("No Soup for you!");
		}
		List<Account> myAccountList = new ArrayList<Account>();
		// create sample accounts
		Account temp1 = new Account("John","Silver");
		Account temp2 = new Account("Madu","Platinum");
		Account temp3 = new Account("Luca","Gold");
		// add them to our account list
		myAccountList.add(temp1);
		myAccountList.add(temp2);
		myAccountList.add(temp3);
		return myAccountList;
	}
}
