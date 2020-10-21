package org.redquark.leetcode.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * We are given an array asteroids of integers representing asteroids in a row.
 * <p>
 * For each asteroid, the absolute value represents its size, and the sign represents its direction
 * (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
 * <p>
 * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one
 * will explode.
 * If both are the same size, both will explode. Two asteroids moving in the same direction will
 * never meet.
 * <p>
 * Constraints:
 * <p>
 * 1 <= asteroids <= 10^4
 * -1000 <= asteroids[i] <= 1000
 * asteroids[i] != 0
 */
public class Problem21_AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        // Stack to store remaining asteroids
        Stack<Integer> stack = new Stack<>();
        // Loop through each value in the asteroids arrays
        for (int asteroid : asteroids) {
            if (stack.isEmpty() || asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (true) {
                    int top = stack.peek();
                    if (top < 0) {
                        stack.push(asteroid);
                        break;
                    } else if (top == -asteroid) {
                        stack.pop();
                        break;
                    } else if (top > -asteroid) {
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroid);
                            break;
                        }
                    }
                }
            }
        }
        int[] output = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            output[i] = stack.pop();
        }
        return output;
    }
}
