package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Challenge20_ConstructBSTFromPreorderTest {

    private final Challenge20_ConstructBSTFromPreorder testObject = new Challenge20_ConstructBSTFromPreorder();

    @Test
    void bstFromPreorder() {
        int[] preorder = new int[]{8, 5, 1, 7, 10, 12};
        assertEquals(8, testObject.bstFromPreorder(preorder).val);

        preorder = new int[]{};
        assertNull(testObject.bstFromPreorder(preorder));

        preorder = new int[]{1};
        assertEquals(1, testObject.bstFromPreorder(preorder).val);

        preorder = new int[]{50, 40, 35, 60, 55};
        assertEquals(50, testObject.bstFromPreorder(preorder).val);
    }
}