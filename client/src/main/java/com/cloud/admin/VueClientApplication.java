package com.cloud.admin;

import com.cloud.admin.client.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@RibbonClients(defaultConfiguration = RibbonConfig.class)
@EnableFeignClients
@EnableCircuitBreaker
public class VueClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueClientApplication.class, args);
    }

}
