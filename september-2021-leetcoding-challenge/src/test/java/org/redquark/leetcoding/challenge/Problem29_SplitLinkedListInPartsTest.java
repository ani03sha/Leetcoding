package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.redquark.leetcoding.challenge.Problem29_SplitLinkedListInParts.ListNode;

class Problem29_SplitLinkedListInPartsTest {

    private final Problem29_SplitLinkedListInParts testObject = new Problem29_SplitLinkedListInParts();

    @Test
    void testSplitListToParts() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        int k = 5;
        testObject.splitListToParts(head, k);


        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        testObject.splitListToParts(head, k);
    }
}