package com.meritamerica.assignment2;

public abstract class BankAccount {
	private long accountNumber;
	private double balance;
	private double interestRate;
	
	public BankAccount() {
		
	}
	
	public BankAccount(double startingBalance) {
		this.balance = startingBalance;
	}
	
	public BankAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
		MeritBank.getNextAccountNumber();
	}
	
	public BankAccount(long accountNumber, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public boolean withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else return false;
	}
	
	double futureValue(double years) {
		double futureValue = (balance * Math.pow((1+interestRate), years));
		return futureValue;
	}
}
