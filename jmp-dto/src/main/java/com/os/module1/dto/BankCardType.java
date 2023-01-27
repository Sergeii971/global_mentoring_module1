package com.os.module1.dto;

import java.util.function.Supplier;

public enum BankCardType {
    CREDIT(new CreditBankCard(), CreditBankCard::new),
    DEBIT(new DebitBankCard(), DebitBankCard::new);

    private final Supplier<BankCard> creatingObject;
    private final BankCard bankCard;

    BankCardType(BankCard bankCard, Supplier<BankCard> creatingObject) {
        this.creatingObject = creatingObject;
        this.bankCard = bankCard;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    private Supplier<BankCard> getCreatingObject() {
        return creatingObject;
    }
}
