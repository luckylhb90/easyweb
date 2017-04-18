package com.luckylhb.learn.proxy.springaop.aroundAdvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * Created by dearl on 2017/4/6.
 */
@Component(value = "helloAroundAdvice")
public class HelloAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        Object object = methodInvocation.proceed();
        after();
        return object;
    }

    private void after() {
        System.out.println("after...");
    }

    private void before() {
        System.out.println("before...");
    }
}
