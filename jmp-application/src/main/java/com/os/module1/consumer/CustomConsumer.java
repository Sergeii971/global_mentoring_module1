package com.os.module1.consumer;

import com.os.module1.dto.User;

import java.util.function.Consumer;

public class CustomConsumer {
    public static final Consumer<User> userConsumer = user -> System.out.println(user.toString());
}
