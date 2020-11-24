package org.redquark.leetcode.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma (
 * Implement a basic calculator to evaluate a simple expression string.
 * <p>
 * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces .
 * The integer division should truncate
 * <p>
 * Note:
 * <p>
 * You may assume that the given expression is always valid.
 * Do not use the eval built-in library function
 */
public class Problem24_BasicCalculatorII {

    /**
     * @param s - input expression
     * @return output value
     */
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
