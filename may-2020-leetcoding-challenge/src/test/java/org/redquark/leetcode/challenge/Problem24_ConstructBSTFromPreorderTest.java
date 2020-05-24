package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_ConstructBSTFromPreorderTest {

    private final Problem24_ConstructBSTFromPreorder testObject = new Problem24_ConstructBSTFromPreorder();

    @Test
    void testBSTFromPreorder() {
        int[] preorder = new int[]{8, 5, 1, 7, 10, 12};
        assertEquals(5, testObject.bstFromPreorder(preorder).left.data);
    }
}