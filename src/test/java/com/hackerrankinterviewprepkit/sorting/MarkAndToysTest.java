package com.hackerrankinterviewprepkit.sorting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarkAndToysTest {

    @Test
    public void shouldReturnFourToysWhenBudgetIsFifty() {
        int[] prices = {1, 12, 5, 111, 200, 1000, 10};
        int budget = 50;

        int result = MarkAndToys.maximumToys(prices, budget);
        assertEquals(4, result);
    }
}
