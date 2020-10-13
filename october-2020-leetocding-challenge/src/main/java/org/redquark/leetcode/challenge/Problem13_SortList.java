package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the head of a linked list, return the list after sorting it in ascending order.
 * <p>
 * Follow up: Can you sort the linked list in O(n logn) time and O(1) memory
 * (i.e. constant space)?
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 5 * 10^4].
 * -10^5 <= Node.val <= 10^5
 */
public class Problem13_SortList {

    /**
     * @param head - head of the linked list
     * @return sorted linked list
     */
    public Node sortList(Node head) {
        // Base condition
        if (head == null || head.next == null) {
            return head;
        }
        // Find the middle of the list using two-pointer technique
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Heads of left and right lists
        Node left = head;
        Node right = slow.next;
        // Disconnect left list from right list
        slow.next = null;
        // Sort recursively
        left = sortList(left);
        right = sortList(right);
        // Return merged list
        return merge(left, right);
    }

    private Node merge(Node left, Node right) {
        // Dummy node
        Node dummy = new Node(-1);
        // Current node
        Node current = dummy;
        // Loop thrugh left and right lists
        while (left != null || right != null) {
            if (left == null) {
                current.next = right;
                break;
            }
            if (right == null) {
                current.next = left;
                break;
            }
            if (left.data < right.data) {
                current.next = left;
                left = left.next;
                current = current.next;
            } else {
                current.next = right;
                right = right.next;
                current = current.next;
            }
        }
        return dummy.next;
    }

    static class Node {
        final int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
