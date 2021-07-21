package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_PushDominoesTest {

    private final Problem21_PushDominoes testObject = new Problem21_PushDominoes();

    @Test
    void testPushDominoes() {
        String dominoes = "RR.L";
        assertEquals("RR.L", testObject.pushDominoes(dominoes));

        dominoes = ".L.R...LR..L..";
        assertEquals("LL.RR.LLRRLL..", testObject.pushDominoes(dominoes));
    }
}