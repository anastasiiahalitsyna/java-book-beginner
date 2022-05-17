package com.anastasiia.section5;

import java.util.Arrays;

public class SelfTest3 {
    public static void main(String[] args) {
        double average = 0;
        double sum = 0;
        double d1 = 8.0;
        double d2 = 9.0;
        double d3 = 87.0;
        double d4 = 766.0;
        double d5 = 665.0;
        double d6 = 5.0;
        double d7 = 2.0;
        double d8 = 33.0;
        double d9 = 77.0;
        double d10 = 56.0;
        double[] myDoubleArray = new double[]{d1, d2, d3, d4, d5, d6, d7, d8, d9, d10};
        for (int i = 0; i < myDoubleArray.length; i++) {
            sum += myDoubleArray[i];
            average = sum / myDoubleArray.length ;
        }
        System.out.println(average);

    }
}
