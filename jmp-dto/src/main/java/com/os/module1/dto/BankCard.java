package com.os.module1.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bankCard")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
public class BankCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public String toString() {
        return "BankCard{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
