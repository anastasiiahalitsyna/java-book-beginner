package com.anastasiia.section1;

import java.util.Scanner;

public class SelfTestGravity {
    public static void main(String[] args) {
        double g1 = 1.7;
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        double F = m * g1;
        System.out.println(F);
    }

}
