package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_FindAllDuplicatesInAnArrayTest {

    private final Problem06_FindAllDuplicatesInAnArray testObject = new Problem06_FindAllDuplicatesInAnArray();

    @Test
    void testFindDuplicates() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = Arrays.asList(2, 3);
        assertEquals(expected, testObject.findDuplicates(nums));

        nums = new int[]{1, 1, 2};
        expected = Collections.singletonList(1);
        assertEquals(expected, testObject.findDuplicates(nums));

        nums = new int[]{1};
        expected = Collections.emptyList();
        assertEquals(expected, testObject.findDuplicates(nums));
    }
}