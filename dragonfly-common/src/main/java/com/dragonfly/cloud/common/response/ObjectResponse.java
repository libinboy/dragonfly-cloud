package com.dragonfly.cloud.common.response;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/6 0006.
 */
public class ObjectResponse<T> implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    String status = StatusCode.SUCCESS;

    /**
     * 返回值
     */
    String message;

    T result;

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public ObjectResponse result(T result) {
        this.setResult(result);
        return this;
    }

}
