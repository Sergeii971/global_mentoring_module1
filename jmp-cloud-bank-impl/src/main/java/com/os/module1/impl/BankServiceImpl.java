package com.os.module1.impl;

import com.os.module1.dto.BankCard;
import com.os.module1.dto.BankCardType;
import com.os.module1.dto.User;
import com.os.module1.repository.BankCardRepository;
import com.os.module1.repository.UserRepository;
import com.os.module1.service.BankService;
import org.springframework.stereotype.Service;
import org.springframework.util.SimpleIdGenerator;

@Service
public class BankServiceImpl implements BankService {
    private final BankCardRepository bankCardRepository;
    private final UserRepository userRepository;

    private static final String USER_NOT_FOUND_MESSAGE = "user not found";

    public BankServiceImpl(BankCardRepository bankCardRepository, UserRepository userRepository) {
        this.bankCardRepository = bankCardRepository;
        this.userRepository = userRepository;
    }

    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        var bankCard = bankCardType.getBankCard();
        bankCard.setNumber(new SimpleIdGenerator().generateId().toString());
        userRepository.findById(user.getUserId())
                .orElseThrow(() -> new RuntimeException(USER_NOT_FOUND_MESSAGE));
        bankCard.setUser(user);
        return bankCardRepository.save(bankCard);
    }
}
