package com.dragonfly.cloud.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
@EnableEurekaClient
@SpringBootApplication
public class SecurityApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SecurityApplication.class, args);
    }
}
