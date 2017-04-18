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

    /**
     * http://blog.sina.com.cn/s/blog_7ffb8dd5010127ix.html
     */
    @Test
    public void test_loadClass() {
        Class class1 = ClassUtil.loadClass("com.luckylhb.easymvc.constants.ConfigConst");
        Class class2 = ClassUtil.loadClass("com.luckylhb.easymvc.constants.ConfigConst");
        System.out.println(class1);
        System.out.println(class2);
        System.out.println(class1 == class2);
    }


    @Test
    public void test_getClassSet() {
        Set<Class<?>> classes = ClassUtil.getClassSet("com.luckylhb.easymvc");
        for (Class cls : classes) {
            System.out.println(cls);
        }
    }

}
