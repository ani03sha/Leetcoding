package org.redquark.leetcoding.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s which represents an expression, evaluate this expression and return its value.
 * <p>
 * The integer division should truncate toward zero.
 * <p>
 * You may assume that the given expression is always valid. All intermediate results will be in the range of
 * [-2^31, 2^31 - 1].
 * <p>
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions,
 * such as eval().
 * <p>
 * onstraints:
 * <p>
 * 1 <= s.length <= 3 * 10^5
 * s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
 * s represents a valid expression.
 * All the integers in the expression are non-negative integers in the range [0, 2^31 - 1].
 * The answer is guaranteed to fit in a 32-bit integer.
 */
public class Problem25_BasicCalculatorII {

    public int calculate(String s) {
        // Remove whitespaces
        s = s.trim().replaceAll("\\s+", "");
        // All the numbers
        String[] numbers = s.split("[+\\-*/]+");
        // All the operators
        String[] operators = s.split("[\\d]+");
        // Stack which will have only numbers
        Stack<Integer> numberStack = new Stack<>();
        numberStack.push(Integer.parseInt(numbers[0]));
        // Loop for remaining operators
        for (int i = 1; i < operators.length; i++) {
            int currentNumber = Integer.parseInt(numbers[i]);
            // Multiplication
            if (operators[i].equals("*")) {
                currentNumber = numberStack.pop() * currentNumber;
            }
            // Division
            if (operators[i].equals("/")) {
                currentNumber = numberStack.pop() / currentNumber;
            }
            // Subtraction
            if (operators[i].equals("-")) {
                currentNumber = -currentNumber;
            }
            numberStack.push(currentNumber);
        }
        // Total value
        int value = 0;
        while (numberStack.size() > 0) {
            value += numberStack.pop();
        }
        return value;
    }
}
