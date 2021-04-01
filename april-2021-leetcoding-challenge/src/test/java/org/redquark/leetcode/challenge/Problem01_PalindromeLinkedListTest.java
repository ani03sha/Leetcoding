package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcode.challenge.Problem01_PalindromeLinkedList.ListNode;

class Problem01_PalindromeLinkedListTest {

    private final Problem01_PalindromeLinkedList testObject = new Problem01_PalindromeLinkedList();

    @Test
    void testIsPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        assertTrue(testObject.isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        assertFalse(testObject.isPalindrome(head));
    }
}