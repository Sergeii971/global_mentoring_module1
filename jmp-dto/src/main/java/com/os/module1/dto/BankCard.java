package com.os.module1.dto;

import lombok.Data;

@Data
public abstract class BankCard {
    private String number;
    private User user;

}
