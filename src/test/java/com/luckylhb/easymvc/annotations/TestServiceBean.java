package com.luckylhb.easymvc.annotations;

/**
 * Created by lucky on 2017/3/11.
 */
@Service
public class TestServiceBean {

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

    @Override
    public String toString() {
        System.out.println("TestServiceBean{}");
        return "TestServiceBean{}";
    }
}
