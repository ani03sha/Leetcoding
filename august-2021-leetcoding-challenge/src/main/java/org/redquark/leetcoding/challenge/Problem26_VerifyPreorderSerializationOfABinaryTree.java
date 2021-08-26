package org.redquark.leetcoding.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * One way to serialize a binary tree is to use preorder traversal. When we encounter a non-null node, we record the node's value.
 * If it is a null node, we record using a sentinel value such as '#'.
 * <p>
 * For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#", where '#'
 * represents a null node.
 * <p>
 * Given a string of comma-separated values preorder, return true if it is a correct preorder traversal
 * serialization of a binary tree.
 * <p>
 * It is guaranteed that each comma-separated value in the string must be either an integer or a character
 * '#' representing null pointer.
 * <p>
 * You may assume that the input format is always valid.
 * <p>
 * For example, it could never contain two consecutive commas, such as "1,,3".
 * Note: You are not allowed to reconstruct the tree.
 * <p>
 * Constraints:
 * <p>
 * 1 <= preorder.length <= 10^4
 * preoder consist of integers in the range [0, 100] and '#' separated by commas ','.
 */
public class Problem26_VerifyPreorderSerializationOfABinaryTree {

    public boolean isValidSerialization(String preorder) {
        // Special case
        if (preorder == null || preorder.isEmpty()) {
            return true;
        }
        // Split the string by , to get all the nodes
        String[] nodes = preorder.split(",");
        // Stack to store the node and its children
        Stack<String> stack = new Stack<>();
        // Loop for all the nodes
        for (String node : nodes) {
            // Check if the current node is null (represented by '#')
            if (node.equals("#")) {
                // Check for the node and its children
                while (!stack.isEmpty() && stack.peek().equals("#")) {
                    stack.pop();
                    if (stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                }
            }
            stack.push(node);
        }
        return stack.size() == 1 && stack.peek().equals("#");
    }
}
