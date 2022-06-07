package org.leet.code.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        final char[] chars = s.toCharArray();
        final Map<Character, Integer> uniqueData = new HashMap<>();

        for (char aChar : chars) {
            int count = uniqueData.getOrDefault(aChar, 0);
            uniqueData.put(aChar, ++count);
        }
        for (int i = 0; i < chars.length; i++) {
            if (uniqueData.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
