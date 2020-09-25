package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * <p>
 * Note: The result may be very large, so you need to return a string instead of an integer.
 */
public class Problem25_LargestNumber {

    /**
     * @param numbers - input array of numbers
     * @return the largest number formed with the array elements
     */
    public String largestNumber(int[] numbers) {
        // Convert numbers into strings
        String[] stringArray = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        Arrays.sort(stringArray, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder();
        for (String s : stringArray) {
            sb.append(s);
        }
        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
