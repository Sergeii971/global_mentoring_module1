package com.os.module1.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Subscription {
    private String bankCard;
    private LocalDate startDate;

}
