package org.redquark.leetcoding.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Every valid email consists of a local name and a domain name, separated by the '@' sign.
 * Besides lowercase letters, the email may contain one or more '.' or '+'.
 * <p>
 * For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
 * If you add periods '.' between some characters in the local name part of an email address, mail sent there
 * will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.
 * <p>
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
 * If you add a plus '+' in the local name, everything after the first plus sign will be ignored.
 * This allows certain emails to be filtered. Note that this rule does not apply to domain names.
 * <p>
 * For example, "m.y+name@email.com" will be forwarded to "my@email.com".
 * It is possible to use both of these rules at the same time.
 * <p>
 * Given an array of strings emails where we send one email to each email[i], return the number of different
 * addresses that actually receive mails.
 * <p>
 * Constraints:
 * <p>
 * 1 <= emails.length <= 100
 * 1 <= emails[i].length <= 100
 * email[i] consist of lowercase English letters, '+', '.' and '@'.
 * Each emails[i] contains exactly one '@' character.
 * All local and domain names are non-empty.
 * Local names do not start with a '+' character.
 */
public class Problem27_UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        // Special case
        if (emails == null || emails.length == 0) {
            return 0;
        }
        // Set to store processed emails
        Set<String> processedEmails = new HashSet<>();
        // Loop through every email address in the array
        for (String email : emails) {
            // Get the local and domain name from the email address
            String localName = email.split("@")[0];
            String domainName = email.split("@")[1];
            // Process local name
            StringBuilder localNameBuilder = new StringBuilder();
            for (char c : localName.toCharArray()) {
                if (c == '.') {
                    continue;
                }
                if (c == '+') {
                    break;
                }
                localNameBuilder.append(c);
            }
            // Add the email address to the set
            processedEmails.add(localNameBuilder + "@" + domainName);
        }
        return processedEmails.size();
    }
}
