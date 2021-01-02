package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem02_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree.TreeNode;

class Problem02_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTreeTest {

    private final Problem02_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree testObject =
            new Problem02_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree();

    @Test
    void testGetTargetCopy() {
        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);

        TreeNode cloned = new TreeNode(7);
        cloned.left = new TreeNode(4);
        cloned.right = new TreeNode(3);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(19);

        assertEquals(cloned.right, testObject.getTargetCopy(original, cloned, original.right));

        original = new TreeNode(7);
        cloned = new TreeNode(7);

        assertEquals(cloned, testObject.getTargetCopy(original, cloned, original));

        original = new TreeNode(8);
        original.right = new TreeNode(6);
        original.right.right = new TreeNode(5);
        original.right.right.right = new TreeNode(4);
        original.right.right.right.right = new TreeNode(3);
        original.right.right.right.right.right = new TreeNode(2);
        original.right.right.right.right.right.right = new TreeNode(1);

        cloned = new TreeNode(8);
        cloned.right = new TreeNode(6);
        cloned.right.right = new TreeNode(5);
        cloned.right.right.right = new TreeNode(4);
        cloned.right.right.right.right = new TreeNode(3);
        cloned.right.right.right.right.right = new TreeNode(2);
        cloned.right.right.right.right.right.right = new TreeNode(1);

        assertEquals(cloned.right.right.right, testObject.getTargetCopy(original, cloned, original.right.right.right));

        original = new TreeNode(1);
        original.left = new TreeNode(2);
        original.right = new TreeNode(3);
        original.left.left = new TreeNode(4);
        original.left.right = new TreeNode(5);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(7);
        original.left.left.left = new TreeNode(8);
        original.left.left.right = new TreeNode(9);
        original.left.right.left = new TreeNode(10);

        cloned = new TreeNode(1);
        cloned.left = new TreeNode(2);
        cloned.right = new TreeNode(3);
        cloned.left.left = new TreeNode(4);
        cloned.left.right = new TreeNode(5);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(7);
        cloned.left.left.left = new TreeNode(8);
        cloned.left.left.right = new TreeNode(9);
        cloned.left.right.left = new TreeNode(10);

        assertEquals(cloned.left.right, testObject.getTargetCopy(original, cloned, original.left.right));

        original = new TreeNode(1);
        original.left = new TreeNode(2);
        original.left.left = new TreeNode(3);

        cloned = new TreeNode(1);
        cloned.left = new TreeNode(2);
        cloned.left.left = new TreeNode(3);

        assertEquals(cloned.left, testObject.getTargetCopy(original, cloned, original.left));
    }
}