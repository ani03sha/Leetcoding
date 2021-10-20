package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_ReverseWordsInAStringTest {

    private final Problem20_ReverseWordsInAString testObject = new Problem20_ReverseWordsInAString();

    @Test
    void testReverseWords() {
        String s = "the sky is blue";
        assertEquals("blue is sky the", testObject.reverseWords(s));

        s = "  hello world  ";
        assertEquals("world hello", testObject.reverseWords(s));

        s = "a good   example";
        assertEquals("example good a", testObject.reverseWords(s));

        s = "  Bob    Loves  Alice   ";
        assertEquals("Alice Loves Bob", testObject.reverseWords(s));

        s = "Alice does not even like bob";
        assertEquals("bob like even not does Alice", testObject.reverseWords(s));
    }
}