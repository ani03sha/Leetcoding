package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem31_MaximumDifferenceBetweenNodeAndAncestor.TreeNode;

class Problem31_MaximumDifferenceBetweenNodeAndAncestorTest {

    private final Problem31_MaximumDifferenceBetweenNodeAndAncestor testObject =
            new Problem31_MaximumDifferenceBetweenNodeAndAncestor();

    @Test
    void testMaxAncestorDiff() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(13);
        assertEquals(7, testObject.maxAncestorDiff(root));
    }
}