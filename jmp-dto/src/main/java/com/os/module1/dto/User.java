package com.os.module1.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "User")
public class User {
    @Id
    private Integer id;
    private String name;
    private String surname;
    private LocalDate birthday;

    @OneToMany(mappedBy = "user")
    private List<BankCard> bankCardList = new ArrayList<>();

}
