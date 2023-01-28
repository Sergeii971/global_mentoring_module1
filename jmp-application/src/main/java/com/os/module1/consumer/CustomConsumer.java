package com.os.module1.consumer;

import com.os.module1.dto.BankCard;
import com.os.module1.dto.Subscription;
import com.os.module1.dto.User;

import java.util.function.Consumer;

public class CustomConsumer {
    public static final Consumer<User> userConsumer = user -> System.out.println(user.toString());
    public static final Consumer<BankCard> bankCardConsumer = bankCard -> System.out.println(bankCard.toString());

    public static final Consumer<Subscription> subscriptionConsumer = subscription -> System.out.println(subscription.toString());

    private CustomConsumer() {
    }
}
