package com.dragonfly.cloud.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/10/24 0024.
 */
@Controller
public class IndexController
{

    @RequestMapping (value= "index", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }
}
