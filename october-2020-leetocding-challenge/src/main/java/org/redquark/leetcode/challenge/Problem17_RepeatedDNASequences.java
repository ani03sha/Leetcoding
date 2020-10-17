package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * All DNA is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T',
 * for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated
 * sequences within the DNA.
 * <p>
 * Write a function to find all the 10-letter-long sequences (substrings) that occur more
 * than once in a DNA molecule.
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 10^5
 * s[i] is 'A', 'C', 'G', or 'T'.
 */
public class Problem17_RepeatedDNASequences {

    /**
     * @param s - input DNA sequence
     * @return List of subsequences occurring more than once
     */
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 10) {
            return result;
        }
        Map<String, Integer> subsequenceFrequency = new HashMap<>();
        int i = 0;
        while (i + 10 <= s.length()) {
            String currentSubsequence = s.substring(i, i + 10);
            if (subsequenceFrequency.containsKey(currentSubsequence)
                    && !result.contains(currentSubsequence)) {
                result.add(currentSubsequence);
            } else {
                subsequenceFrequency.put(currentSubsequence, 1);
            }
            i++;
        }
        return result;
    }
}
