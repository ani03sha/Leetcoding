package org.redquark.leetcode.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string path, which is an absolute path (starting with a slash '/') to a file or directory
 * in a Unix-style file system, convert it to the simplified canonical path.
 * <p>
 * In a Unix-style file system, a period '.' refers to the current directory, a double period '..'
 * refers to the directory up a level, and any multiple consecutive slashes (i.e. '//')
 * are treated as a single slash '/'.
 * <p>
 * For this problem, any other format of periods such as '...' are treated as file/directory names.
 * <p>
 * The canonical path should have the following format:
 * <p>
 * - The path starts with a single slash '/'.
 * - Any two directories are separated by a single slash '/'.
 * - The path does not end with a trailing '/'.
 * - The path only contains the directories on the path from the root directory to the target
 * file or directory (i.e., no period '.' or double period '..')
 * - Return the simplified canonical path.
 * <p>
 * Constraints:
 * <p>
 * 1 <= path.length <= 3000
 * path consists of English letters, digits, period '.', slash '/' or '_'.
 * path is a valid absolute Unix path.
 */
public class Problem05_SimplifyPath {

    /**
     * @param path - given path
     * @return valid unix path
     */
    public String simplifyPath(String path) {
        // Special case
        if (path == null || path.isEmpty()) {
            return "";
        }
        // Split the path by slashes
        String[] pathSplits = path.split("[/]+");
        // Stack to store the directories
        Stack<String> stack = new Stack<>();
        // Loop for every element in the path splits
        for (String p : pathSplits) {
            if (p.equals("/")) {
                continue;
            }
            if (p.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!p.equals(".") && !p.isEmpty()) {
                stack.push(p);
            }
        }
        // Resultant path
        StringBuilder result = new StringBuilder();
        if (stack.isEmpty()) {
            return "/";
        }
        for (String s : stack) {
            result.append("/").append(s);
        }
        return result.toString();
    }
}
