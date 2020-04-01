package org.redquark.leetcode.challenge;

import java.util.Arrays;

public class Challenge01_SingleNumber {

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1, 2, 4, 7, -3, -2, 7, 8, -2, 9, 9, -3, -5, 8};
        System.out.println(bruteForce(numbers));
    }

    private static int bruteForce(int[] numbers) {
        int x = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            x = x ^ numbers[i];
        }
        return x;
    }
}
