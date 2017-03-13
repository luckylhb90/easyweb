package com.luckylhb.easymvc.annotations;

/**
 * Created by lucky on 2017/3/11.
 */
@Controller
public class TestControllerBean {

    private String key;

    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Action("get:/hello")
    public void helloworld() {
        System.out.println("helloworld");
    }
}
