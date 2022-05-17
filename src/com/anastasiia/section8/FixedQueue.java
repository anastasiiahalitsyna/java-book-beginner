package com.anastasiia.section8;

public class FixedQueue implements ICharQ {

    private char[] q;
    private int putLog, getLog;

    public FixedQueue(int size) {
        q = new char[size];
        putLog = getLog = 0;

    }

    @Override
    public void put(char ch) {
        if (getLog == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putLog++] = ch;
    }

    @Override
    public char get() {
        if (getLog == putLog) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getLog++];
    }
}
