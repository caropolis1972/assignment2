package com.meritamerica.assignment2;

import java.time.LocalDate;;

public class CDAccount {
	long accountNumber;
	private int term;
	private double interestRate;
	private double balance;
	private LocalDate startDate; 
	
	public CDAccount(CDOffering offering, double balance) {
		this.term = offering.getTerm();
		this.interestRate = offering.getInterestRate();
		this.balance = balance;
		this.accountNumber = MeritBank.getNextAccountNumber();
		this.startDate = LocalDate.now();
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

	public LocalDate getStartDate() {
		return startDate;
	}

	double futureValue(double years) {
		double futureValue = 1.0;
		futureValue = (balance * Math.pow((1+this.getInterestRate()), this.getTerm()));
		return futureValue;
	}
}
