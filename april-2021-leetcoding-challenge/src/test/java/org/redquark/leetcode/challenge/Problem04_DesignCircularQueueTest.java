package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcode.challenge.Problem04_DesignCircularQueue.MyCircularQueue;

class Problem04_DesignCircularQueueTest {

    @Test
    void test() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        assertTrue(myCircularQueue.enQueue(1));
        assertTrue(myCircularQueue.enQueue(2));
        assertTrue(myCircularQueue.enQueue(3));
        assertFalse(myCircularQueue.enQueue(4));
        assertEquals(3, myCircularQueue.Rear());
        assertTrue(myCircularQueue.isFull());
        assertTrue(myCircularQueue.deQueue());
        assertTrue(myCircularQueue.enQueue(4));
        assertEquals(4, myCircularQueue.Rear());
    }
}