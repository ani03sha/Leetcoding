package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem29_FlipBinaryTreeToMatchPreorderTraversal.TreeNode;

class Problem29_FlipBinaryTreeToMatchPreorderTraversalTest {

    private final Problem29_FlipBinaryTreeToMatchPreorderTraversal testObject =
            new Problem29_FlipBinaryTreeToMatchPreorderTraversal();

    @Test
    void testFlipMatchVoyage() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        int[] voyage = new int[]{2, 1};
        List<Integer> expected = Collections.singletonList(-1);
        assertEquals(expected, testObject.flipMatchVoyage(root, voyage));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        voyage = new int[]{1, 3, 2};
        expected = Collections.singletonList(1);
        assertEquals(expected, testObject.flipMatchVoyage(root, voyage));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        voyage = new int[]{1, 2, 3};
        expected = Collections.emptyList();
        assertEquals(expected, testObject.flipMatchVoyage(root, voyage));
    }
}