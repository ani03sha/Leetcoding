package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_JumpGameIVTest {

    private final Problem27_JumpGameIV testObject = new Problem27_JumpGameIV();

    @Test
    void testMinJumps() {
        assertEquals(3, testObject.minJumps(new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404}));
        assertEquals(0, testObject.minJumps(new int[]{7}));
        assertEquals(1, testObject.minJumps(new int[]{7, 6, 9, 6, 9, 6, 9, 7}));
        assertEquals(2, testObject.minJumps(new int[]{6, 1, 9}));
        assertEquals(3, testObject.minJumps(new int[]{11, 22, 7, 7, 7, 7, 7, 7, 7, 22, 13}));
    }
}