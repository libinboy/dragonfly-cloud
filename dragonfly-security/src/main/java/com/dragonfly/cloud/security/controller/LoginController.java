package com.dragonfly.cloud.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
@RestController
public class LoginController
{
    @RequestMapping(value = "/access")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password)
    {
        return "true";
    }
}
