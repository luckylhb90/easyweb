package com.luckylhb.learn.proxy.statics;

import com.luckylhb.learn.proxy.service.Hello;
import com.luckylhb.learn.proxy.statics.proxy.HelloProxy;

/**
 * 静态代理
 * Created by dearl on 2017/3/21.
 */
public class Main {

    public static void main(String[] args) {
        Hello hello = new HelloProxy();
        hello.say("Jack");
    }
}
