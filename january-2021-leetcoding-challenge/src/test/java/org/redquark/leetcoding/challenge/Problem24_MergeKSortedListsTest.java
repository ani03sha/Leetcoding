package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.redquark.leetcoding.challenge.Problem24_MergeKSortedLists.ListNode;

class Problem24_MergeKSortedListsTest {

    private final Problem24_MergeKSortedLists testObject = new Problem24_MergeKSortedLists();

    @Test
    void testMergeKLists() {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(6);

        printList(testObject.mergeKLists(new ListNode[]{head1, head2, head3}));

        printList(testObject.mergeKLists(new ListNode[]{}));

        printList(testObject.mergeKLists(new ListNode[]{null}));
    }

    private void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}