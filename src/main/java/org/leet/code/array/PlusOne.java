package org.leet.code.array;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        final var result = new int[digits.length + 1];

        int carry = 0;

        int digitsLastIndex = digits.length - 1;
        for (int i = digitsLastIndex, j = result.length - 1; i >= 0; i--, j--) {
            int sum = i == digitsLastIndex ? digits[i] + 1 : digits[i];
            int tempSum = sum + carry;
            result[j] = tempSum % 10;
            carry = tempSum / 10;
        }
        if (carry != 0) {
            result[0] = carry;
            return result;
        }
        return Arrays.copyOfRange(result, 1, result.length);
    }
}
