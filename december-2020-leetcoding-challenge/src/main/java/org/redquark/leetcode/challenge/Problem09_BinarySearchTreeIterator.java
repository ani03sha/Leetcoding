package org.redquark.leetcode.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Implement the BSTIterator class that represents an iterator over the in-order traversal
 * of a binary search tree (BST):
 * <p>
 * BSTIterator(TreeNode root) Initializes an object of the BSTIterator class.
 * The root of the BST is given as part of the constructor.
 * <p>
 * The pointer should be initialized to a non-existent number smaller than any element in
 * the BST.
 * <p>
 * boolean hasNext() Returns true if there exists a number in the traversal to the
 * right of the pointer, otherwise returns false.
 * <p>
 * int next() Moves the pointer to the right, then returns the number at the pointer.
 * Notice that by initializing the pointer to a non-existent smallest number, the first
 * call to next() will return the smallest element in the BST.
 * <p>
 * You may assume that next() calls will always be valid. That is, there will be at least
 * a next number in the in-order traversal when next() is called.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^5].
 * 0 <= Node.val <= 10^6
 * At most 105 calls will be made to hasNext, and next.
 * <p>
 * <p>
 * Follow up:
 * <p>
 * Could you implement next() and hasNext() to run in average O(1) time and use O(h) memory,
 * where h is the height of the tree?
 */
public class Problem09_BinarySearchTreeIterator {

    static class BSTIterator {

        final Stack<Node> stack = new Stack<>();

        public BSTIterator(Node root) {
            pushToLeft(root);
        }

        public int next() {
            Node node = stack.pop();
            pushToLeft(node.right);
            return node.data;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        private void pushToLeft(Node node) {
            if (node != null) {
                stack.push(node);
                pushToLeft(node.left);
            }
        }

        static class Node {
            final int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
            }
        }
    }
}
