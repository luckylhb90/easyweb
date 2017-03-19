package com.luckylhb.learn.threadlocal;

/**
 * Created by dearl on 2017/3/19.
 */
public class ClientThread implements Runnable {

    private Sequence sequence;

    public ClientThread(Sequence sequence) {
        this.sequence = sequence;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("%s ==> %s", Thread.currentThread().getName(), sequence.getNumber()));
        }
    }
}
