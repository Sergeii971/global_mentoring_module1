package com.os.module1.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private String name;
    private String surname;
    private LocalDate birthday;
}
