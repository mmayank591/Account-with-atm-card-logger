package com.bean;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CURR")
public class CurrentAccount extends Account {
	
	private double ODLimit;

	public CurrentAccount() {
		
	}
	
	
	public CurrentAccount(int accountNumber, String holderName, double balance, double oDLimit) {
		super(accountNumber, holderName, balance);
		ODLimit = oDLimit;
	}


	public double getODLimit() {
		return ODLimit;
	}

	public void setODLimit(double oDLimit) {
		ODLimit = oDLimit;
	}
	
	
          
}


//package com.bean;
//
//
//public class CurrentAccount extends Account {	 	  	    	   	 	     	 	
//	
//	private double ODLimit;
//
//	public CurrentAccount() {
//		
//	}
//
//	public double getODLimit() {
//		return ODLimit;
//	}
//
//	public void setODLimit(double oDLimit) {
//		ODLimit = oDLimit;
//	}
//	
//	
//          
//}
