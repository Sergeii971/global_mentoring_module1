package com.os.module1.repository;

import com.os.module1.dto.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription, Integer> {
    Optional<Subscription> findByBankCard(String bankCard);
    List<Subscription> findAll();
}
