package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcoding.challenge.Problem15_EncodeAndDecodeTinyURL.Codec;

class Problem15_EncodeAndDecodeTinyURLTest {

    private final Codec testObject = new Codec();

    @Test
    void test() {
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String encodedUrl = testObject.encode(longUrl);
        String decodedUrl = testObject.decode(encodedUrl);
        assertEquals(longUrl, decodedUrl);
    }
}