package com.luckylhb.learn.proxy.springaop.afterAdvice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by dearl on 2017/4/5.
 */
public class HelloAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("after...");
    }
}
