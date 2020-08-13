package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Anirudh Sharma
 * <p>
 * Design an Iterator class, which has:
 * <p>
 * A constructor that takes a string characters of sorted distinct lowercase English
 * letters and a number combinationLength as arguments.
 * <p>
 * A function next() that returns the next combination of length combinationLength in lexicographical order.
 * <p>
 * A function hasNext() that returns True if and only if there exists a next combination.
 * <p>
 * Constraints:
 * <p>
 * 1 <= combinationLength <= characters.length <= 15
 * There will be at most 10^4 function calls per test.
 * It's guaranteed that all calls of the function next are valid.
 */
public class Problem13_IteratorForCombination {

    private final String characters;
    private int[] indices;

    public Problem13_IteratorForCombination(String characters, int combinationLength) {
        this.characters = characters;
        indices = IntStream.range(0, combinationLength).toArray();
    }

    public String next() {
        String result = Arrays
                .stream(indices)
                .mapToObj(characters::charAt)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        if (indices[0] == characters.length() - indices.length) {
            indices = null;
        } else {
            int position = indices.length - 1;
            while (indices[position] == characters.length() - (indices.length - position)) {
                position--;
            }
            indices[position]++;
            for (int i = position + 1; i < indices.length; i++) {
                indices[i] = indices[i - 1] + 1;
            }
        }
        return result;
    }

    public boolean hasNext() {
        return indices != null;
    }
}
