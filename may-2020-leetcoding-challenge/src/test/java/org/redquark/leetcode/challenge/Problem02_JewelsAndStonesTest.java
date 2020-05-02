package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_JewelsAndStonesTest {

    private final Problem02_JewelsAndStones testObject = new Problem02_JewelsAndStones();

    @Test
    void testNumJewelsInStones() {
        String J = "aA";
        String S = "aAAbbbb";
        assertEquals(3, testObject.numJewelsInStones(J, S));

        J = "z";
        S = "ZZ";
        assertEquals(0, testObject.numJewelsInStones(J, S));
    }
}