package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcode.challenge.Problem06_ConvertSortedListToBinarySearchTree.ListNode;
import static org.redquark.leetcode.challenge.Problem06_ConvertSortedListToBinarySearchTree.TreeNode;

class Problem06_ConvertSortedListToBinarySearchTreeTest {

    private final Problem06_ConvertSortedListToBinarySearchTree testObject =
            new Problem06_ConvertSortedListToBinarySearchTree();

    @Test
    void testSortedListToBST() {
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);
        TreeNode root = testObject.sortedListToBST(head);
        assertEquals(0, root.val);
        assertEquals(-3, root.left.val);
        assertEquals(-10, root.left.left.val);
        assertEquals(9, root.right.val);
        assertEquals(5, root.right.left.val);

        root = testObject.sortedListToBST(null);
        assertNull(root);

        head = new ListNode(0);
        root = testObject.sortedListToBST(head);
        assertEquals(0, root.val);

        head = new ListNode(1);
        head.next = new ListNode(3);
        root = testObject.sortedListToBST(head);
        assertEquals(3, root.val);
        assertEquals(1, root.left.val);
    }
}