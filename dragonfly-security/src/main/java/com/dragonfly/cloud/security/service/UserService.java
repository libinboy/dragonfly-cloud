package com.dragonfly.cloud.security.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.dragonfly.cloud.security.entity.User;

/**
 * Created by Administrator on 2017/11/2 0002.
 */
public interface UserService extends IService<User>
{

    boolean deleteAll();

}
