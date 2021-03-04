package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount {
	long accountNumber;
	private CDOffering offering;
	private int term;
	private double interestRate;
	private double balance;
	private Date startDate; 
	
	public CDAccount(CDOffering offering, double balance) {
		this.offering = offering;
		this.balance = balance;
	}
	

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public int getTerm() {
		return term;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	double futureValue(double years) {
		double futureValue = 1.0;
		futureValue = (balance * Math.pow((1+interestRate), years));
		return futureValue;
	}
}
