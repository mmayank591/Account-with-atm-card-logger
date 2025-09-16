//package com.repository;
//
//
//public interface ATMCardRepository {
//
//}
package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bean.ATMCard;

@Repository
public interface ATMCardRepository extends CrudRepository<ATMCard,String> {

}
