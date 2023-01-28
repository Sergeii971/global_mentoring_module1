package com.os.module1.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "`user`")
@Getter
@Setter
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String name;
    private String surname;
    private LocalDate birthday;
    @OneToMany(mappedBy = "user")
    private List<BankCard> bankCards = new ArrayList<>();

    public User() {
    }

    public User(Integer userId, String name, String surname, LocalDate birthday, List<BankCard> bankCards) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.bankCards = bankCards;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
