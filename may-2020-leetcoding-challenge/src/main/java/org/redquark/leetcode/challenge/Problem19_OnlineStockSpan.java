package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Write a class StockSpanner which collects daily price quotes for some stock, and returns the span of that stock's
 * price for the current day.
 * <p>
 * The span of the stock's price today is defined as the maximum number of consecutive days (starting from today
 * and going backwards) for which the price of the stock was less than or equal to today's price.
 * <p>
 * For example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85], then the stock
 * spans would be [1, 1, 1, 2, 1, 4, 6].
 * <p>
 * Note:
 * <p>
 * Calls to StockSpanner.next(int price) will have 1 <= price <= 10^5.
 * There will be at most 10000 calls to StockSpanner.next per test case.
 * There will be at most 150000 calls to StockSpanner.next across all test cases.
 * The total time limit for this problem has been reduced by 75% for C++, and 50% for all other languages.
 */
public class Problem19_OnlineStockSpan {

    private final List<Integer> list;
    // Previous bigger price of list[i]
    private final List<Integer> previous;

    /**
     * Constructor
     */
    public Problem19_OnlineStockSpan() {
        list = new ArrayList<>();
        previous = new ArrayList<>();
    }

    /**
     * @param price - input price
     * @return span
     */
    public int next(int price) {
        list.add(price);
        int i = list.size() - 2;
        while (!previous.isEmpty() && i >= 0 && list.get(i) <= price) {
            i = previous.get(i);
        }
        previous.add(i);
        return list.size() - 1 - i;
    }
}
