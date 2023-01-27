package com.os.module1.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    private Integer id;
    private String bankCard;
    private LocalDate startDate;

}
