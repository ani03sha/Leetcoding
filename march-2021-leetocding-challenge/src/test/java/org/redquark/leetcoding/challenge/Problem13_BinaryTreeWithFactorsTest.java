package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_BinaryTreeWithFactorsTest {

    private final Problem13_BinaryTreeWithFactors testObject = new Problem13_BinaryTreeWithFactors();

    @Test
    void testNumFactoredBinaryTrees() {
        int[] arr = new int[]{2, 4};
        assertEquals(3, testObject.numFactoredBinaryTrees(arr));

        arr = new int[]{2, 4, 5, 10};
        assertEquals(7, testObject.numFactoredBinaryTrees(arr));
    }
}