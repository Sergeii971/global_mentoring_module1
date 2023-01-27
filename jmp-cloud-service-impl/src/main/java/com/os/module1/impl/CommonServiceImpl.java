package com.os.module1.impl;

import com.os.module1.dto.BankCard;
import com.os.module1.dto.Subscription;
import com.os.module1.dto.User;
import com.os.module1.service.repository.BankCardRepository;
import com.os.module1.service.repository.UserRepository;
import com.os.module1.service.CommonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommonServiceImpl implements CommonService {
    private final BankCardRepository bankCardRepository;
    private final UserRepository userRepository;

    public CommonServiceImpl(BankCardRepository bankCardRepository, UserRepository userRepository) {
        this.bankCardRepository = bankCardRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void subscribe(BankCard bankCard) {

    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
