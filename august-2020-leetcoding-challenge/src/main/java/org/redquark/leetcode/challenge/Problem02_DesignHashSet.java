package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Design a HashSet without using any built-in hash table libraries.
 * <p>
 * To be specific, your design should include these functions:
 * <p>
 * add(value): Insert a value into the HashSet.
 * contains(value) : Return whether the value exists in the HashSet or not.
 * remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.
 * <p>
 * Note:
 * <p>
 * All values will be in the range of [0, 1000000].
 * The number of operations will be in the range of [1, 10000].
 * Please do not use the built-in HashSet library.
 */
public class Problem02_DesignHashSet {
    // Size of the HashSet
    private final int size;
    // Array
    private final Node[] array;

    public Problem02_DesignHashSet() {
        this.size = 100;
        this.array = new Node[size];
    }

    public void add(int key) {
        // Index of the key (hashing)
        int index = key % this.size;
        // If the index is empty
        if (this.array[index] == null) {
            this.array[index] = new Node(key);
        } else {
            Node p = this.array[index];
            while (p != null && p.data != key) {
                p = p.next;
            }
            if (p != null) {
                return;
            }
            Node newHead = new Node(key);
            newHead.next = this.array[index];
            this.array[index] = newHead;
        }
    }

    public void remove(int key) {
        int index = key % this.size;
        if (this.array[index] != null) {
            Node p = this.array[index];
            if (p.data == key) {
                this.array[index] = p.next;
                return;
            }
            while (p.next != null && p.next.data != key) {
                p = p.next;
            }
            if (p.next == null) {
                return;
            }
            p.next = p.next.next;
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int index = key % this.size;
        if (this.array[index] == null) {
            return false;
        }
        Node p = this.array[index];
        while (p != null && p.data != key) {
            p = p.next;
        }
        return p != null;
    }

    static class Node {
        final int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
