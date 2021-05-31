package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of strings products and a string searchWord. We want to design a system that suggests
 * at most three product names from products after each character of searchWord is typed.
 * <p>
 * Suggested products should have common prefix with the searchWord. If there are more than three products
 * with a common prefix return the three lexicographically minimums products.
 * <p>
 * Return list of lists of the suggested products after each character of searchWord is typed.
 * <p>
 * Constraints:
 * <p>
 * 1 <= products.length <= 1000
 * There are no repeated elements in products.
 * 1 <= Σ products[i].length <= 2 * 10^4
 * All characters of products[i] are lower-case English letters.
 * 1 <= searchWord.length <= 1000
 * All characters of searchWord are lower-case English letters.
 */
public class Problem31_SearchSuggestionsSystem {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        // List to store final result
        List<List<String>> suggestions = new ArrayList<>();
        // Special cases
        if (products == null || products.length == 0 || searchWord == null || searchWord.isEmpty()) {
            return suggestions;
        }
        // Sort the array of words
        Arrays.sort(products);
        // Left and right pointers
        int left = 0;
        int right = products.length - 1;
        // Loop through character by character of searchWord
        for (int i = 0; i < searchWord.length(); i++) {
            // List to store current set of results
            List<String> currentSuggestions = new ArrayList<>();
            // Current character
            char c = searchWord.charAt(i);
            while (left <= right && (products[left].length() == i || products[left].charAt(i) < c)) {
                left++;
            }
            while (left <= right && (products[right].length() == i || products[right].charAt(i) > c)) {
                right--;
            }
            // Select three words (at most)
            for (int j = 0; j < 3 && left + j <= right; j++) {
                currentSuggestions.add(products[left + j]);
            }
            suggestions.add(currentSuggestions);
        }
        return suggestions;
    }
}
