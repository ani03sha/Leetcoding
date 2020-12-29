package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree where node values are digits from 1 to 9. A path in the binary tree is said to
 * be pseudo-palindromic if at least one permutation of the node values in the path is a palindrome.
 * <p>
 * Return the number of pseudo-palindromic paths going from the root node to leaf nodes.
 * <p>
 * Constraints:
 * <p>
 * The given binary tree will have between 1 and 10^5 nodes.
 * Node values are digits from 1 to 9.
 */
public class Problem29_PseudoPalindromicPathsInABinaryTree {

    // Count of pseudo-palindromic paths
    int count = 0;

    /**
     * @param root - root of the binary tree
     * @return number of pseudo-palindromic paths
     */
    public int pseudoPalindromicPaths(Node root) {
        dfs(root, new int[10]);
        return count;
    }

    private void dfs(Node node, int[] hash) {
        // Base condition
        if (node == null) {
            return;
        }
        hash[node.data]++;
        if (node.left == null && node.right == null) {
            if (isPalindrome(hash)) {
                count++;
            }
            hash[node.data]--;
            return;
        }
        dfs(node.left, hash);
        dfs(node.right, hash);
        hash[node.data]--;
    }

    private boolean isPalindrome(int[] hash) {
        int oddCounter = 0;
        for (int h : hash) {
            if (h % 2 == 1) {
                oddCounter++;
            }
            if (oddCounter > 1) {
                return false;
            }
        }
        return true;
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
