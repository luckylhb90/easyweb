package com.luckylhb.learn.proxy.statics.proxy;

import com.luckylhb.learn.proxy.service.Hello;
import com.luckylhb.learn.proxy.service.impl.HelloImpl;

/**
 * Created by dearl on 2017/3/21.
 */
public class HelloProxy implements Hello {

    private Hello hello;

    public HelloProxy() {
        this.hello = new HelloImpl();
    }

    public HelloProxy(Hello hello) {
        this.hello = hello;
    }

    public void say(String name) {
        before();
        hello.say(name);
        afer();
    }

    private void afer() {
        System.out.println("after...");
    }

    private void before() {
        System.out.println("before...");
    }
}
