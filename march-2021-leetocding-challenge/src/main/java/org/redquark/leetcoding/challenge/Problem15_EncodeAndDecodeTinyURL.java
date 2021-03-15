package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * TinyURL is a URL shortening service where you enter a URL such as
 * https://leetcode.com/problems/design-tinyurl and it returns a short
 * URL such as http://tinyurl.com/4e9iAk.
 * <p>
 * Design the encode and decode methods for the TinyURL service.
 * There is no restriction on how your encode/decode algorithm should work.
 * <p>
 * You just need to ensure that a URL can be encoded to a tiny URL and
 * the tiny URL can be decoded to the original URL.
 */
public class Problem15_EncodeAndDecodeTinyURL {

    static class Codec {
        // Map to store encoded URLs
        private final Map<String, Integer> encodeMap = new HashMap<>();
        // Map to store decoded URLs
        private final Map<Integer, String> decodeMap = new HashMap<>();
        // Counter for the keys
        private int keyCount = 0;

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            // Check if the URL is present in the map
            if (!encodeMap.containsKey(longUrl)) {
                keyCount++;
                encodeMap.put(longUrl, keyCount);
                decodeMap.put(keyCount, longUrl);
            }
            // Base URL for the service
            String BASE_URL = "http://tinyurl.com/";
            return BASE_URL + encodeMap.get(longUrl);
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            // Get the key for the short URL
            Integer key = Integer.parseInt(shortUrl.substring(shortUrl.lastIndexOf("/") + 1));
            return decodeMap.get(key);
        }
    }
}
