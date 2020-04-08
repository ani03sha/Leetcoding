package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge08_MiddleOfLinkedListTest {

    private Challenge08_MiddleOfLinkedList testObject;

    @Test
    void middleNode() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        testObject = new Challenge08_MiddleOfLinkedList();
        for (int value : input) {
            testObject.addNode(value);
        }
        assertEquals(3, testObject.middleNode(testObject.head).val);

        input = new int[]{1, 2, 3, 4, 5, 6};
        testObject = new Challenge08_MiddleOfLinkedList();
        for (int value : input) {
            testObject.addNode(value);
        }
        assertEquals(4, testObject.middleNode(testObject.head).val);

        input = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        testObject = new Challenge08_MiddleOfLinkedList();
        for (int value : input) {
            testObject.addNode(value);
        }
        assertEquals(70, testObject.middleNode(testObject.head).val);

    }
}