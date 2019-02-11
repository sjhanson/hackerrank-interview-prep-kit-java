package com.hackerrankinterviewprepkit.sorting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BubbleSort {

    private static Logger LOG = LoggerFactory.getLogger(BubbleSort.class);

    static int countSwaps(int[] a) {
        int n = a.length;
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {

                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {

                    // Swap elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swaps ++;
                }
            }
        }

        String one = "Array is sorted in %s swaps.";
        String two = "First Element: %s";
        String three = "Last Element: %s";

        System.out.print(String.format(one, swaps));
        System.out.print(String.format(two, a[0]));
        System.out.print(String.format(three, a[a.length - 1]));

        return swaps;
    }
}
