package org.redquark.leetcode.challenge;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of strings, group anagrams together.
 */
public class Challenge06_GroupAnagrams {

    /**
     * @param items - array of string elements
     * @return list of anagrams grouped together
     * <p>
     * Algorithm:
     * 1. Sort each element of the array
     * 2. Create a map with key as the sorted element and value is the list of indices of anagrams in original array
     * 3. Iterate through the map and create a list of each anagram and add the word on that index in it
     */
    public List<List<String>> group(String[] items) {
        // Sort each word in the list
        List<String> inputList = Arrays.stream(items)
                .map(s -> Stream.of(s.split(""))
                        .sorted()
                        .collect(Collectors.joining()))
                .collect(Collectors.toList());
        // Construct a map where key is each sorted word and value is the list of indices where it is present
        Map<String, List<Integer>> anagramMap = new HashMap<>();
        // Add the values to the map
        for (int i = 0; i < inputList.size(); i++) {
            anagramMap.putIfAbsent(inputList.get(i), new ArrayList<>());
            anagramMap.get(inputList.get(i)).add(i);
        }
        // List of lists where each list will have the anagrams grouped together
        List<List<String>> groupList = new ArrayList<>();
        // Traverse the map for each sorted key and read its indices list.
        // The elements present in the actual array are those anagrams
        for (Map.Entry<String, List<Integer>> entry : anagramMap.entrySet()) {
            // Temp list that will store the anagrams for the current element
            List<String> temp = new ArrayList<>();
            entry.getValue().forEach(i -> temp.add(items[i]));
            groupList.add(temp);
        }
        return groupList;
    }
}
