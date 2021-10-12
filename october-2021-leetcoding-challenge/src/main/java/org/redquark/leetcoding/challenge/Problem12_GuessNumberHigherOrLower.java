package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * We are playing the Guess Game. The game is as follows:
 * <p>
 * I pick a number from 1 to n. You have to guess which number I picked.
 * <p>
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * <p>
 * You call a pre-defined API int guess(int num), which returns 3 possible results:
 * <p>
 * -1: The number I picked is lower than your guess (i.e. pick < num).
 * 1: The number I picked is higher than your guess (i.e. pick > num).
 * 0: The number I picked is equal to your guess (i.e. pick == num).
 * Return the number that I picked.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 2^31 - 1
 * 1 <= pick <= n
 */
public class Problem12_GuessNumberHigherOrLower {

    protected int pick = 0;

    public int guessNumber(int n) {
        // Invalid cases
        if (n <= 0) {
            return -1;
        }
        // Left and right pointers
        int left = 1;
        int right = n;
        // Loop until left and right pointers meet
        while (left < right) {
            // Middle point of the current window
            int middle = left + (right - left) / 2;
            // If the number is found
            if (guess(middle) == 0) {
                return middle;
            }
            // If the picked number is smaller than the middle
            else if (guess(middle) > 0) {
                left = middle + 1;
            }
            // If the picked number is greater than the middle
            else {
                right = middle;
            }
        }
        return left;
    }

    private int guess(int num) {
        return Integer.compare(pick, num);
    }
}
