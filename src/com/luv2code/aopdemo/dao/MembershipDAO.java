package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	//public void addAccount()
	/*public void addAccountByMember() {
		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
	}*/
	public boolean addAccountByMember() {
		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
		return true;
	}
	public boolean goToSleep() {
		System.out.println(getClass() + ": I am going to Sleep");
		return true;
	}
}
