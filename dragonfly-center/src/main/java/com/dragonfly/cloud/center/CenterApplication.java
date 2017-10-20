package com.dragonfly.cloud.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2017/7/11 0011.
 */
@EnableEurekaServer
@SpringBootApplication
public class CenterApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CenterApplication.class, args);
    }
}
