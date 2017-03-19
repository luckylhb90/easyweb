package com.luckylhb.learn.threadlocal;

/**
 * Created by dearl on 2017/3/19.
 */
public class SequenceC implements Sequence {

    private static MyThreadLocal<Integer> numberContainer =
            new MyThreadLocal<Integer>() {
                @Override
                protected Integer initialValue() {
                    return 0;
                }
            };

    public int getNumber() {
        numberContainer.set(numberContainer.get() + 1);
        return numberContainer.get();
    }

    public static void main(String[] args) {
        Sequence sequence = new SequenceC();

        Thread thread1 = new Thread(new ClientThread(sequence));
        Thread thread2 = new Thread(new ClientThread(sequence));
        Thread thread3 = new Thread(new ClientThread(sequence));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
