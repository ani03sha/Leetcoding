package org.redquark.leetcoding.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight,
 * so she visited a doctor.
 * <p>
 * The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
 * Alice likes her candies very much, and she wants to eat the maximum number of different types of
 * candies while still following the doctor's advice.
 * <p>
 * Given the integer array candyType of length n, return the maximum number of different types of
 * candies she can eat if she only eats n / 2 of them.
 * <p>
 * Constraints:
 * <p>
 * n == candyType.length
 * 2 <= n <= 10^4
 * n is even.
 * -10^5 <= candyType[i] <= 10^5
 */
public class Problem01_DistributeCandies {

    public int distributeCandies(int[] candyType) {
        // Set to store the types of candies
        Set<Integer> candyTypes = new HashSet<>();
        // Add all the candies in the set
        for (int candy : candyType) {
            candyTypes.add(candy);
        }
        return Math.min(candyTypes.size(), candyType.length / 2);
    }
}
