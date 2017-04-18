package com.luckylhb.easymvc.helper;

import com.luckylhb.easymvc.TestBase;
import com.luckylhb.easymvc.bean.Handler;
import com.luckylhb.easymvc.bean.Request;
import org.junit.Test;

import java.util.Map;

/**
 * Created by lucky on 2017/3/12.
 */
public class TestControllerHelper extends TestBase {

    @Test
    public void test_getActionMap() {
        Map<Request, Handler> requestHandlerMap = ControllerHelper.getActionMap();
        for (Map.Entry<Request, Handler> entry : requestHandlerMap.entrySet()) {
            Request request = entry.getKey();
            Handler handler = entry.getValue();
            System.out.println(request.getRequestMethod() + "----" + request.getRequestPath());
            System.out.println(handler.getControllerClass() + "=====" + handler.getActionMethod());
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
