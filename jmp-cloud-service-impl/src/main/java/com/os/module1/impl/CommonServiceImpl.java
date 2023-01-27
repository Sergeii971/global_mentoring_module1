package com.os.module1.impl;

import com.os.module1.dto.BankCard;
import com.os.module1.dto.Subscription;
import com.os.module1.dto.User;
import com.os.module1.exception.SubscriptionException;
import com.os.module1.repository.BankCardRepository;
import com.os.module1.repository.SubscriptionRepository;
import com.os.module1.repository.UserRepository;
import com.os.module1.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class CommonServiceImpl implements CommonService {
    private final BankCardRepository bankCardRepository;
    private final UserRepository userRepository;
    private final SubscriptionRepository subscriptionRepository;

    private static final String SUBSCRIPTION_WITH_CURRENT_CARD_NUMBER_NOT_FOUND = "subscription with current card number not found";

    public CommonServiceImpl(BankCardRepository bankCardRepository, UserRepository userRepository,
                             SubscriptionRepository subscriptionRepository) {
        this.bankCardRepository = bankCardRepository;
        this.userRepository = userRepository;
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public void subscribe(BankCard bankCard) {
        bankCardRepository.save(bankCard);
    }

    @Override
    public Subscription getSubscriptionByBankCardNumber(String cardNumber) {
       return subscriptionRepository.findByBankCard(cardNumber)
               .orElseThrow(() -> new SubscriptionException(SUBSCRIPTION_WITH_CURRENT_CARD_NUMBER_NOT_FOUND));
    }

    @Override
    public List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> condition) {
        return subscriptionRepository.findAll()
                .stream()
                .filter(condition)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
