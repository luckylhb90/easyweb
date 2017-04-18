package com.luckylhb.learn.proxy.cglib;

import com.luckylhb.learn.proxy.cglib.proxy.CGLibProxy;
import com.luckylhb.learn.proxy.service.Hello;
import com.luckylhb.learn.proxy.service.impl.HelloImpl;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * Created by dearl on 2017/3/21.
 */
public class Main {

    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        Hello helloProxy = (Hello) Enhancer.create(HelloImpl.class, cgLibProxy);
        helloProxy.say("Tomcat");
    }

    @Test
    public void test() {
        CGLibProxy cgLibProxy = new CGLibProxy();
        Hello helloProxy = cgLibProxy.getProxy(HelloImpl.class);
        helloProxy.say("Tomcat");
    }
}
