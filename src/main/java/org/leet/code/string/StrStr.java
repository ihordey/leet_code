package org.leet.code.string;

public class StrStr {

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isBlank()) {
            return 0;
        }
        final char[] sourceChars = haystack.toCharArray();
        final char[] findChars = needle.toCharArray();

        char findFirstChar = findChars[0];
        for (int i = 0; i < sourceChars.length; i++) {
            if (sourceChars[i] == findFirstChar) {
                int l = 0;
                for (int k = i; l < findChars.length && k < sourceChars.length; k++, l++) {
                    if (sourceChars[k] != findChars[l]) {
                        break;
                    }
                }
                if (l == findChars.length) {
                    return i;
                }
            }
        }
        return -1;
    }
}
