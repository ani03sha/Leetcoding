package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_CombinationSumIIITest {

    private final Problem12_CombinationSumIII testObject = new Problem12_CombinationSumIII();

    @Test
    void testCombinationSum3() {
        assertEquals(Collections.singletonList(Arrays.asList(1, 2, 4)), testObject.combinationSum3(3, 7));
        assertEquals(Arrays.asList(Arrays.asList(1, 2, 6), Arrays.asList(1, 3, 5), Arrays.asList(2, 3, 4)),
                testObject.combinationSum3(3, 9));
    }
}