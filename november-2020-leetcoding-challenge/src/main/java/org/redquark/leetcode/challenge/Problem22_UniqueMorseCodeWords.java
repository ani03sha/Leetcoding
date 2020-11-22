package org.redquark.leetcode.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * International Morse Code defines a standard encoding where each letter is mapped to a series
 * of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.",
 * and so on.
 * <p>
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 * <p>
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of
 * each letter.
 * For example, "cab" can be written as "-.-..--...", (which is the concatenation "-.-." +
 * ".-" + "-..."). We'll call such a concatenation, the transformation of a word.
 * <p>
 * Return the number of different transformations among all words we have.
 * <p>
 * Note:
 * <p>
 * The length of words will be at most 100.
 * Each words[i] will have length in range [1, 12].
 * words[i] will only consist of lowercase letters.
 */
public class Problem22_UniqueMorseCodeWords {

    /**
     * @param words - input array of words
     * @return number of different transformations
     */
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {
                ".-",
                "-...",
                "-.-.",
                "-..",
                ".",
                "..-.",
                "--.",
                "....",
                "..",
                ".---",
                "-.-",
                ".-..",
                "--",
                "-.",
                "---",
                ".--.",
                "--.-",
                ".-.",
                "...",
                "-",
                "..-",
                "...-",
                ".--",
                "-..-",
                "-.--",
                "--.."
        };
        Set<String> uniqueTransformations = new HashSet<>();
        for (String word : words) {
            StringBuilder currentTransformation = new StringBuilder();
            for (char c : word.toCharArray()) {
                currentTransformation.append(morseCode[c - 'a']);
            }
            uniqueTransformations.add(currentTransformation.toString());
        }
        return uniqueTransformations.size();
    }
}
