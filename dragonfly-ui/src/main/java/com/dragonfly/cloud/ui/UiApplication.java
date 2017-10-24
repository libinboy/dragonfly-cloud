package com.dragonfly.cloud.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2017/7/11 0011.
 */
@EnableEurekaClient
@SpringBootApplication
public class UiApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UiApplication.class, args);
    }
}
