package com.dragonfly.cloud.security.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/10/25 0025.
 */
public class UserVO implements Serializable
{
    private String email;
    private String password;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
