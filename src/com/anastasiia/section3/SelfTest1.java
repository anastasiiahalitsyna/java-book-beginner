package com.anastasiia.section3;

public class SelfTest1 {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("please type something");
        int spaceCount = 0;

        while (true) {
            char ch;
            ch = (char) System.in.read();

            if (ch == '.') {
                break;
            } else if (ch == ' ') {
                spaceCount++;
            }
        }

        System.out.printf("You pressed %d times to space key\n", spaceCount);
    }
}
