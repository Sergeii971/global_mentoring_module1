package com.os.module1.dto;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class CreditBankCard extends BankCard {
    @Override
    public String toString() {
        return "CreditBankCard{" + super.toString() + "}";
    }
}
