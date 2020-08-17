package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * We distribute some number of candies, to a row of n = num_people people in the following way:
 * <p>
 * We then give 1 candy to the first person, 2 candies to the second person, and so on until we give n candies
 * to the last person.
 * <p>
 * Then, we go back to the start of the row, giving n + 1 candies to the first person, n + 2 candies to the
 * second person, and so on until we give 2 * n candies to the last person.
 * <p>
 * This process repeats (with us giving one more candy each time, and moving to the start of the row after we
 * reach the end) until we run out of candies.  The last person will receive all of our remaining candies
 * (not necessarily one more than the previous gift).
 * <p>
 * Return an array (of length num_people and sum candies) that represents the final distribution of candies.
 * <p>
 * Constraints:
 * <p>
 * 1 <= candies <= 10^9
 * 1 <= num_people <= 1000
 */
public class Problem17_DistributeCandiesToPeople {

    /**
     * @param candies        - total number of candies
     * @param numberOfPeople - number of people
     * @return array to be returned
     */
    public int[] distributeCandies(int candies, int numberOfPeople) {
        // Resultant array
        int[] result = new int[numberOfPeople];
        int counter = 0;
        while (candies > 0) {
            if (candies > (counter + 1)) {
                result[counter % numberOfPeople] += ++counter;
                candies = candies - counter;
            } else {
                result[counter % numberOfPeople] += candies;
                candies -= candies;
            }
        }
        return result;
    }
}
