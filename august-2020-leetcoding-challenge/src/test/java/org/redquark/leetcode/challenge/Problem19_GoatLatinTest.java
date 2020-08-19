package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_GoatLatinTest {

    private final Problem19_GoatLatin testObject = new Problem19_GoatLatin();

    @Test
    void testToGoatLatin() {
        String s = "I speak Goat Latin";
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", testObject.toGoatLatin(s));

        s = "The quick brown fox jumped over the lazy dog";
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", testObject.toGoatLatin(s));
    }
}