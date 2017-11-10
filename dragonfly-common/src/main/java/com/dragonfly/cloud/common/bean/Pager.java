package com.dragonfly.cloud.common.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/10 0010.
 */
public class Pager implements Serializable
{
    private int pageNumber = 1;

    private int pageSize = 10;

    public int getPageNumber()
    {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber)
    {
        this.pageNumber = pageNumber;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    @Override public String toString()
    {
        return "Pager{" + "pageNumber=" + pageNumber + ", pageSize=" + pageSize + '}';
    }
}
