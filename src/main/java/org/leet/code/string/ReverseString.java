package org.leet.code.string;

public class ReverseString {

    public void reverseString(char[] s) {
        if (s.length != 0) {
            final int middleIndex = s.length / 2;

            for (int lr = 0, rl = s.length - 1; lr < middleIndex && middleIndex <= rl; lr++, rl--) {
                final char tmp = s[lr];
                s[lr] = s[rl];
                s[rl] = tmp;
            }
        }
    }
}