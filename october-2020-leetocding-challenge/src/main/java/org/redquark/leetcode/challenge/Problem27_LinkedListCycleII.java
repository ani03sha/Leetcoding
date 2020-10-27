package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by
 * continuously following the next pointer.
 * <p>
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 * <p>
 * Notice that you should not modify the linked list.
 * <p>
 * Follow up:
 * Can you solve it using O(1) (i.e. constant) memory?
 * <p>
 * Constraints:
 * <p>
 * The number of the nodes in the list is in the range [0, 10^4].
 * -10^5 <= Node.val <= 10^5
 * pos is -1 or a valid index in the linked-list.
 */
public class Problem27_LinkedListCycleII {

    /**
     * @param head - head of the given linked list
     * @return node where the cycle begins
     */
    public Node detectCycle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (slow == fast) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        } else {
            return null;
        }
    }

    static class Node {
        final int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
