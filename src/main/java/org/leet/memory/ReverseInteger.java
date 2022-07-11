package org.leet.memory;

public class ReverseInteger {
    final int max_Value_Of_Last_Digit = Integer.MAX_VALUE % 10;

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            final int digit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            result = result * 10 + digit;
        }
        return result;
    }
}
