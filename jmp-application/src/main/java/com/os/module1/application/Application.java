package com.os.module1.application;

import com.os.module1.impl.CommonServiceImpl;
import com.os.module1.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.os.module1"})
@EnableJpaRepositories("com.os.module1.repository")
@EntityScan("com.os.module1.dto")
public class Application implements CommandLineRunner {
    @Autowired
    private CommonServiceImpl commonService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        commonService.getAllUsers();
    }
}
