package org.redquark.leetcode.learn.arrays;

public class Problem14_ThirdMaximumNumber {

    public int thirdMax(int[] numbers) {
        // Variables to keep track of first, second and third max
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        for (Integer n : numbers) {
            // If the first/second/third max occur more than once
            if (n.equals(firstMax) || n.equals(secondMax) || n.equals(thirdMax)) {
                continue;
            }
            if (firstMax == null || n > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = n;
            } else if (secondMax == null || n > secondMax) {
                thirdMax = secondMax;
                secondMax = n;
            } else if (thirdMax == null || n > thirdMax) {
                thirdMax = n;
            }
        }
        return thirdMax == null ? firstMax : thirdMax;
    }
}
