package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string num that contains only digits and an integer target, return all possibilities to add the binary
 * operators '+', '-', or '*' between the digits of num so that the resultant expression evaluates to the target value.
 * <p>
 * Constraints:
 * <p>
 * 1 <= num.length <= 10
 * num consists of only digits.
 * -2^31 <= target <= 2^31 - 1
 */
public class Problem18_ExpressionAddOperators {

    public List<String> addOperators(String num, int target) {
        // List to store all the expressions
        List<String> expressions = new ArrayList<>();
        // Base case
        if (num == null || num.isEmpty()) {
            return expressions;
        }
        // Method call to evaluate expressions recursively
        evaluateExpressions(num, 0, target, 0, 0, "", expressions);
        return expressions;
    }

    private void evaluateExpressions(String num,
                                     int start,
                                     int target,
                                     long currentSum,
                                     long previousNumber,
                                     String currentResult,
                                     List<String> expressions) {
        // Base cases
        if (start == num.length() && currentSum == target) {
            expressions.add(currentResult);
            return;
        }
        if (start == num.length()) {
            return;
        }
        // Loop for every character in the string
        for (int i = start; i < num.length(); i++) {
            // Current string
            String currentString = num.substring(start, i + 1);
            // If the first character is zero then we can ignore it
            if (currentString.length() > 1 && currentString.charAt(0) == '0') {
                break;
            }
            // Get the numeric value
            long numericValue = Long.parseLong(currentString);
            if (currentResult.isEmpty()) {
                evaluateExpressions(num,
                        i + 1,
                        target,
                        numericValue,
                        numericValue,
                        currentString,
                        expressions);
            } else {
                evaluateExpressions(num,
                        i + 1,
                        target,
                        currentSum - previousNumber + previousNumber * numericValue,
                        previousNumber * numericValue,
                        currentResult + "*" + numericValue,
                        expressions);
                evaluateExpressions(num,
                        i + 1,
                        target,
                        currentSum + numericValue,
                        numericValue,
                        currentResult + "+" + numericValue,
                        expressions);
                evaluateExpressions(num,
                        i + 1,
                        target,
                        currentSum - numericValue,
                        -numericValue,
                        currentResult + "-" + numericValue,
                        expressions);
            }
        }
    }
}
