package com.os.module1.exception;

public class SubscriptionException extends RuntimeException {
    public SubscriptionException() {
        super();
    }

    public SubscriptionException(String message) {
        super(message);
    }
}
