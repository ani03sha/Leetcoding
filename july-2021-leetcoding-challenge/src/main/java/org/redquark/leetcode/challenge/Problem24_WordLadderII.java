package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence
 * of words beginWord -> s1 -> s2 -> ... -> sk such that:
 * <p>
 * Every adjacent pair of words differs by a single letter.
 * Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
 * sk == endWord
 * Given two words, beginWord and endWord, and a dictionary wordList, return all the shortest
 * transformation sequences from beginWord to endWord, or an empty list if no such sequence exists.
 * <p>
 * Each sequence should be returned as a list of the words [beginWord, s1, s2, ..., sk].
 * <p>
 * Constraints:
 * <p>
 * 1 <= beginWord.length <= 5
 * endWord.length == beginWord.length
 * 1 <= wordList.length <= 1000
 * wordList[i].length == beginWord.length
 * beginWord, endWord, and wordList[i] consist of lowercase English letters.
 * beginWord != endWord
 * All the words in wordList are unique.
 */
public class Problem24_WordLadderII {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        // List to store the final result
        List<List<String>> output = new ArrayList<>();
        // Set to represent nodes which are unvisited
        Set<String> unvisited = new HashSet<>(wordList);
        // Base case
        if (beginWord == null || endWord == null || beginWord.isEmpty() || endWord.isEmpty() || !unvisited.contains(endWord)) {
            return output;
        }
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> dMap = new HashMap<>();
        Set<String> wordSet = new HashSet<>(wordList);
        wordSet.add(beginWord);
        if (!wordSet.contains(endWord)) {
            return output;
        }
        bfs(endWord, wordSet, dMap, graph);
        dfs(beginWord, endWord, dMap, graph, output, new ArrayList<>());
        return output;
    }

    private void bfs(String endWord, Set<String> wordSet, Map<String, Integer> dMap, Map<String, List<String>> graph) {
        Queue<String> q = new LinkedList<>();
        q.offer(endWord);
        dMap.put(endWord, 0);
        int paces = 0;
        for (String s : wordSet) {
            graph.put(s, new ArrayList<>());
        }
        while (!q.isEmpty()) {
            paces++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String w = q.poll();
                List<String> nextWords = nextWords(Objects.requireNonNull(w), wordSet);
                graph.get(w).addAll(nextWords);
                for (String next : nextWords) {
                    if (!dMap.containsKey(next)) {
                        q.offer(next);
                        dMap.put(next, paces);
                    }
                }
            }
        }
    }

    private List<String> nextWords(String word, Set<String> wordSet) {
        List<String> result = new ArrayList<>();
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char cur = chars[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if (c == cur) {
                    continue;
                }
                chars[i] = c;
                String newString = new String(chars);
                if (wordSet.contains(newString)) {
                    result.add(newString);
                }
            }
            chars[i] = cur;
        }
        return result;
    }

    private void dfs(String currentWord, String endWord, Map<String, Integer> dMap, Map<String, List<String>> graph,
                     List<List<String>> result, List<String> path) {
        path.add(currentWord);
        if (currentWord.equals(endWord)) {
            result.add(new ArrayList<>(path));
        } else {
            for (String s : graph.get(currentWord)) {
                if (dMap.get(currentWord) == dMap.get(s) + 1) {
                    dfs(s, endWord, dMap, graph, result, path);
                }
            }
        }
        path.remove(path.size() - 1);
    }
}
