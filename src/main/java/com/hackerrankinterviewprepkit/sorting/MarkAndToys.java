package com.hackerrankinterviewprepkit.sorting;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class MarkAndToys {

    static Logger LOG = LoggerFactory.getLogger(MarkAndToys.class);

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);

        int totalCost = 0;
        int toyCount = 0;

        for (int i = 0; i < prices.length; i++) {
            int currentCost = prices[i];

            if ((totalCost + currentCost) <= k) {
                totalCost += currentCost;
                toyCount++;
            } else {
                break;
            }
        }

        return toyCount;
    }
}
