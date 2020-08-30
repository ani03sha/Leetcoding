package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty array of unique positive integers A, consider the following graph:
 * <p>
 * There are A.length nodes, labelled A[0] to A[A.length - 1];
 * There is an edge between A[i] and A[j] if and only if A[i] and A[j] share a common factor greater than 1.
 * Return the size of the largest connected component in the graph.
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 20000
 * 1 <= A[i] <= 100000
 */
public class Problem30_LargestComponentSizeByCommonFactor {

    /**
     * @param A - input array
     * @return - size of the largest connected component
     */
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
