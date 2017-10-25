package com.dragonfly.cloud.security.controller;

import com.dragonfly.cloud.security.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
@Api("用户登陆服务")
@RestController
public class LoginController
{
    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @ApiOperation(value = "登陆", notes = "")
    @RequestMapping(value = "/access", method = RequestMethod.POST)
    public String login(@RequestBody UserVO userVO)
    {
        logger.debug("email:" + userVO.getEmail());
        logger.debug("密码:" + userVO.getPassword());
        return "true";
    }
}
