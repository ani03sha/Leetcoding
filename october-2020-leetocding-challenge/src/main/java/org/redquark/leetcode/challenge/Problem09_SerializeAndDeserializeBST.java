package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Serialization is converting a data structure or object into a sequence of bits so that it can be stored
 * in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in
 * the same or another computer environment.
 * <p>
 * Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how
 * your serialization/deserialization algorithm should work.
 * You need to ensure that a binary search tree can be serialized to a string, and this string can be
 * deserialized to the original tree structure.
 * <p>
 * The encoded string should be as compact as possible.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 10^4].
 * 0 <= Node.val <= 10^4
 * The input tree is guaranteed to be a binary search tree.
 */
public class Problem09_SerializeAndDeserializeBST {

    // Encodes a tree to a single string.
    public String serialize(Node root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    private void serialize(Node root, StringBuilder sb) {
        if (root == null) {
            return;
        }
        sb.append(root.data).append("#");
        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        Node root = null;
        String[] nodes = data.split("#");
        for (String node : nodes) {
            int i = Integer.parseInt(node);
            root = deserializeToTree(root, i);
        }
        return root;
    }

    private Node deserializeToTree(Node root, int i) {
        if (root == null) {
            root = new Node(i);
            return root;
        }
        if (i < root.data) {
            root.left = deserializeToTree(root.left, i);
        } else {
            root.right = deserializeToTree(root.right, i);
        }
        return root;
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
