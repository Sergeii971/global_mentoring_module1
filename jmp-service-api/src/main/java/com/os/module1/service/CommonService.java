package com.os.module1.service;

import com.os.module1.dto.BankCard;
import com.os.module1.dto.Subscription;
import com.os.module1.dto.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.function.Predicate;

public interface CommonService {
    void subscribe(BankCard bankCard);
    Subscription getSubscriptionByBankCardNumber(String cardNumber);

    List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> condition);
    List<User> getAllUsers();

    default double getAverageUsersAge() {
        return getAllUsers().stream()
                .mapToLong(user -> ChronoUnit.YEARS.between(user.getBirthday(), LocalDate.now()))
                .average()
                .orElseThrow(() -> new RuntimeException("error while calculating average users age"));
    }

    static boolean isPayableUser(User user) {
       return (ChronoUnit.YEARS.between(user.getBirthday(), LocalDate.now()) > 18);
    }

}
