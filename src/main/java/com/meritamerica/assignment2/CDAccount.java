package com.meritamerica.assignment2;

import java.time.LocalDate;;

public class CDAccount extends BankAccount{
	private long accountNumber;
	private int term;
	private double interestRate;
	private double balance;
	private LocalDate startDate; 
	
	
	public CDAccount(CDOffering offering, double balance) {
		super(balance, offering.getInterestRate());
		this.term = offering.getTerm();
		accountNumber = MeritBank.getNextAccountNumber();
		this.startDate = LocalDate.now();
	}

	public int getTerm() {
		return term;
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
