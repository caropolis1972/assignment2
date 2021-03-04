package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{
		private double balance;
		private double interestRate = 0.0001;
		double futureValue = 1;
		
		
		public CheckingAccount(double balance, double interestRate){
			super(balance, interestRate);
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
		
		public boolean deposit(double amount) {
			if (amount > 0) {
				balance += amount;
				return true;
			} else return false;
			
		}
		
		public double futureValue(double years) {
			double futureValue = 1.0;
			futureValue = (balance * Math.pow((1+interestRate), years));
			return futureValue;
		}
		
		public String toString() {
			return "Checking Account Balance: $" + balance + "\n" +
					"Checking Account Interest Rate: " + interestRate + "\n" +
					"Checking Acount Balance in 3 Years: $" + futureValue(3);
		}
	}

}