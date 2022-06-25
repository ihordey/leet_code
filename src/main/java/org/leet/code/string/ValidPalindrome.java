package org.leet.code.string;

import java.nio.charset.StandardCharsets;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        final StringBuilder builder = new StringBuilder();

        for (Character ch : s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)){
                builder.append(Character.toLowerCase(ch));
            }
        }
        return builder.toString().equals(builder.reverse().toString());
    }
}
