package com.luckylhb.learn.proxy.noproxy;

import com.luckylhb.learn.proxy.noproxy.impl.NoProxyHelloImpl;
import com.luckylhb.learn.proxy.service.Hello;

/**
 * 写死代码
 * Created by dearl on 2017/4/5.
 */
public class Main {

    public static void main(String[] args) {
        Hello hello = new NoProxyHelloImpl();
        hello.say("test");
    }


}
