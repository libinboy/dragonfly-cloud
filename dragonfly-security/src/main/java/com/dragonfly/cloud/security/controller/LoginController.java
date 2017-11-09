package com.dragonfly.cloud.security.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.dragonfly.cloud.common.response.ObjectResponse;
import com.dragonfly.cloud.common.response.StatusCode;
import com.dragonfly.cloud.security.entity.User;
import com.dragonfly.cloud.security.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
@Api("用户登陆服务")
@RestController
public class LoginController
{
    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @ApiOperation(value = "登陆", notes = "")
    @PostMapping(value = "/access")
    @ResponseBody
    public ObjectResponse<User> login(@RequestBody User user)
    {
        logger.debug("account:" + user.getAccount());
        logger.debug("password:" + user.getPassword());

        ObjectResponse<User> response = new ObjectResponse<>();
        response.setStatus(StatusCode.FAIL);

        EntityWrapper<User> ew = new EntityWrapper<>();
        ew.eq("account", user.getAccount());
        User u = userService.selectOne(ew);

        if (u == null)
        {
            response.setMessage("用户名不存在");
            return response;
        }

        if (!user.getPassword().equals(u.getPassword()))
        {
            response.setMessage("密码不正确");
            return response;
        }

        response.setStatus(StatusCode.SUCCESS);
        response.setResult(u);

        return response;
    }
}
