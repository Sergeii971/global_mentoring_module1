package com.os.module1.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bankCard;
    private LocalDate startDate;

    public Subscription() {
    }

    public Subscription(Integer id, String bankCard, LocalDate startDate) {
        this.id = id;
        this.bankCard = bankCard;
        this.startDate = startDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", bankCard='" + bankCard + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
