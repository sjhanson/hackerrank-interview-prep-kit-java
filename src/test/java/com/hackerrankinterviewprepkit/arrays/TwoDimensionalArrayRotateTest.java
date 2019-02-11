package com.hackerrankinterviewprepkit.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertArrayEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TwoDimensionalArrayRotateTest {

    @Autowired
    TwoDimensionalArrayRotate twoDimensionalArrayRotate;

    @Test
    public void threeByThreeArrayRotatesToTheRight() {
        int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int[][] rotatedArr = {{3, 0, 1},{6, 4, 2},{7, 8, 5}};

        int [][] result = twoDimensionalArrayRotate.rotateArrayRight(arr);

        assertArrayEquals(rotatedArr, result);
    }

    @Test
    public void fourByFourArrayRotatesToTheRight() {
        // 0    1   2   3
        // 4    5   6   7
        // 8    9   10  11
        // 12   13  14  15

        int[][] arr = {{0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}
        };

        // 4    0   1   2
        // 8    5   6   3
        // 12   9   10  7
        // 13   14  15  11

        int[][] rotatedArr = {{4, 0, 1, 2},
                {8, 5, 6, 3},
                {12, 9, 10, 7},
                {13, 14, 15, 11}
        };

        int [][] result = twoDimensionalArrayRotate.rotateArrayRight(arr);

        assertArrayEquals(rotatedArr, result);
    }

    @Test
    public void fiveByFiveArrayRotatesToTheRight() {
        // 0    1   2   3   4
        // 5    6   7   8   9
        // 10   11  12  13  14
        // 15   16  17  18  19
        // 20   21  22  23  24

        int[][] arr = {{0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24},
        };

        // 5    0   1   2   3
        // 10   6   7   8   4
        // 15   11  12  13  9
        // 20   16  17  18  14
        // 21   22  23  24  19

        int[][] rotatedArr = {{5, 0, 1, 2, 3},
                {10, 6, 7, 8, 4},
                {15, 11, 12, 13, 9},
                {20, 16, 17, 18, 14},
                {21, 22, 23, 24, 19},
        };

        int [][] result = twoDimensionalArrayRotate.rotateArrayRight(arr);

        assertArrayEquals(rotatedArr, result);
    }
}
