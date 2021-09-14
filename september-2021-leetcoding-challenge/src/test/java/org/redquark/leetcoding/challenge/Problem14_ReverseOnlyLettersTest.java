package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_ReverseOnlyLettersTest {

    private final Problem14_ReverseOnlyLetters testObject = new Problem14_ReverseOnlyLetters();

    @Test
    void testReverseOnlyLetters() {
        String s = "ab-cd";
        assertEquals("dc-ba", testObject.reverseOnlyLetters(s));

        s = "a-bC-dEf-ghIj";
        assertEquals("j-Ih-gfE-dCba", testObject.reverseOnlyLetters(s));

        s = "Test1ng-Leet=code-Q!";
        assertEquals("Qedo1ct-eeLg=ntse-T!", testObject.reverseOnlyLetters(s));

    }
}