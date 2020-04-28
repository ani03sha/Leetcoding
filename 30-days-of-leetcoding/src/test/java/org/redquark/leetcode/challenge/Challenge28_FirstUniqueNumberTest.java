package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Challenge28_FirstUniqueNumber.FirstUnique;

class Challenge28_FirstUniqueNumberTest {

    private FirstUnique testObject;
    private int[] numbers;

    @BeforeEach
    public void setUp() {
        numbers = new int[]{2, 3, 5};
        testObject = new FirstUnique(numbers);
    }

    @Test
    public void test() {
        assertEquals(2, testObject.showFirstUnique());
        testObject.add(5);
        assertEquals(2, testObject.showFirstUnique());
        testObject.add(2);
        assertEquals(3, testObject.showFirstUnique());
        testObject.add(3);
        assertEquals(-1, testObject.showFirstUnique());

        numbers = new int[]{7, 7, 7, 7, 7, 7};
        testObject = new FirstUnique(numbers);
        testObject.add(7);
        testObject.add(3);
        testObject.add(3);
        testObject.add(7);
        testObject.add(17);
        assertEquals(17, testObject.showFirstUnique());

        numbers = new int[]{809};
        testObject = new FirstUnique(numbers);
        assertEquals(809, testObject.showFirstUnique());
        testObject.add(809);
        assertEquals(-1, testObject.showFirstUnique());
    }

}