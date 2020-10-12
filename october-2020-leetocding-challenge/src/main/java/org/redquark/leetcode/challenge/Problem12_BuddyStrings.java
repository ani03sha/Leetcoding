package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two strings A and B of lowercase letters, return true if you can swap two letters in A
 * so the result is equal to B, otherwise, return false.
 * <p>
 * Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and
 * swapping the characters at A[i] and A[j]. For example, swapping at indices 0 and 2 in "abcd"
 * results in "cbad".
 * <p>
 * Constraints:
 * <p>
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A and B consist of lowercase letters.
 */
public class Problem12_BuddyStrings {

    /**
     * @param A - first input string
     * @param B - second input string
     * @return true, if the swapping is possible
     */
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            Set<Character> characters = new HashSet<>();
            for (char c : A.toCharArray()) {
                characters.add(c);
            }
            return characters.size() < A.length();
        }
        List<Integer> difference = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                difference.add(i);
            }
        }
        return difference.size() == 2
                && A.charAt(difference.get(0)) == B.charAt(difference.get(1))
                && A.charAt(difference.get(1)) == B.charAt(difference.get(0));
    }
}
