package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_PartitionLabelsTest {

    private final Problem04_PartitionLabels testObject = new Problem04_PartitionLabels();

    @Test
    void testPartitionLabels() {
        String S = "ababcbacadefegdehijhklij";
        List<Integer> expected = Arrays.asList(9, 7, 8);
        assertEquals(expected, testObject.partitionLabels(S));
    }
}