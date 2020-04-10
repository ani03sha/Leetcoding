package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge10_MinStackTest {

    private Challenge10_MinStack testObject = new Challenge10_MinStack();

    @Test
    void getMin() {
        testObject.push(6);
        testObject.push(-3);
        testObject.push(9);
        testObject.push(-2);
        assertEquals(-3, testObject.getMin());
        testObject.pop();
        testObject.pop();
        testObject.pop();
        assertEquals(6, testObject.getMin());
        assertEquals(6, testObject.top());
        testObject.push(0);
        testObject.push(-1);
        testObject.push(7);
        assertEquals(7, testObject.top());
        assertEquals(-1, testObject.getMin());
        testObject.pop();
        testObject.pop();
        assertEquals(0, testObject.getMin());
    }
}