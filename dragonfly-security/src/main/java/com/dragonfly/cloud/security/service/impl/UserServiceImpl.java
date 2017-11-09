package com.dragonfly.cloud.security.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dragonfly.cloud.security.entity.User;
import com.dragonfly.cloud.security.mapper.UserMapper;
import com.dragonfly.cloud.security.service.UserService;
import javafx.scene.control.Pagination;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/2 0002.
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService
{
    @Override
    public boolean deleteAll() {
        return retBool(baseMapper.deleteAll());
    }
}
