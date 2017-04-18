package com.luckylhb.learn.proxy.springaop.service.impl;

import com.luckylhb.learn.proxy.springaop.service.Hello;
import org.springframework.stereotype.Component;

/**
 * Created by dearl on 2017/4/6.
 */
@Component
public class HelloImpl implements Hello {


    @Override
    public void say(String name) {
        System.out.println("hello" + name);
    }
}
