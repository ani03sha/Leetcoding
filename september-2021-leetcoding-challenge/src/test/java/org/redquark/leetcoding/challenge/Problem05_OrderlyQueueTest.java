package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem05_OrderlyQueueTest {

    private final Problem05_OrderlyQueue testObject = new Problem05_OrderlyQueue();

    @Test
    public void testOrderlyQueue() {
        String s = "cba";
        int k = 1;
        assertEquals("acb", testObject.orderlyQueue(s, k));

        s = "baaca";
        k = 3;
        assertEquals("aaabc", testObject.orderlyQueue(s, k));
    }
}