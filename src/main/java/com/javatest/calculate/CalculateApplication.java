package com.javatest.calculate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CalculateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculateApplication.class, args);
    }

}
