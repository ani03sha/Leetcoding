package org.redquark.leetcode.challenge;

public class Challenge16_ValidParenthesisString {

    public boolean checkValidString(String s) {
        if (s.length() == 0 || (s.length() == 1 && s.charAt(0) == '*')) {
            return true;
        }
        // This variable will keep track of the number of parenthesis encountered so far
        int balance = 0;
        // Loop through the entire string from the left
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                balance--;
            } else {
                // Either '(' or '*' has encountered
                balance++;
            }
            // If there are more right parentheses than left even after converting * to left parenthesis
            // it means the string is unbalanced
            if (balance < 0) {
                return false;
            }
        }
        // At the end of the loop, if the balance is zero which means all the '(' and '*" together
        // have cancelled out all the ')', then the string is balanced
        if (balance == 0) {
            return true;
        }
        // If we reach at this point, it only means we don't know yet if the string is balanced
        // Therefore, we will traverse from right this time
        // Reinitialize balance
        balance = 0;
        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '(') {
                balance--;
            } else {
                // Either ')' or '*' has encountered
                balance++;
            }
            if (balance < 0) {
                return false;
            }
        }
        return true;
    }
}
