package com.dragonfly.cloud.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Administrator on 2017/7/11 0011.
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class GateApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GateApplication.class, args);
    }
}
