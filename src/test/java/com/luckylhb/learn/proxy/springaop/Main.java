package com.luckylhb.learn.proxy.springaop;

import com.luckylhb.learn.proxy.service.Hello;
import com.luckylhb.learn.proxy.service.impl.HelloImpl;
import com.luckylhb.learn.proxy.springaop.afterAdvice.HelloAfterAdvice;
import com.luckylhb.learn.proxy.springaop.aroundAdvice.HelloAroundAdvice;
import com.luckylhb.learn.proxy.springaop.beforeAndAfterAdvice.HelloBeforeAndAfterAdvice;
import com.luckylhb.learn.proxy.springaop.beforeAdvice.HelloBeforeAdvice;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by dearl on 2017/4/5.
 */
public class Main {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();//创建代理工厂
        proxyFactory.setTarget(new HelloImpl());//注册目标类对象
        proxyFactory.addAdvice(new HelloBeforeAdvice());//添加前置增强类
        proxyFactory.addAdvice(new HelloAfterAdvice());//添加后置增加类

        Hello hello = (Hello) proxyFactory.getProxy();//从代理工厂获取代理

        hello.say("hello.....");//调用代理方法
    }

    @Test
    public void testBefore() {
        ProxyFactory proxyFactory = new ProxyFactory();//创建代理工厂
        proxyFactory.setTarget(new HelloImpl());//注册目标类对象
        proxyFactory.addAdvice(new HelloBeforeAdvice());//添加前置增强类

        Hello hello = (Hello) proxyFactory.getProxy();//从代理工厂获取代理

        hello.say("hello.....");//调用代理方法
    }

    @Test
    public void testAfter() {
        ProxyFactory proxyFactory = new ProxyFactory();//创建代理工厂
        proxyFactory.setTarget(new HelloImpl());//注册目标类对象
        proxyFactory.addAdvice(new HelloAfterAdvice());//添加后置增加类

        Hello hello = (Hello) proxyFactory.getProxy();//从代理工厂获取代理

        hello.say("hello.....");//调用代理方法
    }

    @Test
    public void testBeforeAndAfter() {
        ProxyFactory proxyFactory = new ProxyFactory();//创建代理工厂
        proxyFactory.setTarget(new HelloImpl());//注册目标类对象
        proxyFactory.addAdvice(new HelloBeforeAndAfterAdvice());//添加BeforeAndAfter增强类

        Hello hello = (Hello) proxyFactory.getProxy();//从代理工厂获取代理

        hello.say("hello.....");//调用代理方法
    }

    @Test
    public void testAround() {
        ProxyFactory proxyFactory = new ProxyFactory();//创建代理工厂
        proxyFactory.setTarget(new HelloImpl());//注册目标类对象
        proxyFactory.addAdvice(new HelloAroundAdvice());//添加环绕增强类

        Hello hello = (Hello) proxyFactory.getProxy();//从代理工厂获取代理

        hello.say("hello.....");//调用代理方法
    }
}
