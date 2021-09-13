package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as
 * possible.
 * <p>
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 * <p>
 * Constraints:
 * <p>
 * 1 <= text.length <= 10^4
 * text consists of lower case English letters only.
 */
public class Problem13_MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        // Special case
        if (text == null || text.isEmpty()) {
            return 0;
        }
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        // Loop through the text
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }
        }
        // Find the minimum occurrence
        return Math.min(b, Math.min(a, Math.min(l / 2, Math.min(o / 2, n))));
    }
}
