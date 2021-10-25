package org.redquark.leetcoding.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * Implement the MinStack class:
 * <p>
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * <p>
 * Constraints:
 * <p>
 * -2^31 <= val <= 2^31 - 1
 * Methods pop, top and getMin operations will always be called on non-empty stacks.
 * At most 3 * 10^4 calls will be made to push, pop, top, and getMin.
 */
public class Problem25_MinStack {

    static class MinStack {

        private final Stack<Node> nodes;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            this.nodes = new Stack<>();
        }

        public void push(int value) {
            if (nodes.isEmpty()) {
                nodes.push(new Node(value, value));
            } else {
                nodes.push(new Node(value, Math.min(value, nodes.peek().minimum)));
            }
        }

        public void pop() {
            nodes.pop();
        }

        public int top() {
            return nodes.peek().data;
        }

        public int getMin() {
            return nodes.peek().minimum;
        }

        static class Node {
            private final int data;
            private final int minimum;

            Node(int data, int minimum) {
                this.data = data;
                this.minimum = minimum;
            }
        }
    }
}
