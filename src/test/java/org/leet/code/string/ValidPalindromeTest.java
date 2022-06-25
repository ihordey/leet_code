package org.leet.code.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {
    private ValidPalindrome service = new ValidPalindrome();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(String str, boolean expectedResult) {
        final var actualResult = service.isPalindrome(str);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("0P", false),
                Arguments.of("a.", true),
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of("", true)

        );
    }
}