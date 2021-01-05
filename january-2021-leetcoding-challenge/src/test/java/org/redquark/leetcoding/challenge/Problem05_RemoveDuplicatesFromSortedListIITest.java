package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.redquark.leetcoding.challenge.Problem05_RemoveDuplicatesFromSortedListII.ListNode;

class Problem05_RemoveDuplicatesFromSortedListIITest {

    private final Problem05_RemoveDuplicatesFromSortedListII testObject =
            new Problem05_RemoveDuplicatesFromSortedListII();

    @Test
    void testDeleteDuplicates() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode expected = testObject.deleteDuplicates(head);
        printList(expected);

        head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        expected = testObject.deleteDuplicates(head);
        printList(expected);
    }

    private void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}