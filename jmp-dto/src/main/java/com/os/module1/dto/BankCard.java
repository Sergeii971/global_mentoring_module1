package com.os.module1.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "BankCard")
@Data
public abstract class BankCard {
    @Id
    private Integer id;
    private String number;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
