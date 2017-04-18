package com.luckylhb.learn.proxy.springaop;

import com.luckylhb.learn.proxy.springaop.service.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dearl on 2017/4/6.
 */

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Hello hello = (Hello)applicationContext.getBean("helloProxy");
        hello.say("Tomo....");
    }

    public void test() {

    }
}
