package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
	private double CDBalance;
	private double combinedBalance;
	private CDAccount[] cdAccounts;
	private SavingsAccount[] savingsAccounts = new SavingsAccount[100];
	private CheckingAccount[] checkingAccounts;
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private int numberOfCheckingAccounts;
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public double getCDBalance(CDAccount cdaccount) {
		return cdaccount.getBalance();
	}
	
	public double getCheckingBalance(CheckingAccount checkingAccount) {
		return checkingAccount.getBalance();
	}
	
	public double getSavingsBalance(SavingsAccount savingsAccount) {
		return savingsAccount.getBalance();
	}
	
	public int getNumberOfCDAccounts() {
		return cdAccounts.length;
	}
	
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount tempAccount = new CDAccount(offering, openingBalance);
		return tempAccount;
	}
	
	public CDAccount addCDAccount(CDAccount cdAccount) {
		return cdAccount;
	}
	
	public int getNumberOfSavingsAccounts() {
		return savingsAccounts.length;
	}
	
	public int getNumberOfCheckingAccounts() {
		return checkingAccounts.length;
	}
	
	
	
	public double getCombinedBalance(SavingsAccount[] savingsArray, CheckingAccount[] checkingArray) {
		double total = 0;
		for (int i = 0; i < savingsArray.length; i++) {
			total += savingsArray[i].getBalance();
		}
		for (int i = 0; i < checkingArray.length; i++) {
			total += checkingArray[i].getBalance();
		}
		return total;
	}
	
}