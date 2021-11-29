package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a list of accounts where each element accounts[i] is a list of strings, where the first element accounts[i][0]
 * is a name, and the rest of the elements are emails representing emails of the account.
 * <p>
 * Now, we would like to merge these accounts. Two accounts definitely belong to the same person if there is some
 * common email to both accounts. Note that even if two accounts have the same name, they may belong to different
 * people as people could have the same name. A person can have any number of accounts initially, but all of their
 * accounts definitely have the same name.
 * <p>
 * After merging the accounts, return the accounts in the following format: the first element of each account is the
 * name, and the rest of the elements are emails in sorted order. The accounts themselves can be returned in any order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= accounts.length <= 1000
 * 2 <= accounts[i].length <= 10
 * 1 <= accounts[i][j] <= 30
 * accounts[i][0] consists of English letters.
 * accounts[i][j] (for j > 0) is a valid email.
 */
public class Problem29_AccountsMerge {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        // Special case
        if (accounts == null || accounts.size() <= 1) {
            return accounts;
        }
        UnionFind unionFind = new UnionFind(accounts.size());
        Map<String, Integer> mappings = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            List<String> account = accounts.get(i);
            List<String> emails = account.subList(1, account.size());
            // Loop through emails
            for (String email : emails) {
                if (!mappings.containsKey(email)) {
                    mappings.put(email, i);
                } else {
                    int previousAccount = mappings.get(email);
                    unionFind.union(previousAccount, i);
                }
            }
        }
        // Now merge the accounts
        Map<Integer, Account> rootAccounts = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            List<String> account = accounts.get(i);
            int rootAccountID = unionFind.getAbsoluteParent(i);
            if (!rootAccounts.containsKey(rootAccountID)) {
                String rootAccountName = accounts.get(rootAccountID).get(0);
                rootAccounts.put(rootAccountID, new Account(rootAccountName));
            }
            List<String> emails = account.subList(1, account.size());
            rootAccounts.get(rootAccountID).emails.addAll(emails);
        }
        return rootAccounts.values().stream().map(Account::stringify).collect(Collectors.toList());
    }

    static class UnionFind {
        private final int[] parent;

        UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        private void union(int x, int y) {
            int px = getAbsoluteParent(x);
            int py = getAbsoluteParent(y);
            if (px != py) {
                parent[px] = py;
            }
        }

        private int getAbsoluteParent(int i) {
            if (parent[i] == i) {
                return i;
            }
            parent[i] = getAbsoluteParent(parent[i]);
            return parent[i];
        }
    }

    static class Account {
        private final String name;
        private final Set<String> emails = new TreeSet<>();

        Account(String name) {
            this.name = name;
        }

        List<String> stringify() {
            List<String> list = new ArrayList<>();
            list.add(name);
            list.addAll(emails);
            return list;
        }
    }
}
