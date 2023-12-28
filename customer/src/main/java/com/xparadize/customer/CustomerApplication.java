package com.xparadize.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
        scanBasePackages = {
                "com.xparadize.customer",
                "com.xparadize.amqp",
                "com.xparadize.clients"
        }
)
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.xparadize.clients")
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
