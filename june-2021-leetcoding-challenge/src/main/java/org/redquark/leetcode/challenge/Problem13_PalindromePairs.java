package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a list of unique words, return all the pairs of the distinct indices (i, j) in the given list,
 * so that the concatenation of the two words words[i] + words[j] is a palindrome.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 5000
 * 0 <= words[i].length <= 300
 * words[i] consists of lower-case English letters.
 */
public class Problem13_PalindromePairs {

    public List<List<Integer>> palindromePairs(String[] words) {
        // List to store the results
        List<List<Integer>> palindromes = new ArrayList<>();
        // Special case
        if (words == null || words.length < 2) {
            return palindromes;
        }
        // Map to store each word and its index
        Map<String, Integer> wordIndexMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            wordIndexMap.put(words[i], i);
        }
        // Iterate for every word in the array
        for (int i = 0; i < words.length; i++) {
            // Iterate for every character in the current word
            for (int j = 0; j <= words[i].length(); j++) {
                // Divide the word in two substrings
                String s = words[i].substring(0, j);
                String t = words[i].substring(j);
                // Check palindrome property for first string
                if (isPalindrome(s)) {
                    // Reversed second string
                    String reversedT = new StringBuilder(t).reverse().toString();
                    if (wordIndexMap.containsKey(reversedT) && wordIndexMap.get(reversedT) != i) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(wordIndexMap.get(reversedT));
                        temp.add(i);
                        palindromes.add(temp);
                    }
                }
                // Check palindrome property for second string
                if (isPalindrome(t)) {
                    // Reversed first string
                    String reversedS = new StringBuilder(s).reverse().toString();
                    if (wordIndexMap.containsKey(reversedS) && wordIndexMap.get(reversedS) != i && t.length() != 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(i);
                        temp.add(wordIndexMap.get(reversedS));
                        palindromes.add(temp);
                    }
                }
            }
        }
        return palindromes;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
