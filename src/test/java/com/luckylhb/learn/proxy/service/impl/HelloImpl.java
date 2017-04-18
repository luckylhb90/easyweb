package com.luckylhb.learn.proxy.service.impl;

import com.luckylhb.learn.proxy.service.Hello;

/**
 * Created by dearl on 2017/3/21.
 */
public class HelloImpl implements Hello {
    public void say(String name) {
        System.out.println("Hello!" + name);
    }
}
