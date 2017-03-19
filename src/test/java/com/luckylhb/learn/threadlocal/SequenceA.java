package com.luckylhb.learn.threadlocal;

/**
 * Created by dearl on 2017/3/19.
 */
public class SequenceA implements Sequence {

    private static int number = 0;

    public int getNumber() {
        return number ++;
    }

    public static void main(String[] args) {
        Sequence sequence = new SequenceA();

        Thread thread1 = new Thread(new ClientThread(sequence));
        Thread thread2 = new Thread(new ClientThread(sequence));
        Thread thread3 = new Thread(new ClientThread(sequence));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
