package com.os.module1.service.bank;

import com.os.module1.dto.BankCard;
import com.os.module1.dto.BankCardType;
import com.os.module1.dto.User;

public interface BankService {
    BankCard createBankCard(User user, BankCardType bankCardType);
}
