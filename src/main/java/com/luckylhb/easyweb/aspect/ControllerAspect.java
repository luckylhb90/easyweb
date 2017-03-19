package com.luckylhb.easyweb.aspect;

import com.luckylhb.easyaop.annotations.Aspect;
import com.luckylhb.easyaop.proxy.AspectProxy;
import com.luckylhb.easymvc.annotations.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * 拦截Controller所有方法
 * Created by lucky on 2017/3/17.
 */
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {

    private static final Logger logger = LoggerFactory.getLogger(ControllerAspect.class);

    private long begin;

    @Override
    public void end() {
        super.end();
    }

    @Override
    public void error(Class<?> cls, Method method, Object[] params, Throwable e) {
        super.error(cls, method, params, e);
    }

    @Override
    public void after(Class<?> cls, Method method, Object[] params, Object result) {
        logger.debug(String.format("time: %d ms", System.currentTimeMillis() - begin));
        logger.debug("--------------------after-------------------");
    }

    @Override
    public void before(Class<?> cls, Method method, Object[] params) {
        logger.debug("--------------------before-----------------");
        logger.debug(String.format("class: %s", cls.getName()));
        logger.debug(String.format("method: %s", method.getName()));
        begin = System.currentTimeMillis();
    }

    @Override
    public boolean intercept(Class<?> cls, Method method, Object[] params) {
        return super.intercept(cls, method, params);
    }

    @Override
    public void begin() {

    }
}
