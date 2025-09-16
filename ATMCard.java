package com.bean;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class ATMCard {
	
	@Id
	private String cardNumber;
	private String cardType;
	private Date expiryDate;
	private int cvvNumber;
	
	@OneToOne
	@JoinColumn(name="account_number", unique = true)	
	private Account account;
	
	public ATMCard() {
		
	}
	
	public ATMCard(String cardNumber, String cardType, Date expiryDate, int cvvNumber) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.expiryDate = expiryDate;
		this.cvvNumber = cvvNumber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {	 	  	    	   	 	     	 	
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	

}


//package com.bean;
//
//import java.util.Date;
//
//
//public class ATMCard {	 	  	    	   	 	     	 	
//	
//	private String cardNumber;
//	private String cardType;
//	private Date expiryDate;
//	private int cvvNumber;
//	
//	private Account account;
//	
//	public ATMCard() {
//		
//	}
//	
//	public String getCardNumber() {
//		return cardNumber;
//	}
//	public void setCardNumber(String cardNumber) {
//		this.cardNumber = cardNumber;
//	}
//	public String getCardType() {
//		return cardType;
//	}
//	public void setCardType(String cardType) {
//		this.cardType = cardType;
//	}
//	public Date getExpiryDate() {
//		return expiryDate;
//	}
//	public void setExpiryDate(Date expiryDate) {
//		this.expiryDate = expiryDate;
//	}
//	public int getCvvNumber() {
//		return cvvNumber;
//	}
//	public void setCvvNumber(int cvvNumber) {
//		this.cvvNumber = cvvNumber;
//	}	 	  	    	   	 	     	 	
//	public Account getAccount() {
//		return account;
//	}
//	public void setAccount(Account account) {
//		this.account = account;
//	}
//
//}
