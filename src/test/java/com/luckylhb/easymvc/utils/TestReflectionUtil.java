package com.luckylhb.easymvc.utils;

import com.luckylhb.easymvc.TestBase;
import com.luckylhb.easymvc.helper.ClassHelper;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * Created by lucky on 2017/3/11.
 */
public class TestReflectionUtil extends TestBase {

    @Test
    public void test_newInstance() {
        Set<Class<?>> classSet = ClassHelper.getServiceClassSet();
        for (Class cls : classSet) {
            System.out.println(ReflectionUtil.newInstance(cls));
        }
    }

    @Test
    public void test_invokeMethod() throws Exception {
        Set<Class<?>> classSet = ClassHelper.getServiceClassSet();
        for (Class cls : classSet) {
            Method method = cls.getMethod("toString");
            ReflectionUtil.invokeMethod(cls.newInstance(), method);
        }
    }

    @Test
    public void test_setField() throws Exception {
        Set<Class<?>> classSet = ClassHelper.getServiceClassSet();
        for (Class cls : classSet) {
            System.out.println(cls);
            Object instance = cls.newInstance();
            Field field = cls.getDeclaredField("key");//cls.getField("key");
            ReflectionUtil.setField(instance, field, "key1");
            System.out.println(field.get(instance));
        }
    }
}
