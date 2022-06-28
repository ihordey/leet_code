package org.leet.code.string;

public class StringToInteger {
    public int myAtoi(String s) {
        int sigh = 1;
        int result = 0;
        int index = 0;
        int length = s.length();

        while (index < length && Character.isWhitespace(s.charAt(index))) {
            index++;
        }

        if (index < length && s.charAt(index) == '-') {
            sigh = -1;
            index++;
        } else if (index < length && s.charAt(index) == '+') {
            index++;
        }

        while (index < length && Character.isDigit(s.charAt(index))) {
            final int digit = s.charAt(index) - '0';

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sigh == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }
        return result * sigh;
    }
}
