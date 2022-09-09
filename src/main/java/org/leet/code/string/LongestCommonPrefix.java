package org.leet.code.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        var result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if(result.isBlank()){
                return result;
            }
            final var minLength = Math.min(result.length(), strs[i].length());
            int j = 0;
            for (; j < minLength; j++) {
                if (result.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            result = strs[i].substring(0, j);
        }
        return result;
    }
}
