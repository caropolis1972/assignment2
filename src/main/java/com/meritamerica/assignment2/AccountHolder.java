package com.meritamerica.assignment2;


public class AccountHolder {
	private double checkingBalance;
	private double savingsBalance;
	private double CDBalance;
	private double combinedBalance;
	private CDAccount[] cdAccounts = new CDAccount[10];
	private SavingsAccount[] savingsAccounts = new SavingsAccount[10];
	private CheckingAccount[] checkingAccounts = new CheckingAccount[10];
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private int numberOfCheckingAccounts = 0;
	private int numberOfSavingsAccounts = 0;
	private int numberOfCDAccounts = 0;
	
	public AccountHolder() {
		
	}
	
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
	public String getSSN() {
		return ssn;
	}
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public CheckingAccount addCheckingAccount(double openingBalance) {
		if (((this.getCheckingBalance() + this.getSavingsBalance()) + openingBalance < 250000)) {
			checkingAccounts[numberOfCheckingAccounts++] = new CheckingAccount(openingBalance);
			return checkingAccounts[numberOfCheckingAccounts];
		} else {
			return new CheckingAccount(openingBalance);
		}
	}
	
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		if ((this.getCheckingBalance() + this.getSavingsBalance()) + checkingAccount.getBalance() < 250000) {
			checkingAccounts[numberOfCheckingAccounts++] = checkingAccount;
			return checkingAccount;
		} else {
			return checkingAccount;
		}
	}
	
	public CheckingAccount[] getCheckingAccounts() {
		return checkingAccounts;
	}
	
	public int getNumberOfCheckingAccounts() {
		return numberOfCheckingAccounts;
	}
	
	public double getCheckingBalance() {
		double tempBalance = 0;
		for (int i = 0; i < (numberOfCheckingAccounts); i++) {
			tempBalance += checkingAccounts[i].getBalance();
		}
		checkingBalance = tempBalance;
		return checkingBalance;
	}
	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		if (((this.getCheckingBalance() + this.getSavingsBalance()) + openingBalance <= 250000)) {
			savingsAccounts[numberOfSavingsAccounts++] = new SavingsAccount(openingBalance);
			return savingsAccounts[numberOfSavingsAccounts];
		} else {
			return new SavingsAccount((openingBalance));
		}
	}
	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if ((this.getCheckingBalance() + this.getSavingsBalance()) + savingsAccount.getBalance() < 250000) {
			savingsAccounts[numberOfSavingsAccounts++] = savingsAccount;
			return savingsAccount;
		} else {
			return savingsAccount;
		}
	}
	
	public SavingsAccount[] getSavingsAccounts() {
		return savingsAccounts;
	}
	
	public int getNumberOfSavingsAccounts() {
		return numberOfSavingsAccounts;
	}
	
	public double getSavingsBalance() {
		double tempBalance = 0;
		for (int i = 0; i < (numberOfSavingsAccounts); i++) {
			tempBalance += savingsAccounts[i].getBalance();
		}
		savingsBalance = tempBalance;
		return savingsBalance;
	}
	
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		cdAccounts[numberOfCDAccounts++] = new CDAccount(offering, openingBalance);
		return cdAccounts[numberOfCDAccounts];
	}
	
	public CDAccount addCDAccount(CDAccount cdAccount) {
		cdAccounts[numberOfCDAccounts++] = cdAccount;
		return cdAccounts[numberOfCDAccounts];
	}
	
	public CDAccount[] getCDAccounts() {
		return cdAccounts;
	}
	
	public int getNumberOfCDAccounts() {
		return numberOfCDAccounts;
	}
	
	public double getCDBalance() {
		double tempBalance = 0;
		for (int i = 0; i < (numberOfCDAccounts); i++) {
			tempBalance += cdAccounts[i].getBalance();
		}
		CDBalance = tempBalance;
		return CDBalance;
	}
	
	public double getCombinedBalance() {
		combinedBalance = getCheckingBalance() + getSavingsBalance() + getCDBalance();
		return combinedBalance;
	}
	
}