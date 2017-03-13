package com.luckylhb.easymvc.utils;

import com.luckylhb.easymvc.TestBase;
import org.junit.Test;

import java.util.Set;

/**
 * Created by lucky on 2017/3/10.
 */
public class TestClassUtil extends TestBase {

    @Test
    public void test_getClassLoader() {
        System.out.println(ClassUtil.getClassLoader());
    }

    @Test
    public void test_loadClass() {
        System.out.println(ClassUtil.loadClass("com.luckylhb.easymvc.constants.ConfigConst"));
    }

    @Test
    public void test_getClassSet() {
        Set<Class<?>> classes = ClassUtil.getClassSet("com.luckylhb.easymvc");
        for (Class cls : classes) {
            System.out.println(cls);
        }
    }

}
