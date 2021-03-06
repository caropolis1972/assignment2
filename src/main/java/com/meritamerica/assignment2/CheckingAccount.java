package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{
	private long accountNumber;
	private double balance;
	private double interestRate;
	
	public CheckingAccount(double openingBalance) {
		super(openingBalance);
	}
	
}