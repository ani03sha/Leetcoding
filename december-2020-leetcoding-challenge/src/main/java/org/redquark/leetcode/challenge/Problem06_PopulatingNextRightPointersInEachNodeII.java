package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary tree
 * <p>
 * struct Node {
 * int val;
 * Node *left;
 * Node *right;
 * Node *next;
 * }
 * Populate each next pointer to point to its next right node.
 * If there is no next right node, the next pointer should be set to NULL.
 * <p>
 * Initially, all next pointers are set to NULL.
 * <p>
 * Follow up:
 * <p>
 * You may only use constant extra space.
 * Recursive approach is fine, you may assume implicit stack space does not count as extra space
 * for this problem.
 */
public class Problem06_PopulatingNextRightPointersInEachNodeII {

    /**
     * @param root - root of the binary tree
     */
    public Node connect(Node root) {
        List<Node> nodes = new ArrayList<>();
        dfs(root, 0, nodes);
        return root;
    }

    private void dfs(Node root, int depth, List<Node> nodes) {
        if (root == null) {
            return;
        }
        if (depth >= nodes.size()) {
            nodes.add(root);
        } else {
            nodes.get(depth).next = root;
            nodes.set(depth, root);
        }
        dfs(root.left, depth + 1, nodes);
        dfs(root.right, depth + 1, nodes);
    }

    static class Node {
        final int data;
        Node left;
        Node right;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
