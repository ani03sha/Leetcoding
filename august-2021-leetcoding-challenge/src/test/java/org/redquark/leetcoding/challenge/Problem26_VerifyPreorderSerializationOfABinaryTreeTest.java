package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem26_VerifyPreorderSerializationOfABinaryTreeTest {

    private final Problem26_VerifyPreorderSerializationOfABinaryTree testObject =
            new Problem26_VerifyPreorderSerializationOfABinaryTree();

    @Test
    void testIsValidSerialization() {
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        assertTrue(testObject.isValidSerialization(preorder));

        preorder = "1,#";
        assertFalse(testObject.isValidSerialization(preorder));

        preorder = "9,#,#,1";
        assertFalse(testObject.isValidSerialization(preorder));
    }
}