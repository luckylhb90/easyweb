package com.luckylhb.learn.proxy.noproxy.impl;

import com.luckylhb.learn.proxy.service.Hello;

/**
 * Created by dearl on 2017/4/5.
 */
public class NoProxyHelloImpl implements Hello {
    public void say(String name) {
        before();
        System.out.println(name);
        after();
    }

    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before");
    }
}
