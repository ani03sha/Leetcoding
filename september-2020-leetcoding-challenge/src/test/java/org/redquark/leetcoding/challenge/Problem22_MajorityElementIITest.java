package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_MajorityElementIITest {

    private final Problem22_MajorityElementII testObject = new Problem22_MajorityElementII();

    @Test
    void testMajorityElement() {
        int[] numbers = new int[]{3, 2, 3};
        //assertEquals(Collections.singletonList(3), testObject.majorityElement(numbers));

        numbers = new int[]{1, 1, 1, 3, 3, 2, 2, 2};
        assertEquals(Arrays.asList(1, 2), testObject.majorityElement(numbers));
    }
}