package com.os.module1.application;

import com.os.module1.consumer.CustomConsumer;
import com.os.module1.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ServiceLoader;

@SpringBootApplication
@ComponentScan(basePackages = {"com.os.module1", "com.os.module1.service", "com.os.module1.impl"})
@EnableJpaRepositories("com.os.module1.repository")
@EntityScan("com.os.module1.dto")
@EnableConfigurationProperties
public class Application implements CommandLineRunner {
    @Autowired
    private CommonService commonService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        final ServiceLoader<CommonService> services = ServiceLoader.load(CommonService.class);
        commonService.getAllUsers().forEach(CustomConsumer.userConsumer);
    }
}
