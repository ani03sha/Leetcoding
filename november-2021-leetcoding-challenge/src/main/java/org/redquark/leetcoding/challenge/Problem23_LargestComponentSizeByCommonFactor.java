package org.redquark.leetcoding.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer array of unique positive integers nums. Consider the following graph:
 * <p>
 * There are nums.length nodes, labeled nums[0] to nums[nums.length - 1],
 * There is an undirected edge between nums[i] and nums[j] if nums[i] and nums[j] share a common factor greater than 1.
 * Return the size of the largest connected component in the graph.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 10^4
 * 1 <= nums[i] <= 10^5
 * All the values of nums are unique.
 */
public class Problem23_LargestComponentSizeByCommonFactor {

    public int largestComponentSize(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Arrays.stream(A).max().getAsInt();
        UnionFind unionFind = new UnionFind(max);
        for (int a : A) {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    unionFind.union(a, i);
                    unionFind.union(a, a / i);
                }
            }
        }
        int result = 0;
        for (int a : A) {
            int m = unionFind.find(a);
            if (map.containsKey(m)) {
                map.put(m, map.get(m) + 1);
            } else {
                map.put(m, 1);
            }
            result = Math.max(result, map.get(m));
        }
        return result;
    }

    static class UnionFind {
        int[] parent;
        int[] rank;

        UnionFind(int max) {
            this.parent = new int[max + 1];
            this.rank = new int[max + 1];

            for (int i = 0; i <= max; i++) {
                parent[i] = i;
            }
        }

        public void union(int u, int v) {
            int x = find(u);
            int y = find(v);
            if (x == y) {
                return;
            }
            if (rank[x] < rank[v]) {
                parent[x] = y;
            } else if (rank[x] > rank[v]) {
                parent[y] = x;
            } else {
                parent[x] = y;
                rank[y]++;
            }
        }

        public int find(int u) {
            while (u != parent[u]) {
                parent[u] = parent[parent[u]];
                u = parent[u];
            }
            return u;
        }
    }
}
