package com.dragonfly.cloud.common.response;

/**
 * Created by Administrator on 2017/11/6 0006.
 */
public interface StatusCode
{
    /**
     * 操作成功
     */
    String SUCCESS = "200";

    /**
     * 未验证
     */
    String UNAUTHORIZED = "401";

    /**
     * 操作失败
     */
    String FAIL = "500";
}
