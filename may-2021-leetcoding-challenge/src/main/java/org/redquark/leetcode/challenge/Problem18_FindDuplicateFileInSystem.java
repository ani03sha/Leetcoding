package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a list paths of directory info, including the directory path, and all the files with contents in
 * this directory, return all the duplicate files in the file system in terms of their paths.
 * <p>
 * You may return the answer in any order.
 * <p>
 * A group of duplicate files consists of at least two files that have the same content.
 * <p>
 * A single directory info string in the input list has the following format:
 * <p>
 * "root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
 * It means there are n files (f1.txt, f2.txt ... fn.txt) with content (f1_content, f2_content ... fn_content)
 * respectively in the directory "root/d1/d2/.../dm".
 * <p>
 * Note that n >= 1 and m >= 0. If m = 0, it means the directory is just the root directory.
 * <p>
 * The output is a list of groups of duplicate file paths.
 * For each group, it contains all the file paths of the files that have the same content.
 * <p>
 * A file path is a string that has the following format: "directory_path/file_name.txt"
 * <p>
 * Constraints:
 * <p>
 * 1 <= paths.length <= 2 * 10^4
 * 1 <= paths[i].length <= 3000
 * 1 <= sum(paths[i].length) <= 5 * 10^5
 * paths[i] consist of English letters, digits, '/', '.', '(', ')', and ' '.
 * You may assume no files or directories share the same name in the same directory.
 * You may assume each given directory info represents a unique directory. A single blank space separates the directory path and file info.
 * <p>
 * <p>
 * Follow up:
 * <p>
 * Imagine you are given a real file system, how will you search files? DFS or BFS?
 * If the file content is very large (GB level), how will you modify your solution?
 * If you can only read the file by 1kb each time, how will you modify your solution?
 * What is the time complexity of your modified solution? What is the most time-consuming part and memory-consuming part of it? How to optimize?
 * How to make sure the duplicated files you find are not false positive?
 */
public class Problem18_FindDuplicateFileInSystem {

    public List<List<String>> findDuplicate(String[] paths) {
        // Resultant list of duplicate files
        List<List<String>> duplicates = new ArrayList<>();
        // Special case
        if (paths == null || paths.length == 0) {
            return duplicates;
        }
        // Map to store files with same content with each other
        Map<String, List<String>> contentToFileMapping = new HashMap<>();
        // Loop through the array of file paths
        for (String path : paths) {
            // Split the path string to get the different files
            String[] files = path.split(" ");
            for (int i = 1; i < files.length; i++) {
                String file = files[i];
                // Get the content of the file
                String content = file.substring(file.indexOf("(") + 1, file.indexOf(")"));
                List<String> duplicateFiles = contentToFileMapping.get(content);
                if (duplicateFiles == null) {
                    duplicateFiles = new ArrayList<>();
                }
                duplicateFiles.add(files[0] + "/" + file.substring(0, file.indexOf("(")));
                contentToFileMapping.put(content, duplicateFiles);
            }
        }
        // Traverse the map and add duplicate files combined to a list
        for (Map.Entry<String, List<String>> entry : contentToFileMapping.entrySet()) {
            duplicates.add(entry.getValue());
        }
        return duplicates;
    }
}
