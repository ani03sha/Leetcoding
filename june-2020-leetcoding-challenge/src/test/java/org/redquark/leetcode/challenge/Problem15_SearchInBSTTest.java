package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcode.challenge.Problem15_SearchInBST.Node;

class Problem15_SearchInBSTTest {

    private final Problem15_SearchInBST testObject = new Problem15_SearchInBST();

    @Test
    void testSearchBST() {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        assertEquals(2, testObject.searchBST(root, 2).data);
        assertNull(testObject.searchBST(root, 5));
    }
}