package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem30_MapSumPairs.MapSum;

class Problem30_MapSumPairsTest {

    @Test
    public void test() {
        MapSum testObject = new MapSum();
        testObject.insert("apple", 3);
        assertEquals(3, testObject.sum("ap"));
        testObject.insert("app", 2);
        assertEquals(5, testObject.sum("ap"));
    }
}