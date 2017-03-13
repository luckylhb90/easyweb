package com.luckylhb.easyweb.controllers;

import com.luckylhb.easymvc.annotations.Action;
import com.luckylhb.easymvc.annotations.Controller;
import com.luckylhb.easymvc.bean.View;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lucky on 2017/3/12.
 */
@Controller
public class HelloController {

    @Action("get:/hello")
    public View hello() {
        //View view = new View("hello");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String currentTime = dateFormat.format(new Date());
        //view.addModel("currentTime", currentTime);
        return new View("hello.jsp").addModel("currentTime", currentTime);
    }
}
