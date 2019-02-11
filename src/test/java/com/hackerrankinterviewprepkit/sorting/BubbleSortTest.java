package com.hackerrankinterviewprepkit.sorting;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BubbleSortTest {

    @Test
    public void shouldReturnThreeWhenThreeSwapsAreNeeded() {
        int[] arr = {3, 2, 1};

        int result = BubbleSort.countSwaps(arr);

        assertEquals(3, result);
    }

    @Test
    public void shouldReturnZeroWhenNoSwapsAreNeeded() {
        int[] arr = {1, 2, 3};

        int result = BubbleSort.countSwaps(arr);

        assertEquals(0, result);
    }

}
