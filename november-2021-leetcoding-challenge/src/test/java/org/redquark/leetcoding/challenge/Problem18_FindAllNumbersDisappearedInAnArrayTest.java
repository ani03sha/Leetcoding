package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_FindAllNumbersDisappearedInAnArrayTest {

    private final Problem18_FindAllNumbersDisappearedInAnArray testObject = new Problem18_FindAllNumbersDisappearedInAnArray();

    @Test
    void testFindDisappearedNumbers() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = List.of(5, 6);
        assertEquals(expected, testObject.findDisappearedNumbers(nums));

        nums = new int[]{1, 1};
        expected = List.of(2);
        assertEquals(expected, testObject.findDisappearedNumbers(nums));
    }
}