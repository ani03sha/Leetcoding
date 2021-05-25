package org.redquark.leetcode.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 * <p>
 * Note that division between two integers should truncate toward zero.
 * <p>
 * It is guaranteed that the given RPN expression is always valid. That means the expression
 * would always evaluate to a result, and there will not be any division by zero operation.
 * <p>
 * Constraints:
 * <p>
 * 1 <= tokens.length <= 104
 * tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
 */
public class Problem25_EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        // Special case
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        // Stack to store the operands
        Stack<String> operands = new Stack<>();
        // Loop through the operators and operands
        for (String token : tokens) {
            // If the character is a digit then push it to the stack
            if (!token.equals("+")
                    && !token.equals("-")
                    && !token.equals("*")
                    && !token.equals("/")) {
                operands.push(token);
            } else {
                // Get the operator
                switch (token) {
                    case "+":
                        int x = Integer.parseInt(operands.pop());
                        int y = Integer.parseInt(operands.pop());
                        operands.push(String.valueOf(x + y));
                        break;
                    case "-":
                        x = Integer.parseInt(operands.pop());
                        y = Integer.parseInt(operands.pop());
                        operands.push(String.valueOf(x - y));
                        break;
                    case "*":
                        x = Integer.parseInt(operands.pop());
                        y = Integer.parseInt(operands.pop());
                        operands.push(String.valueOf(x * y));
                        break;
                    case "/":
                        x = Integer.parseInt(operands.pop());
                        y = Integer.parseInt(operands.pop());
                        operands.push(String.valueOf(y / x));
                        break;
                    default:
                }
            }
        }
        return Integer.parseInt(operands.pop());
    }
}
