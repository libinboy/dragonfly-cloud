package com.dragonfly.cloud.security.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/25 0025.
 */
@Api("用户管理服务")
@Controller
@RequestMapping(value = "/user")
public class UserController
{
    @ApiOperation(value = "查询用户列表", notes = "")
    @RequestMapping(value = "/list/page", method = RequestMethod.GET)
    @ResponseBody
    public List<String> queryAllUser()
    {
        List<String> list = new ArrayList<String>();
        for(int i= 0; i < 1000; i++)
        {
            list.add(String.valueOf(i));
        }
        return list;
    }
}
