package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcoding.challenge.Problem21_InsertDeleteGetRandomO1.RandomizedSet;

class Problem21_InsertDeleteGetRandomO1Test {

    @Test
    public void test() {
        RandomizedSet testObject = new RandomizedSet();
        assertTrue(testObject.insert(1));
        assertFalse(testObject.remove(2));
        assertTrue(testObject.insert(2));
        boolean randomFlag = testObject.getRandom() == 1 || testObject.getRandom() == 2;
        assertTrue(randomFlag);
        assertTrue(testObject.remove(1));
        assertFalse(testObject.insert(2));
        assertEquals(2, testObject.getRandom());
    }
}