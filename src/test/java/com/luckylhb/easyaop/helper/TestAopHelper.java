package com.luckylhb.easyaop.helper;

import com.luckylhb.easyaop.proxy.Proxy;
import com.luckylhb.easyaop.proxy.ProxyManager;
import com.luckylhb.easymvc.TestBase;
import com.luckylhb.easymvc.helper.BeanHelper;
import com.luckylhb.easymvc.utils.ReflectionUtil;
import com.luckylhb.easyweb.controllers.HelloController;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by lucky on 2017/3/19.
 */
public class TestAopHelper extends TestBase {

    @Test
    public void test_createProxyMap() throws Exception {
        AopHelper aopHelper = new AopHelper();
        Method method = aopHelper.getClass().getDeclaredMethod("createProxyMap", null);
        method.setAccessible(true);
        Object result = method.invoke(method);
        Map<Class<?>, Set<Class<?>>> proxyMap = (Map<Class<?>, Set<Class<?>>>) result;
        for (Map.Entry<Class<?>, Set<Class<?>>> entry : proxyMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    @Test
    public void test_createTargetMap() throws Exception {
        AopHelper aopHelper = new AopHelper();
        Method createProxyMap = aopHelper.getClass().getDeclaredMethod("createProxyMap");
        Object proxuResult = ReflectionUtil.invokeMethod(aopHelper, createProxyMap);
        Map<Class<?>, Set<Class<?>>> proxyMap = (Map<Class<?>, Set<Class<?>>>) proxuResult;
        for (Map.Entry<Class<?>, Set<Class<?>>> entry : proxyMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        Method createTargetMap = aopHelper.getClass().getDeclaredMethod("createTargetMap", new Class[]{Map.class});
        Object targetResult = ReflectionUtil.invokeMethod(aopHelper, createTargetMap, proxyMap);
        Map<Class<?>, List<Proxy>> targetMap = (Map<Class<?>, List<Proxy>>) targetResult;
        for (Map.Entry<Class<?>, List<Proxy>> entry : targetMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            Object proxy = ProxyManager.createProxy(entry.getKey(), entry.getValue());
            System.out.println(proxy);
        }
    }

    @Test
    public void test_ControllerAspect() {
        HelloController helloController = BeanHelper.getBean(HelloController.class);
        helloController.hello();
    }
}
