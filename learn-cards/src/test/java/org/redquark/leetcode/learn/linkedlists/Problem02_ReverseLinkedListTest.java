package org.redquark.leetcode.learn.linkedlists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_ReverseLinkedListTest {

    private final Problem02_ReverseLinkedList testObject = new Problem02_ReverseLinkedList();

    @BeforeEach
    void setUp() {
        for (int i = 10; i >= 1; i--) {
            testObject.add(i);
        }
    }

    @Test
    void reverseList() {
        assertEquals(10, testObject.reverseList(testObject.head).data);
        testObject.add(11);
    }
}