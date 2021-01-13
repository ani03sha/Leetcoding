package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * The i-th person has weight people[i], and each boat can carry a maximum weight of limit.
 * <p>
 * Each boat carries at most 2 people at the same time, provided the sum of the weight of
 * those people is at most limit.
 * <p>
 * Return the minimum number of boats to carry every given person.
 * (It is guaranteed each person can be carried by a boat.)
 * <p>
 * Note:
 * <p>
 * 1 <= people.length <= 50000
 * 1 <= people[i] <= limit <= 30000
 */
public class Problem13_BoatsToSavePeople {

    /**
     * @param people - array with weights of people
     * @param limit  - limit of boat
     * @return minimum number of boats required to save every person
     */
    public int numRescueBoats(int[] people, int limit) {
        // Number of boats required
        int boats = 0;
        // Sort the array in increasing order
        Arrays.sort(people);
        // Left pointer
        int left = 0;
        // Right pointer
        int right = people.length - 1;
        // Loop until both the pointers meet
        while (left <= right) {
            // Check if the lightest and heaviest person
            // can be put in the boat
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            }
            // If not, we will take only the heaviest person
            else {
                right--;
            }
            boats++;
        }
        return boats;
    }

}
