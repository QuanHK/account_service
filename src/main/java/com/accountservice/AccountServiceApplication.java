package com.accountservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@OpenAPIDefinition
@SpringBootApplication
public class AccountServiceApplication {

    @PostConstruct
    public void setTimeZone(){
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
    }

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

}
