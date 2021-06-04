package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_OpenTheLockTest {

    private final Problem04_OpenTheLock testObject = new Problem04_OpenTheLock();

    @Test
    void testOpenLock() {
        String[] deadends = new String[]{"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        assertEquals(6, testObject.openLock(deadends, target));

        deadends = new String[]{"8888"};
        target = "0009";
        assertEquals(1, testObject.openLock(deadends, target));

        deadends = new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"};
        target = "8888";
        assertEquals(-1, testObject.openLock(deadends, target));

        deadends = new String[]{"0000"};
        target = "8888";
        assertEquals(-1, testObject.openLock(deadends, target));

    }
}