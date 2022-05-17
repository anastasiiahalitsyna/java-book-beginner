package com.anastasiia.section6;

public class QuickSort {

    static void qsort(char[] items) {
        qs(items, 0, items.length - 1);
    }

    private static void qs(char[] items, int left, int right) {
        int i, j;
        char x, y;
        i = left;
        j = right;
        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[i]) && (j > left)) j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;

            }
        } while (i <= j);

        if (left < j) {
            qs(items, left, j);
        }
        if (i < right) {
            qs(items, i, right);
        }
    }


    public static void main(String[] args) {
        char[] a = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.println("Original array:  ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]);
        }

        System.out.println();

        QuickSort.qsort(a);

        System.out.println("Sorted array: ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]);
        }
    }
}
