package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
		CDOffering[] CDOfferings = new CDOffering[5];
    	
    	CDOfferings[0] = new CDOffering(1,1.8/100);
    	CDOfferings[1] = new CDOffering(2,1.9/100);
    	CDOfferings[2] = new CDOffering(3,2.0/100);
    	CDOfferings[3] = new CDOffering(5,2.5/100);
    	CDOfferings[4] = new CDOffering(10,2.2/100);
    	
    	MeritBank.setCDOfferings(CDOfferings);
    	
    	AccountHolder ah1 = new AccountHolder();
    	
    	ah1.addCheckingAccount(1000);
    	ah1.addSavingsAccount(10000);
    	ah1.addCheckingAccount(5000);
    	ah1.addSavingsAccount(50000);
    	ah1.addCheckingAccount(50000);
    	ah1.addSavingsAccount(500000);
    	ah1.addCheckingAccount(5000);
    	ah1.addSavingsAccount(50000);
    	
    	ah1.addCDAccount(CDOfferings[0], 5000);
    	System.out.println(ah1.getCDAccounts()[0].getTerm());
    	
    	System.out.println(ah1.getNumberOfCheckingAccounts());
    	System.out.println(ah1.getNumberOfSavingsAccounts());
    	
    	
	}
}