package org.redquark.leetcode.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
 * <p>
 * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
 * <p>
 * The rules of Goat Latin are as follows:
 * <p>
 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 * For example, the word 'apple' becomes 'applema'.
 * <p>
 * If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
 * For example, the word "goat" becomes "oatgma".
 * <p>
 * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
 * Return the final sentence representing the conversion from S to Goat Latin.
 * <p>
 * Notes:
 * <p>
 * S contains only uppercase, lowercase and spaces. Exactly one space between each word.
 * 1 <= S.length <= 150.
 */
public class Problem19_GoatLatin {

    /**
     * @param S - input string
     * @return output string
     */
    public String toGoatLatin(String S) {
        // Set to store all the vowels
        Set<Character> vowels = new HashSet<>();
        // Add all the vowels to the set
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }
        // Resultant string
        StringBuilder result = new StringBuilder();
        // Number if a's
        int aCount = 1;
        // Loop for each word in the string
        for (String word : S.split("\\s")) {
            // Add space
            if (aCount > 1) {
                result.append(" ");
            }
            // Get the first letter of the word
            char firstLetter = word.charAt(0);
            // Check if it is a vowel
            if (vowels.contains(firstLetter)) {
                result.append(word).append("ma");
            }
            // If it is a consonant
            else {
                result.append(word.substring(1)).append(firstLetter).append("ma");
            }
            // Add additional a's
            result.append("a".repeat(Math.max(0, aCount)));
            aCount++;
        }
        return result.toString();
    }
}
