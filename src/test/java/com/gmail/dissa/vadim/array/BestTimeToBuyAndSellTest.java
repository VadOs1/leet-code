package com.gmail.dissa.vadim.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellTest {
    @Test
    void testContainsDuplicateMaxProfit() {
        assertEquals(1, BestTimeToBuyAndSell.maxProfit(new int[]{7, 6, 6, 6, 6, 7}));
        assertEquals(1, BestTimeToBuyAndSell.maxProfit(new int[]{6, 6, 6, 6, 6, 7}));
        assertEquals(0, BestTimeToBuyAndSell.maxProfit(new int[]{6, 6, 6, 6, 6, 6}));
        assertEquals(0, BestTimeToBuyAndSell.maxProfit(new int[]{6, 1}));
        assertEquals(6, BestTimeToBuyAndSell.maxProfit(new int[]{1, 7}));
        assertEquals(12, BestTimeToBuyAndSell.maxProfit(new int[]{1, 7, 2, 6, 3, 5, 5, 0}));
        assertEquals(13, BestTimeToBuyAndSell.maxProfit(new int[]{1, 7, 2, 6, 3, 5, 5, 6}));
        assertEquals(12, BestTimeToBuyAndSell.maxProfit(new int[]{1, 7, 2, 6, 3, 5}));
        assertEquals(7, BestTimeToBuyAndSell.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, BestTimeToBuyAndSell.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, BestTimeToBuyAndSell.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
