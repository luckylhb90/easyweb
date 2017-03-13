package com.luckylhb.easymvc;

import org.junit.Before;

/**
 * Created by lucky on 2017/3/11.
 */
public class TestBase {

    @Before
    public void before() {
        HelperLoader.init();
    }
}
