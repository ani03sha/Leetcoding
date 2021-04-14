package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.redquark.leetcode.challenge.Problem14_PartitionList.ListNode;

class Problem14_PartitionListTest {

    private final Problem14_PartitionList testObject = new Problem14_PartitionList();

    @Test
    void testPartition() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        int x = 3;
        ListNode expected = testObject.partition(head, x);
        while (expected != null) {
            System.out.print(expected.val + " ");
            expected = expected.next;
        }

        System.out.println();

        head = new ListNode(2);
        head.next = new ListNode(1);
        x = 2;
        expected = testObject.partition(head, x);
        while (expected != null) {
            System.out.print(expected.val + " ");
            expected = expected.next;
        }
    }
}