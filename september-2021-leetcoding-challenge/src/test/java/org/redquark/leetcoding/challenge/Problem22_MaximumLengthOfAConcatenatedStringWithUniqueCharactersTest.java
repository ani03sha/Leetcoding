package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_MaximumLengthOfAConcatenatedStringWithUniqueCharactersTest {

    private final Problem22_MaximumLengthOfAConcatenatedStringWithUniqueCharacters testObject =
            new Problem22_MaximumLengthOfAConcatenatedStringWithUniqueCharacters();

    @Test
    void testMaxLength() {
        List<String> arr = Arrays.asList("un", "iq", "ue");
        assertEquals(4, testObject.maxLength(arr));

        arr = Arrays.asList("cha", "r", "act", "ers");
        assertEquals(6, testObject.maxLength(arr));

        arr = List.of("abcdefghijklmnopqrstuvwxyz");
        assertEquals(26, testObject.maxLength(arr));
    }
}