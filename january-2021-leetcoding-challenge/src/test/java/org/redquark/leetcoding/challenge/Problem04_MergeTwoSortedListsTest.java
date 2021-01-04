package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.redquark.leetcoding.challenge.Problem04_MergeTwoSortedLists.ListNode;

class Problem04_MergeTwoSortedListsTest {

    private final Problem04_MergeTwoSortedLists testObject = new Problem04_MergeTwoSortedLists();

    @Test
    void testMergeTwoLists() {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        printList(testObject.mergeTwoLists(head1, head2));

        printList(testObject.mergeTwoLists(null, null));

        head2 = new ListNode(0);
        printList(testObject.mergeTwoLists(null, head2));
    }

    private void printList(ListNode mergedList) {
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
        System.out.println();
    }
}