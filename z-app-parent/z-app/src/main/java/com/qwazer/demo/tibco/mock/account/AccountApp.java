package com.qwazer.demo.tibco.mock.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AccountApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AccountApp.class, args);
    }
}
