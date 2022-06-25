package org.leet.memory;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        final char[] charsA = s.toCharArray();
        final char[] charsB = t.toCharArray();

        Arrays.sort(charsA);
        Arrays.sort(charsB);

        return Arrays.equals(charsA, charsB);
    }
}
