//package com.repository;
//
//public interface AccountRepository  {
//
//}
package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bean.Account;

public interface AccountRepository extends CrudRepository<Account,Integer> {
	
//	@Query("select new com.bean.Account(p.accountNumber, p.holderName,c.cardNumber) from Account p, ATMCard c where c.cardType = 'VISA'")
//	public List<Account> findAccountByCat();
	
	public List<Account> findByAtmCardCardType(String cardType);

}
