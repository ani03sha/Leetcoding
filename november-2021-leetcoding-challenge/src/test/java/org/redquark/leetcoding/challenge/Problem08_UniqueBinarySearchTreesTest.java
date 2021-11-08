package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_UniqueBinarySearchTreesTest {

    private final Problem08_UniqueBinarySearchTrees testObject = new Problem08_UniqueBinarySearchTrees();

    @Test
    void testNumTrees() {
        assertEquals(1, testObject.numTrees(0));
        assertEquals(1, testObject.numTrees(1));
        assertEquals(2, testObject.numTrees(2));
        assertEquals(5, testObject.numTrees(3));
        assertEquals(14, testObject.numTrees(4));
        assertEquals(42, testObject.numTrees(5));
        assertEquals(132, testObject.numTrees(6));
        assertEquals(429, testObject.numTrees(7));
        assertEquals(1430, testObject.numTrees(8));
        assertEquals(4862, testObject.numTrees(9));
        assertEquals(16796, testObject.numTrees(10));
        assertEquals(58786, testObject.numTrees(11));
        assertEquals(208012, testObject.numTrees(12));
        assertEquals(742900, testObject.numTrees(13));
        assertEquals(2674440, testObject.numTrees(14));
        assertEquals(9694845, testObject.numTrees(15));
        assertEquals(35357670, testObject.numTrees(16));
        assertEquals(129644790, testObject.numTrees(17));
        assertEquals(477638700, testObject.numTrees(18));
        assertEquals(1767263190, testObject.numTrees(19));
    }
}