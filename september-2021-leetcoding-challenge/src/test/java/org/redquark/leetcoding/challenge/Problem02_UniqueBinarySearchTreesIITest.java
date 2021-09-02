package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;
import org.redquark.leetcoding.challenge.Problem02_UniqueBinarySearchTreesII.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_UniqueBinarySearchTreesIITest {

    private final Problem02_UniqueBinarySearchTreesII testObject = new Problem02_UniqueBinarySearchTreesII();

    @Test
    public void testGenerateTrees() {
        int n = 3;
        List<TreeNode> expected = testObject.generateTrees(n);
        List<Integer> values = Arrays.asList(1, 1, 2, 3, 3);
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).val, values.get(i));
        }

        expected = testObject.generateTrees(1);
        values = Collections.singletonList(1);
        assertEquals(expected.get(0).val, values.get(0));
    }
}