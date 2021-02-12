package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_NumberOfStepsToReduceANumberToZeroTest {

    private final Problem12_NumberOfStepsToReduceANumberToZero testObject =
            new Problem12_NumberOfStepsToReduceANumberToZero();

    @Test
    void tesNumberOfSteps() {
        assertEquals(6, testObject.numberOfSteps(14));
        assertEquals(4, testObject.numberOfSteps(8));
        assertEquals(12, testObject.numberOfSteps(123));
    }
}