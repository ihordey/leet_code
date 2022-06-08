package org.leet.code.string;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        final var size = 26;
        final var sUnique = new int[size];
        final var tUnique = new int[size];

        for (int i = 0; i < s.length(); i++) {
            sUnique[s.charAt(i) - 'a']++;
            tUnique[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < size; i++) {
            if (tUnique[i] != sUnique[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramSort(String s, String t) {
        final var sChars = s.toCharArray();
        final var tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
