package org.redquark.leetcoding.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return
 * the result of the evaluation.
 * <p>
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions,
 * such as eval().
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 3 * 10^5
 * s consists of digits, '+', '-', '(', ')', and ' '.
 * s represents a valid expression.
 * '+' is not used as a unary operation.
 * '-' could be used as a unary operation but it has to be inside parentheses.
 * There will be no two consecutive operators in the input.
 * Every number and running calculation will fit in a signed 32-bit integer.
 */
public class Problem11_BasicCalculator {

    public int calculate(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Length of the string
        int n = s.length();
        // Final output of the expression
        int output = 0;
        // Sign of the calculated answer until now
        int sign = 1;
        // Current number
        int currentNumber;
        // Stack to store the expression within parentheses
        Stack<Integer> stack = new Stack<>();
        // Loop over the string
        for (int i = 0; i < n; i++) {
            // Current character
            char c = s.charAt(i);
            // Check if the current character is a digit
            if (Character.isDigit(c)) {
                currentNumber = c - '0';
                // Loop until we are encountering digits
                while (i + 1 < n && Character.isDigit(s.charAt(i + 1))) {
                    currentNumber = currentNumber * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                // Multiply the number by sign variable
                currentNumber *= sign;
                // Update the output calculated until now
                output += currentNumber;
            }
            // If the current character is a + sign
            else if (c == '+') {
                sign = 1;
            }
            // If the current character is a - sign
            else if (c == '-') {
                sign = -1;
            }
            // If the current character is a starting parenthesis
            else if (c == '(') {
                // Push the output calculated until now to the stack
                stack.push(output);
                // Push the current sign value to the stack
                stack.push(sign);
                // Reset output and sign
                output = 0;
                sign = 1;
            }
            // If the current character is a closing parenthesis
            else if (c == ')') {
                // Get the previous sign value
                int previousSign = stack.pop();
                output *= previousSign;
                // Get the previous output
                int previousOutput = stack.pop();
                // Update the output
                output += previousOutput;
            }
        }
        return output;
    }
}
