package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_CustomSortStringTest {

    private final Problem14_CustomSortString testObject = new Problem14_CustomSortString();

    @Test
    void testCustomSortString() {
        String order = "cba";
        String str = "abcd";
        assertEquals("cbad", testObject.customSortString(order, str));
    }
}