package com.dragonfly.cloud.common.response;

import java.util.List;

/**
 * Created by Administrator on 2017/10/30 0030.
 */
public class BootstrapTableResponse<T>
{
    int total;
    List<T> rows;

    public BootstrapTableResponse(int total, List<T> rows)
    {
        this.total = total;
        this.rows = rows;
    }

    public BootstrapTableResponse()
    {
    }

    BootstrapTableResponse<T> total(int total){
        this.total = total;
        return this;
    }
    BootstrapTableResponse<T> total(List<T> rows){
        this.rows = rows;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
