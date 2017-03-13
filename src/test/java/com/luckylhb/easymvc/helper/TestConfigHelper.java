package com.luckylhb.easymvc.helper;

import com.luckylhb.easymvc.TestBase;
import org.junit.Test;

/**
 * Created by lucky on 2017/3/10.
 */
public class TestConfigHelper extends TestBase {

    @Test
    public void test_ConfigHelper() {
        System.out.println(ConfigHelper.getAppAssetPath());
        System.out.println(ConfigHelper.getAppBasePackage());
        System.out.println(ConfigHelper.getAppJspPath());
        System.out.println(ConfigHelper.getAppUploadLimit());
        System.out.println(ConfigHelper.getJdbcDriver());
        System.out.println(ConfigHelper.getJdbcPassword());
        System.out.println(ConfigHelper.getJdbcUrl());
        System.out.println(ConfigHelper.getJdbcUsername());
    }
}
