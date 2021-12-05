package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem05_HouseRobberIII.TreeNode;

class Problem05_HouseRobberIIITest {

    private final Problem05_HouseRobberIII testObject = new Problem05_HouseRobberIII();

    @Test
    void testRob() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
        assertEquals(7, testObject.rob(root));

        root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
        assertEquals(9, testObject.rob(root));
    }
}