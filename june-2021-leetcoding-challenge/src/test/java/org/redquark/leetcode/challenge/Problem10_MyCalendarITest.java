package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcode.challenge.Problem10_MyCalendarI.MyCalendar;

class Problem10_MyCalendarITest {

    private final MyCalendar testObject = new MyCalendar();

    @Test
    void test() {
        assertTrue(testObject.book(10, 20));
        assertFalse(testObject.book(15, 25));
        assertTrue(testObject.book(20, 30));
    }
}