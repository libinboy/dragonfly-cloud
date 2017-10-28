package com.dragonfly.cloud.security.controller;

import com.dragonfly.cloud.security.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value = "查询用户列表", notes = "")
    @RequestMapping(value = "/list/page", method = RequestMethod.POST)
    @ResponseBody
    public List<UserVO> queryAllUser(@RequestBody UserVO userVO)
    {
        logger.debug("email:" + userVO.getEmail());
        List<UserVO> list = new ArrayList<UserVO>();
        UserVO user = null;
        for(int i= 0; i < 1000; i++)
        {
            user = new UserVO();
            user.setEmail("libin" + i + "@123.com");
            user.setPassword("libin" + i);
            list.add(user);
        }
        return list;
    }
}
