package com.luckylhb.easymvc.utils;

import com.luckylhb.easymvc.TestBase;
import com.luckylhb.easymvc.constants.ConfigConst;
import org.junit.Test;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by lucky on 2017/3/10.
 */
public class TestPropsUtil extends TestBase {

    @Test
    public void test_loadProps() {
        Properties properties = PropsUtil.loadProps(ConfigConst.CONFIG_PATH);
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.print(entry.getKey());
            System.out.print("======");
            System.out.println(entry.getValue());
        }
    }
}
