package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Problem01_PrefixAndSuffixSearch.WordFilter;

class Problem01_PrefixAndSuffixSearchTest {

    @Test
    void test() {
        String[] words = new String[]{"apple"};
        String prefix = "a";
        String suffix = "e";
        WordFilter wordFilter = new WordFilter(words);
        assertEquals(0, wordFilter.f(prefix, suffix));
    }

}