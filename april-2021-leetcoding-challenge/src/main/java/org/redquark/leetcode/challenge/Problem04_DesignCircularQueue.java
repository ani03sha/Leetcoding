package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Design your implementation of the circular queue. The circular queue is a linear data structure
 * in which the operations are performed based on FIFO (First In First Out) principle and the last
 * position is connected back to the first position to make a circle. It is also called "Ring Buffer".
 * <p>
 * One of the benefits of the circular queue is that we can make use of the spaces in front of the queue.
 * In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a
 * space in front of the queue. But using the circular queue, we can use the space to store new values.
 * <p>
 * Implementation the MyCircularQueue class:
 * <p>
 * - MyCircularQueue(k) Initializes the object with the size of the queue to be k.
 * - int Front() Gets the front item from the queue. If the queue is empty, return -1.
 * - int Rear() Gets the last item from the queue. If the queue is empty, return -1.
 * - boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
 * - boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
 * - boolean isEmpty() Checks whether the circular queue is empty or not.
 * - boolean isFull() Checks whether the circular queue is full or not.
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= 1000
 * 0 <= value <= 1000
 * At most 3000 calls will be made to enQueue, deQueue, Front, Rear, isEmpty, and isFull.
 * <p>
 * <p>
 * Follow up: Could you solve the problem without using the built-in queue?
 */
public class Problem04_DesignCircularQueue {

    static class MyCircularQueue {
        // Underlying array
        private final int[] a;
        // Front and rear of the queue
        private int front;
        private int rear = -1;
        // Length of the queue
        private int length = 0;

        public MyCircularQueue(int k) {
            a = new int[k];
        }

        public boolean enQueue(int value) {
            if (!isFull()) {
                rear = (rear + 1) % a.length;
                a[rear] = value;
                length++;
                return true;
            }
            return false;
        }

        public boolean deQueue() {
            if (!isEmpty()) {
                front = (front + 1) % a.length;
                length--;
                return true;
            }
            return false;
        }

        public int Front() {
            return isEmpty() ? -1 : a[front];
        }

        public int Rear() {
            return isEmpty() ? -1 : a[rear];
        }

        public boolean isEmpty() {
            return length == 0;
        }

        public boolean isFull() {
            return length == a.length;
        }
    }
}
