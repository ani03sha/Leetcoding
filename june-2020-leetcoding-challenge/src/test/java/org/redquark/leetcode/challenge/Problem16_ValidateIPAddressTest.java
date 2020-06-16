package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_ValidateIPAddressTest {

    private static final String IPV4 = "Ipv4";
    private static final String IPV6 = "IPv6";
    private static final String NEITHER = "Neither";
    private final Problem16_ValidateIPAddress testObject = new Problem16_ValidateIPAddress();

    @Test
    void testValidIPAddress() {
        String ip = "172.16.254.1";
        assertEquals(IPV4, testObject.validIPAddress(ip));

        ip = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        assertEquals(IPV6, testObject.validIPAddress(ip));

        ip = "256.256.256.256";
        assertEquals(NEITHER, testObject.validIPAddress(ip));
    }
}