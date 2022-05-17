package com.anastasiia.section8;

public class CircularQueue implements ICharQ {
    private char[] q;
    private int putLog, getLog;

    public CircularQueue(int size) {
        q = new char[size + 1];
        putLog = getLog = 0;

    }

    @Override
    public void put(char ch) {
        if (putLog + 1 == getLog | ((putLog == q.length - 1) & (getLog == 0))) {
            System.out.println("- Queue is full.");
            return;
        }
        q[putLog++] = ch;
        if (putLog == q.length) {
            putLog = 0;
        }
    }

    @Override
    public char get() {

        if (getLog == putLog) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }

        char ch = q[getLog++];
        if (getLog == q.length) {
            getLog = 0;
        }
        return ch;
    }
}
