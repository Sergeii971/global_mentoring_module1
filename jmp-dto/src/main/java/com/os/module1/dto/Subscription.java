package com.os.module1.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Subscription")
public class Subscription {
    @Id
    private Integer id;
    private String bankCard;
    private LocalDate startDate;

}
