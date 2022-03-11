package com.anastasiia.section3;

public class SelfTest10 {
    public static void main(String[] args)
            throws java.io.IOException {
        char xxxx;
        System.out.println("Please choose one litter");
        xxxx = (char) System.in.read();
        if (xxxx >= 97 && xxxx <= 122) {
            xxxx = (char) (xxxx - 32);
        } else if (xxxx >= 65 && xxxx <= 90) {
            xxxx = (char) (xxxx + 32);
        } else {
            System.out.println(" it is not a litter ");
        }
        System.out.println(xxxx);
        System.in.read();
    }
}
