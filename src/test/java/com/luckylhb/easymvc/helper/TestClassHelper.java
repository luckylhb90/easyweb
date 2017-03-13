package com.luckylhb.easymvc.helper;

import com.luckylhb.easymvc.TestBase;
import org.junit.Test;

import java.util.Set;

/**
 * Created by lucky on 2017/3/11.
 */
public class TestClassHelper extends TestBase {

    @Test
    public void test_getServiceClassSet() {
        Set<Class<?>> fullClass = ClassHelper.getClassSet();
        for (Class<?> cls : fullClass) {
            System.out.println(cls);
        }
        System.out.println("=====================");
        Set<Class<?>> classSet = ClassHelper.getServiceClassSet();
        for (Class<?> cls : classSet) {
            System.out.println(cls);
        }
    }

    @Test
    public void test_getControllerClassSet() {
        Set<Class<?>> classSet = ClassHelper.getControllerClassSet();
        for (Class<?> cls : classSet) {
            System.out.println(cls);
        }
    }


}
