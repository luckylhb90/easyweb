package com.luckylhb.easymvc.helper;

import com.luckylhb.easymvc.TestBase;
import com.luckylhb.easymvc.annotations.TestControllerBean;
import org.junit.Test;

import java.util.Map;

/**
 * Created by lucky on 2017/3/11.
 */
public class TestBeanHelper extends TestBase {

    @Test
    public void test_getBeanMap() {
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        for (Map.Entry<Class<?>, Object> entry : beanMap.entrySet()) {
            System.out.print(entry.getKey());
            System.out.print("------");
            System.out.println(entry.getValue());
        }
    }

    @Test
    public void test_getBean() {
        TestControllerBean controllerBean = BeanHelper.getBean(TestControllerBean.class);
        System.out.println(controllerBean);
    }
}
