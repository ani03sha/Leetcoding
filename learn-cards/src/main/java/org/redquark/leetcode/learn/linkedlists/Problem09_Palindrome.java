package org.redquark.leetcode.learn.linkedlists;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a singly linked list, determine if it is a palindrome.
 */
public class Problem09_Palindrome {

    public boolean isPalindrome(Node head) {
        /*
         * Find the middle of the linked list
         */
        // Slow and fast pointer
        Node slow = head;
        Node fast = head;
        // Loop until fast reaches end
        while (fast != null && fast.next != null) {
            // Move slow one step ahead
            slow = slow.next;
            // Move fast pointer two steps ahead
            fast = fast.next.next;
        }
        // At this point, the slow pointer will be at the middle of the linked list.
        // From here, we will reverse the second half of the linked list
        slow = reverse(slow);
        // Assign fast to the head again (for traversing left half of the linked list)
        fast = head;
        while (slow != null) {
            if (slow.data != fast.data) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    /**
     * @param node - middle of the original list
     * @return - head of the reverse second half
     */
    private Node reverse(Node node) {
        // Previous node of the middle node
        Node previous = null;
        // Next node of the middle
        Node next;
        // Loop until we reach to the end of the list
        while (node != null) {
            next = node.next;
            node.next = previous;
            previous = node;
            node = next;
        }
        return previous;
    }

    /**
     * This class represents each node in the linked list
     */
    static class Node {
        // Data to be stored in the node
        final int data;
        // Next pointer of the node
        Node next;

        /**
         * Constructor that will create a new node for the linked list
         */
        Node(int data) {
            this.data = data;
        }
    }
}
