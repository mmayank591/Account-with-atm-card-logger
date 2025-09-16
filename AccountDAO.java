package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Account;
import com.repository.AccountRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class AccountDAO {

	Logger log=LoggerFactory.getLogger(AccountDAO.class);
	
	@Autowired
	AccountRepository accountRepo;
	
	@PersistenceContext
	private EntityManager em;

	public void openAccount(Account account) {
		accountRepo.save(account);
		log.info("Account with id "+account.getAccountNumber()+" added successfully");
	}
	
	public List<Account> retrieveAccountBasedOnCardType(String cardType){

		List<Account> accList  = new ArrayList<Account>();
		accList=accountRepo.findByAtmCardCardType(cardType);
//		List<Object[]> acclist= em.createQuery("select a,c from Account a join ATMCard c on a.accountNumber=c.account.accountNumber  where c.cardType='"+cardType+"'").getResultList();
////System.out.println("hi         "+acclist.size());
//		for(Object[] x : acclist) {	 	  	    	   	 	     	 	
//			Account acc=(Account) x[0];
//			ATMCard card=(ATMCard)x[1];
//			acc.setAtmCard(card);
//			accList.add(acc);
//		}
		if(accList.size()>0) {
			log.info("Account details with card type "+cardType+" retrieved successfully");
		}
		else
			log.error("No account with this card type "+cardType);
			
	return accList;
		
		//		CriteriaBuilder cb = em.getCriteriaBuilder();
//	        CriteriaQuery<Account> cq = cb.createQuery(Account.class);
//	 
//	        Root<Account> acc = cq.from(Account.class);
//	        Join<Account,ATMCard> join= acc.join("accountNumber");//("mappedB", JoinType.LEFT);
//	        join.on(cb.equal(join.get("cardType"),cardType))
	}
}

//package com.dao;
//
//import java.util.List;
//
//
//import com.bean.Account;
//
//public class AccountDAO {
//	
//	public void openAccount(Account account) {
//		//fill code
//	}
//	
//	public List<Account> retrieveAccountBasedOnCardType(String cardType){
//		//fill code
//		return null;
//		
//	}
//}
	 	  	    	   	 	     	 	
