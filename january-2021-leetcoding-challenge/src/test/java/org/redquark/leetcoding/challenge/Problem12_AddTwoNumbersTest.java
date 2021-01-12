package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.redquark.leetcoding.challenge.Problem12_AddTwoNumbers.ListNode;

class Problem12_AddTwoNumbersTest {

    private final Problem12_AddTwoNumbers testObject = new Problem12_AddTwoNumbers();

    @Test
    void addTwoNumbers() {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);

        ListNode result = testObject.addTwoNumbers(head1, head2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}