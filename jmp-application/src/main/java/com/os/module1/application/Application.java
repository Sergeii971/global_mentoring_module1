package com.os.module1.application;

import com.os.module1.consumer.CustomConsumer;
import com.os.module1.dto.BankCard;
import com.os.module1.dto.BankCardType;
import com.os.module1.dto.Subscription;
import com.os.module1.dto.User;
import com.os.module1.service.bank.BankService;
import com.os.module1.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.ServiceLoader;
import java.util.function.Predicate;

@SpringBootApplication
@ComponentScan(basePackages = {"com.os.module1", "com.os.module1.service", "com.os.module1.impl"})
@EnableJpaRepositories("com.os.module1.repository")
@EntityScan("com.os.module1.dto")
@EnableConfigurationProperties
public class Application implements CommandLineRunner {
    @Autowired
    private CommonService commonService;

    @Autowired
    private BankService bankService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        final ServiceLoader<CommonService> services = ServiceLoader.load(CommonService.class);
        List<User> userList = commonService.getAllUsers();

        System.out.println("--------------------------------");
        userList.forEach(CustomConsumer.userConsumer);
        System.out.println("--------------------------------");

        BankCard bankCard = bankService.createBankCard(userList.get(0), BankCardType.CREDIT);

        System.out.println("--------------------------------");
        System.out.println(bankCard.toString());
        System.out.println("--------------------------------");

        commonService.subscribe(bankCard);
        Predicate<Subscription> subscriptionPredicate = subscription -> subscription.getStartDate().isLeapYear();
        List<Subscription> subscriptions = commonService.getAllSubscriptionsByCondition(subscriptionPredicate);

        System.out.println("--------------------------------");
        subscriptions.forEach(CustomConsumer.subscriptionConsumer);
        System.out.println("--------------------------------");

        Double averageUserAge = commonService.getAverageUsersAge();

        System.out.println("--------------------------------");
        System.out.println(averageUserAge);
        System.out.println("--------------------------------");

    }
}
