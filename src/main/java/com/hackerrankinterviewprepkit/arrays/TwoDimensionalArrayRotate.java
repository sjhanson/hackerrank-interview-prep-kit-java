package com.hackerrankinterviewprepkit.arrays;

import org.springframework.stereotype.Service;

@Service
public class TwoDimensionalArrayRotate {

    public int[][] rotateArrayRight(int[][] arr) {
        int prev = 0;
        int current = 0;

        boolean first = true;

        // First Row Forwards
        for (int f = 0; f < arr.length - 1; f++) {
            int row = 0;  // First Row
            int col = f + 1;

            if (first) {
                prev = arr[row][f];
                first = false;
            }

            current = arr[row][col];
            arr[row][col] = prev;
            prev = current;
        }

        // Last Column Forwards
        for (int l = 0; l < arr.length - 1; l ++) {
            int row = l + 1;
            int col = arr.length - 1;  // Last Column

            current = arr[row][col];
            arr[row][col] = prev;
            prev = current;
        }

        // Last Row Backwards
        for (int r = arr.length - 1; r > 0; r --) {
            int row = arr.length - 1; // Last Row
            int col = r - 1;

            current = arr[row][col];
            arr[row][col] = prev;
            prev = current;
        }

        // First Column Backwards
        for (int c = arr.length - 1; c > 0; c --) {
            int row = c - 1;
            int col = 0;  // First Column

            current = arr[row][col];
            arr[row][col] = prev;
            prev = current;
        }

        return arr;
    }
}
