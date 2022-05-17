package com.anastasiia.section8;

public class DynQueue implements ICharQ {
    private char[] q;
    private int putLog, getLog;

    public DynQueue(int size) {
        q = new char[size];
        putLog = getLog = 0;
    }

    @Override
    public void put(char ch) {
        if (getLog == q.length) {
            char[] t = new char[q.length * 2];

            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
        q[putLog++] = ch;
    }

    @Override
    public char get() {
        if (getLog == putLog) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }

        return q[getLog++];
    }
}
