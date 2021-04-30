package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_PowerfulIntegersTest {

    private final Problem30_PowerfulIntegers testObject = new Problem30_PowerfulIntegers();

    @Test
    void testPowerfulIntegers() {
        int x = 2;
        int y = 3;
        int bound = 10;
        List<Integer> expected = Arrays.asList(2, 4, 10, 3, 5, 7, 9);
        assertEquals(expected, testObject.powerfulIntegers(x, y, bound));

        x = 3;
        y = 5;
        bound = 15;
        expected = Arrays.asList(2, 6, 4, 8, 10, 14);
        assertEquals(expected, testObject.powerfulIntegers(x, y, bound));
    }
}