package com.dragonfly.cloud.security.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dragonfly.cloud.security.entity.User;

/**
 * Created by Administrator on 2017/11/2 0002.
 */
public interface UserMapper extends BaseMapper<User>
{

    /**
     * 自定义注入方法
     */
    int deleteAll();

}
