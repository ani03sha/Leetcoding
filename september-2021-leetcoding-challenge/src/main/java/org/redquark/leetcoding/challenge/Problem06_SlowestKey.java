package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A newly designed keypad was tested, where a tester pressed a sequence of n keys, one at a time.
 * <p>
 * You are given a string keysPressed of length n, where keysPressed[i] was the ith key pressed in the testing sequence,
 * and a sorted list releaseTimes, where releaseTimes[i] was the time the ith key was released. Both arrays are
 * 0-indexed.
 * <p>
 * The 0th key was pressed at the time 0, and every subsequent key was pressed at the exact time the previous key
 * was released.
 * <p>
 * The tester wants to know the key of the keypress that had the longest duration. The ith keypress had a duration
 * of releaseTimes[i] - releaseTimes[i - 1], and the 0th keypress had a duration of releaseTimes[0].
 * <p>
 * Note that the same key could have been pressed multiple times during the test, and these multiple presses of the
 * same key may not have had the same duration.
 * <p>
 * Return the key of the keypress that had the longest duration. If there are multiple such keypresses, return the
 * lexicographically largest key of the keypresses.
 * <p>
 * Constraints:
 * <p>
 * releaseTimes.length == n
 * keysPressed.length == n
 * 2 <= n <= 1000
 * 1 <= releaseTimes[i] <= 10^9
 * releaseTimes[i] < releaseTimes[i+1]
 * keysPressed contains only lowercase English letters.
 */
public class Problem06_SlowestKey {

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        // Special case
        if (releaseTimes == null || releaseTimes.length == 0 || keysPressed == null || keysPressed.isEmpty()) {
            return '\u0000';
        }
        // Longest pressing time
        int longestPressingTime = releaseTimes[0];
        // Longest pressed key
        char longestPressedKey = keysPressed.charAt(0);
        // Loop through the array
        for (int i = 1; i < releaseTimes.length; i++) {
            // Current key pressed duration
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            // If we have different key for the same duration
            if (longestPressingTime == duration) {
                longestPressedKey = (char) Math.max(longestPressedKey, keysPressed.charAt(i));
            }
            // If we have found another key with longer press duration
            if (longestPressingTime < duration) {
                longestPressingTime = duration;
                longestPressedKey = keysPressed.charAt(i);
            }
        }
        return longestPressedKey;
    }
}
