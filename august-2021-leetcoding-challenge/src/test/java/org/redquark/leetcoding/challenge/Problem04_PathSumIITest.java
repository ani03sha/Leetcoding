package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem04_PathSumII.TreeNode;

class Problem04_PathSumIITest {

    private final Problem04_PathSumII testObject = new Problem04_PathSumII();

    @Test
    void testPathSum() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        int targetSum = 22;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(5, 4, 11, 2));
        expected.add(Arrays.asList(5, 8, 4, 5));
        assertEquals(expected, testObject.pathSum(root, targetSum));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        targetSum = 5;
        expected = new ArrayList<>();
        assertEquals(expected, testObject.pathSum(root, targetSum));

        root = new TreeNode(1);
        root.right = new TreeNode(2);
        targetSum = 0;
        assertEquals(expected, testObject.pathSum(root, targetSum));
    }
}