package org.redquark.leetcoding.challenge;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Design the CombinationIterator class:
 * <p>
 * - CombinationIterator(string characters, int combinationLength) Initializes the object with a string characters
 * of sorted distinct lowercase English letters and a number combinationLength as arguments.
 * - next() Returns the next combination of length combinationLength in lexicographical order.
 * - hasNext() Returns true if and only if there exists a next combination.
 * <p>
 * Constraints:
 * <p>
 * 1 <= combinationLength <= characters.length <= 15
 * All the characters of characters are unique.
 * At most 10^4 calls will be made to next and hasNext.
 * It's guaranteed that all calls of the function next are valid.
 */
public class Problem14_IteratorForCombination {

    static class CombinationIterator {
        // Min Heap to store the combinations in the lexicographical order
        private final Queue<String> validCombinations;

        public CombinationIterator(String characters, int combinationLength) {
            this.validCombinations = new PriorityQueue<>();
            // Length of the string
            int n = characters.length();
            // Generate combinations
            for (int i = 0; i < (1 << n); i++) {
                // If the set bit count is equal to the combination length, then
                // only we will proceed to generate that combination
                if (Integer.bitCount(i) == combinationLength) {
                    // Character array for valid combination
                    char[] combination = new char[combinationLength];
                    // Index to traverse through the character array
                    int index = 0;
                    // Traverse through the bits of binary number represented by i
                    for (int j = 0; j < n; j++) {
                        // If the bit is set, then we will take that character
                        int setBit = 1 << j;
                        if ((setBit & i) == setBit) {
                            combination[index] = characters.charAt(j);
                            index++;
                        }
                    }
                    // Add this combination to the heap
                    validCombinations.offer(new String(combination));
                }
            }
        }

        public String next() {
            return validCombinations.poll();
        }

        public boolean hasNext() {
            return !validCombinations.isEmpty();
        }
    }
}
