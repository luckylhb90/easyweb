package com.luckylhb.learn.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created by dearl on 2017/3/19.
 */
public class EnhancerDemo {


    @Test
    public void test() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(EnhancerDemo.class);
        enhancer.setCallback(new MethodInterceptorImpl());
        EnhancerDemo enhancerDemo = (EnhancerDemo) enhancer.create();
        enhancerDemo.sout();
        //System.out.println(enhancerDemo);
    }

    public void sout() {
        System.out.println("EnhancerDemo test()...");
    }
    private static class MethodInterceptorImpl implements MethodInterceptor {

        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("Before invoke : " + method);
            Object result = methodProxy.invokeSuper(o, objects);
            System.out.println("After invoke : " + method);
            return result;
        }
    }
}
