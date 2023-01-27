package com.os.module1.service.repository;

import com.os.module1.dto.BankCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankCardRepository extends CrudRepository<BankCard, Integer> {
}
