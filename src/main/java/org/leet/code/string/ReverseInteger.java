package org.leet.code.string;

public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        final String strValue = String.valueOf(x);
        final String sign = strValue.substring(0, 1);
        final boolean isNegative = sign.equals("-");

        final char[] chars = isNegative ? strValue.substring(1).toCharArray() : strValue.toCharArray();

        reverse(chars);
        final long reverseValue = Long.parseLong(new String(chars));
        return Math.abs(reverseValue) > Integer.MAX_VALUE ? 0 : isNegative ? -(int) reverseValue : (int) reverseValue;
    }

    private void reverse(char[] chars) {
        final int middle = chars.length / 2;
        for (int lr = 0, rl = chars.length - 1; lr < middle && rl >= middle; lr++, rl--) {
            final char tmp = chars[lr];
            chars[lr] = chars[rl];
            chars[rl] = tmp;
        }
    }
}
