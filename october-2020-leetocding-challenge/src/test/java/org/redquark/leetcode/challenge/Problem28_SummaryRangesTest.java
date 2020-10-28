package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_SummaryRangesTest {

    private final Problem28_SummaryRanges testObject = new Problem28_SummaryRanges();

    @Test
    void testSummaryRanges() {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        List<String> expected = Arrays.asList("0->2", "4->5", "7");
        assertEquals(expected, testObject.summaryRanges(nums));

        nums = new int[]{0, 2, 3, 4, 6, 8, 9};
        expected = Arrays.asList("0", "2->4", "6", "8->9");
        assertEquals(expected, testObject.summaryRanges(nums));

        nums = new int[]{};
        expected = Collections.emptyList();
        assertEquals(expected, testObject.summaryRanges(nums));

        nums = new int[]{-1};
        expected = Collections.singletonList("-1");
        assertEquals(expected, testObject.summaryRanges(nums));

        nums = new int[]{0};
        expected = Collections.singletonList("0");
        assertEquals(expected, testObject.summaryRanges(nums));
    }
}