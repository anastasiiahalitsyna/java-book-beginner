package com.anastasiia.section5;

public class Queue {

    private char q[];
    private int putLoc, getLoc;

    Queue(Queue ob) {
        putLoc = ob.putLoc;
        getLoc = ob.getLoc;
        q = new char[ob.q.length];

        for (int i = getLoc; i < putLoc; i++) {
            q[i] = ob.q[i];
        }
    }

    Queue(char a[]) {
        putLoc = 0;
        getLoc = 0;
        q = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }

    Queue(int size) {
        q = new char[size];
        putLoc = getLoc = 0;
    }

    void put(char ch) {
        if (putLoc == q.length) {
            System.out.println("- Queue is full.");
            return;
        }
        q[putLoc++] = ch;
    }

    char get() {
        if (getLoc == putLoc) {
            System.out.println("-Queue is full.");
            return (char) 0;
        }
        return q[getLoc++];
    }


    public static void main(String[] args) {

        Queue q1 = new Queue(10);
        char[] name = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);
        char ch;
        int i;

        for (int j = 0; j < 10; j++) {
            q1.put((char) ('A' + j));
        }
        Queue q3 = new Queue(q1);

        System.out.println("Contents of q1: ");

        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Contents of q2: ");

        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Contents of q3: ");

        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }

        System.out.println("\n");




    }
}
