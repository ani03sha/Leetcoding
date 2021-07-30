package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Implement the MapSum class:
 * <p>
 * MapSum() Initializes the MapSum object.
 * void insert(String key, int val) Inserts the key-val pair into the map. If the key already existed,
 * the original key-value pair will be overridden to the new one.
 * int sum(string prefix) Returns the sum of all the pairs' value whose key starts with the prefix.
 */
public class Problem30_MapSumPairs {

    static class MapSum {

        private final Node root;

        /**
         * Initialize your data structure here.
         */
        public MapSum() {
            this.root = new Node();
        }

        public void insert(String key, int val) {
            char[] keyCharacters = key.toCharArray();
            Node node = root;
            for (char value : keyCharacters) {
                int c = value - 'a';
                if (node.childs[c] == null) {
                    node.childs[c] = new Node();
                }
                node = node.childs[c];
            }
            node.isLeaf = true;
            node.count = val;
        }

        public int sum(String prefix) {
            char[] prefixCharacters = prefix.toCharArray();
            Node node = root;
            for (char value : prefixCharacters) {
                int c = value - 'a';
                if (node.childs[c] == null) {
                    return 0;
                } else {
                    node = node.childs[c];
                }
            }
            return childsCount(node);
        }

        private int childsCount(Node node) {
            int count = node.count;
            for (int i = 0; i < 26; i++) {
                if (node.childs[i] != null) {
                    count += childsCount(node.childs[i]);
                }
            }
            return count;
        }

        private static class Node {
            int count;
            Node[] childs;
            boolean isLeaf;

            public Node() {
                this.childs = new Node[26];
            }
        }
    }
}
