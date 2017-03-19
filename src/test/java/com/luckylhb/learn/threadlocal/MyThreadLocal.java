package com.luckylhb.learn.threadlocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dearl on 2017/3/19.
 */
public class MyThreadLocal<T> {

    private Map<Thread, T> container = Collections.synchronizedMap(new HashMap<Thread, T>());

    public void set(T t) {
        container.put(Thread.currentThread(), t);
    }

    public T get() {
        Thread thread = Thread.currentThread();

        T value = container.get(thread);
        if (value == null || !container.containsKey(thread)) {
            value = initialValue();
            container.put(thread, value);
        }

        return value;
    }

    public void remove() {
        container.remove(Thread.currentThread());
    }

    protected T initialValue() {
        return null;
    }

}
