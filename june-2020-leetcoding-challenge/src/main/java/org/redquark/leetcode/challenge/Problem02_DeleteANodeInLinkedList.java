package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * <p>
 * Given linked list -- head = [4,5,1,9], which looks like following:
 * <p>
 * Note:
 * <p>
 * The linked list will have at least two elements.
 * All of the nodes' values will be unique.
 * The given node will not be the tail and it will always be a valid node of the linked list.
 * Do not return anything from your function.
 */
public class Problem02_DeleteANodeInLinkedList {

    /**
     * @param node - node to be deleted
     */
    public void deleteNode(Node node) {
        // Base condition
        if (node == null) {
            return;
        }
        // Get the next node of the node to be deleted
        Node nextNode = node.next;
        // Set the data of the next node into the node to be deleted
        node.data = nextNode.data;
        // Set the next of the node to be deleted to the next of next of the node to be deleted
        node.next = nextNode.next;

    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}

