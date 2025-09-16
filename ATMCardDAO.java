package com.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ATMCard;
import com.bean.Account;
import com.repository.ATMCardRepository;
import com.repository.AccountRepository;

@Service
public class ATMCardDAO {
	
	Logger log= LoggerFactory.getLogger(ATMCardDAO.class);
	
	@Autowired
	ATMCardRepository atmCardRepo;
	
	@Autowired
	AccountRepository accountRepo;
	
	public void issueATMCardToAccount(int accountNumber, ATMCard atmCardObjet) {
		Account act = accountRepo.findById(accountNumber).get();
        atmCardObjet.setAccount(act);
        try {
        atmCardRepo.save(atmCardObjet);
        log.info("ATM card successfully issued to account number "+accountNumber);
        }
        catch(Exception e) {
        	log.info("ATM card not issued to account number "+accountNumber);
        }
	}

}

//package com.dao;
//
//import com.bean.ATMCard;
//
//public class ATMCardDAO {
//	
//	
//	public void issueATMCardToAccount(int accountNumber, ATMCard atmCardObjet) {	 	  	    	   	 	     	 	
//			//fill code
//	}
//
//}
