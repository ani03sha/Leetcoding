package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_UniqueBinarySearchTreesTest {

    private final Problem24_UniqueBinarySearchTrees testObject = new Problem24_UniqueBinarySearchTrees();

    @Test
    void testNumTrees() {
        assertEquals(5, testObject.numTrees(3));
        assertEquals(1, testObject.numTrees(1));
    }
}