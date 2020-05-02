package org.redquark.leetcode.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class Problem02_JewelsAndStones {

    /**
     * @param J - String of jewels
     * @param S - String of stones
     * @return number of jewels in stones
     */
    public int numJewelsInStones(String J, String S) {
        // This will keep track of the number of jewels
        int count = 0;
        // This set will store the jewels
        Set<Character> jewelSet = new HashSet<>(J.length());
        // Add all the jewels in the set
        for (int i = 0; i < J.length(); i++) {
            jewelSet.add(J.charAt(i));
        }
        // Check if the current stone is present in the jewels set
        for (int i = 0; i < S.length(); i++) {
            if (jewelSet.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }

}
