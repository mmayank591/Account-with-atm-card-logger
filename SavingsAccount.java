package com.bean;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SAV")
public class SavingsAccount extends Account {
	
	private double minimumBalance;

	public SavingsAccount() {
		
	}
	

	public SavingsAccount(int accountNumber, String holderName, double balance,
			double minimumBalance) {
		super(accountNumber, holderName, balance);
		this.minimumBalance = minimumBalance;
	}


	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	

}

//package com.bean;
//
//
//public class SavingsAccount extends Account {	 	  	    	   	 	     	 	
//	
//	private double minimumBalance;
//
//	public SavingsAccount() {
//		
//	}
//	
//	public double getMinimumBalance() {
//		return minimumBalance;
//	}
//
//	public void setMinimumBalance(double minimumBalance) {
//		this.minimumBalance = minimumBalance;
//	}
//	
//	
//
//}
