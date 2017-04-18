package com.luckylhb.learn.proxy.dynamic;

import com.luckylhb.learn.proxy.dynamic.proxy.DynamicProxy;
import com.luckylhb.learn.proxy.service.Hello;
import com.luckylhb.learn.proxy.service.impl.HelloImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by dearl on 2017/3/21.
 */
public class Main {
    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);

        Hello helloProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), dynamicProxy);

        helloProxy.say("Jack");
    }

    @Test
    public void test2() {
        Hello hello = new HelloImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);
        Hello helloProxy = dynamicProxy.getProxy();
        helloProxy.say("Tom");
    }
}
