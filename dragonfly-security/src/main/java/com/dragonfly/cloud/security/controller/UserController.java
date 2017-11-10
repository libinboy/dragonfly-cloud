package com.dragonfly.cloud.security.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.dragonfly.cloud.common.bean.Pager;
import com.dragonfly.cloud.common.response.BootstrapTableResponse;
import com.dragonfly.cloud.security.entity.User;
import com.dragonfly.cloud.security.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/10/25 0025.
 */
@Api("用户管理服务")
@Controller
@RequestMapping(value = "/user")
public class UserController
{
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户列表", notes = "")
    @PostMapping (value = "/page")
    @ResponseBody
    public BootstrapTableResponse<User> selectUserListPage(@RequestBody User user)
    {
        Pager pager = user.getPager();
        logger.debug("pageNumber:" + pager.getPageNumber());
        logger.debug("pageSize:" + pager.getPageSize());
        logger.debug("account:" + user.getAccount());

        Page<User> page = new Page<>(pager.getPageNumber(), pager.getPageSize());
        EntityWrapper<User> entityWrapper = new EntityWrapper<>(user);
        userService.selectPage(page, entityWrapper);

        BootstrapTableResponse<User> tableResponse =  new BootstrapTableResponse<>();
        tableResponse.setTotal(page.getTotal());
        tableResponse.setRows(page.getRecords());

        return tableResponse;
    }

    @ApiOperation(value = "新增用户", notes = "")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public boolean insertUser (@RequestBody User user)
    {
        return userService.insert(user);
    }

    @ApiOperation(value = "修改用户", notes = "")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public boolean updateUser (@RequestBody User user)
    {
        return userService.updateById(user);
    }

}
