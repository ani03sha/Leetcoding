package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Write a function to check whether an input string is a valid IPv4 address or IPv6 address or neither.
 * <p>
 * IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers,
 * each ranging from 0 to 255, separated by dots ("."), e.g.,172.16.254.1;
 * <p>
 * Besides, leading zeros in the IPv4 is invalid. For example, the address 172.16.254.01 is invalid.
 * <p>
 * IPv6 addresses are represented as eight groups of four hexadecimal digits, each group representing 16 bits.
 * The groups are separated by colons (":"). For example, the address 2001:0db8:85a3:0000:0000:8a2e:0370:7334
 * is a valid one.
 * Also, we could omit some leading zeros among four hexadecimal digits and some low-case characters in the
 * address to upper-case ones, so 2001:db8:85a3:0:0:8A2E:0370:7334 is also a valid IPv6 address
 * (Omit leading zeros and using upper cases).
 * <p>
 * However, we don't replace a consecutive group of zero value with a single empty group using two consecutive
 * colons (::) to pursue simplicity. For example, 2001:0db8:85a3::8A2E:0370:7334 is an invalid IPv6 address.
 * <p>
 * Besides, extra leading zeros in the IPv6 is also invalid. For example, the address
 * 02001:0db8:85a3:0000:0000:8a2e:0370:7334 is invalid.
 * <p>
 * Note: You may assume there is no extra space or special characters in the input string.
 */
public class Problem16_ValidateIPAddress {

    private static final String IPV4 = "Ipv4";
    private static final String IPV6 = "IPv6";
    private static final String NEITHER = "Neither";

    /**
     * @param IP - IP address string
     * @return - if it is a valid address or not
     */
    public String validIPAddress(String IP) {
        // Count of dots in the IP string
        int dots = Math.toIntExact(IP.chars().filter(c -> c == '.').count());
        // Count of colons in the IP string
        int colons = Math.toIntExact(IP.chars().filter(c -> c == ':').count());
        // Check for IPv4
        if (dots == 3) {
            // Get tokens from the IP
            String[] tokens = IP.split("\\.", -1);
            // Check for each token
            for (String token : tokens) {
                if (token.length() == 0 || token.length() > 3) {
                    return NEITHER;
                }
                if (token.charAt(0) == 0 && token.length() != 1) {
                    return NEITHER;
                }
                for (char c : token.toCharArray()) {
                    if (!Character.isDigit(c)) {
                        return NEITHER;
                    }
                }
                if (Integer.parseInt(token) > 255) {
                    return NEITHER;
                }
            }
            return IPV4;
        }
        // Check for IPv6
        else if (colons == 7) {
            // Get tokens from the IP
            String[] tokens = IP.split(":", -1);
            // Check for each token
            for (String token : tokens) {
                if (token.length() == 0 || token.length() > 4) {
                    return NEITHER;
                }
                for (char c : token.toCharArray()) {
                    if (!(c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F')) {
                        return NEITHER;
                    }
                }
            }
            return IPV6;
        }
        return NEITHER;
    }
}
