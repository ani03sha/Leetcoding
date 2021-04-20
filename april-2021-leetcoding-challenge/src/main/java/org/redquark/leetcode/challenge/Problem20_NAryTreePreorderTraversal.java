package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value (See examples)
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 10^4].
 * 0 <= Node.val <= 10^4
 * The height of the n-ary tree is less than or equal to 1000.
 * <p>
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class Problem20_NAryTreePreorderTraversal {

    public List<Integer> preorder(Node root) {
        // List to store result
        List<Integer> preorderTraversal = new ArrayList<>();
        // Base case
        if (root == null) {
            return preorderTraversal;
        }
        // Stack to store the nodes traversed
        Stack<Node> nodes = new Stack<>();
        // Add root to the stack
        nodes.push(root);
        // Loop until stack is empty
        while (!nodes.isEmpty()) {
            // Get the node at head
            Node head = nodes.pop();
            // Add data to the resultant list
            preorderTraversal.add(head.val);
            // Get the children list of head node
            List<Node> children = head.children;
            if (children != null) {
                for (int i = children.size() - 1; i >= 0; i--) {
                    nodes.push(children.get(i));
                }
            }
        }
        return preorderTraversal;
    }

    static class Node {
        final int val;
        List<Node> children;

        Node(int val) {
            this.val = val;
        }

        Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }
}
