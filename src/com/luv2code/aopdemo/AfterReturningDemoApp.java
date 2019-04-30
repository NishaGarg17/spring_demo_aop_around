package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		// read the spring java config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

		// Call findAccounts Method of classs Account DAO

		List<Account> accountList = accountDAO.findAccounts(false);
		
		// Display the Accounts
		System.out.println("\n\nMain Program: AfterReturningDemoApp");
		System.out.println("----------------------------");
		System.out.println(accountList);
		// close the context
		context.close();

	}

}
