package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_UniqueEmailAddressesTest {

    private final Problem27_UniqueEmailAddresses testObject = new Problem27_UniqueEmailAddresses();

    @Test
    void testNumUniqueEmails() {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        assertEquals(2, testObject.numUniqueEmails(emails));

        emails = new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        assertEquals(3, testObject.numUniqueEmails(emails));
    }
}