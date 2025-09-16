package com;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bean.ATMCard;
import com.bean.Account;
import com.bean.SavingsAccount;
import com.dao.ATMCardDAO;
import com.dao.AccountDAO;

@SpringBootApplication
public class BankAccountWithATMCardApplication implements CommandLineRunner
{

	@Autowired
	AccountDAO accountDAO;
	
	@Autowired
	ATMCardDAO atmDAO;
	public static void main(String[] args) {
		SpringApplication.run(BankAccountWithATMCardApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
        try{
	System.out.println("Invoke the methods");
	accountDAO.openAccount(new SavingsAccount(1,"Test",20000,2000));
	System.out.println("Account added");
	atmDAO.issueATMCardToAccount(1,new ATMCard("1111","VISA",new Date(),123));
	System.out.println("ATM Card issued to Account number 1");
	List<Account> accc=(List<Account>)accountDAO.retrieveAccountBasedOnCardType("VISA");
//	System.out.println(accc.size()+" hiiiiiiiiiiiiiii");
	Account a=(Account)(accc.get(0));
	System.out.println(a.getAccountNumber()+"  result"+a.getAtmCard().getCardNumber());
}	 	  	    	   	 	     	 	
catch(Exception e){
    e.printStackTrace();
}
    }


}
