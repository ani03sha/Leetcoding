package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
 * <p>
 * The length of each part should be as equal as possible: no two parts should have a size differing by more than one.
 * This may lead to some parts being null.
 * <p>
 * The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have
 * a size greater than or equal to parts occurring later.
 * <p>
 * Return an array of the k parts.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 1000].
 * 0 <= Node.val <= 1000
 * 1 <= k <= 50
 */
public class Problem29_SplitLinkedListInParts {

    public ListNode[] splitListToParts(ListNode head, int k) {
        // Output array to store list parts
        ListNode[] output = new ListNode[k];
        // Special case
        if (head == null || k == 0) {
            return output;
        }
        // Count the total number of nodes in the list
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        // Special case where number of nodes in the original list is
        // less than k. In that case, every part will have at max only
        // one node.
        if (n < k) {
            temp = head;
            for (int i = 0; i < n; i++) {
                output[i] = new ListNode(temp.val);
                temp = temp.next;
            }
            return output;
        }
        // Number of nodes in each parts
        int nodesInEachPart = n / k;
        // Number of first x parts with extra node
        int partsWithExtraNode = n % k;
        // Reset the reference to the head
        temp = head;
        // Loop through for every part
        for (int i = 0; i < k && temp != null; i++) {
            // Head of the current part
            ListNode currentHead = new ListNode(temp.val);
            // Reference of the currentHead
            ListNode currentTemp = currentHead;
            // Added remaining nodes in the current part
            for (int j = 1; j < nodesInEachPart; j++) {
                currentTemp.next = new ListNode(temp.next.val);
                currentTemp = currentTemp.next;
                temp = temp.next;
            }
            // Check if we are still doing stuff for first few parts
            // which have extra node
            if (partsWithExtraNode > 0) {
                if (temp.next != null) {
                    currentTemp.next = new ListNode(temp.next.val);
                    temp = temp.next;
                    partsWithExtraNode--;
                }
            }
            // Put the current head at the index of the first part
            output[i] = currentHead;
            temp = temp.next;
        }
        return output;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
