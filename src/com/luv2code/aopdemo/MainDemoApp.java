package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// read the spring java config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

		// get the membership bean from the spring container
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		// call the business method
		// accountDAO.addAccount();

		Account account = new Account("Madu", "Platinum");
		
		// accountDAO.addAccount(account);
		
		accountDAO.addAccount(account, true);
		accountDAO.doWork();
		accountDAO.setName("foobar");
		accountDAO.setServiceCode("ER2010464");
		
		System.out.println("\nAccount Name is: " + accountDAO.getName());
		System.out.println("\nService Code is: " + accountDAO.getServiceCode());
		// call the membership business method
		// membershipDAO.addAccount();
		membershipDAO.addAccountByMember();
		membershipDAO.goToSleep();
		// close the context
		context.close();

	}

}
