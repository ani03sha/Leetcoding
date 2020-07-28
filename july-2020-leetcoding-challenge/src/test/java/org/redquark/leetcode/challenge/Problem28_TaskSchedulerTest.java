package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_TaskSchedulerTest {

    private final Problem28_TaskScheduler testObject = new Problem28_TaskScheduler();

    @Test
    void testLeastInterval() {
        char[] tasks = new char[]{'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        assertEquals(8, testObject.leastInterval(tasks, n));
    }
}