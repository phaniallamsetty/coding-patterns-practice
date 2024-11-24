package com.pallamsetty.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StocksTest {
    private final Stocks stocks;

    public StocksTest() {
        stocks = new Stocks();
    }

    @Test
    public void testGetBestTimeToBuyAndSellStocks1() {
        int[] prices = { 7,1,5,3,6,4 };
        assertEquals(5, stocks.getBestTimeToBuyAndSellStocks(prices));
    }

    @Test
    public void testGetBestTimeToBuyAndSellStocks2() {
        int[] prices = { 7, 6, 4, 3, 1 };
        assertEquals(0, stocks.getBestTimeToBuyAndSellStocks(prices));
    }

    @Test
    public void testGetBestTimeToBuyAndSellStocks3() {
        int[] prices = { 10, 1, 5, 6, 7, 1 };
        assertEquals(6, stocks.getBestTimeToBuyAndSellStocks(prices));
    }

    @Test
    public void testGetBestTimeToBuyAndSellStocks4() {
        int[] prices = { 10, 8, 7, 5, 2 };
        assertEquals(0, stocks.getBestTimeToBuyAndSellStocks(prices));
    }
}
