package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount {
	private long accountNumber;
	private double balance;
	private double interestRate;
	
	public SavingsAccount(double startingBalance) {
		super(startingBalance);
	}
	/*
	public String toString() {
		return "Savings Account Balance: $" + balance + "\n" +
				"Savings Account Interest Rate: " + interestRate + "\n" +
				"Savings Acount Balance in 3 Years: $" + futureValue(3);
	}*/
}