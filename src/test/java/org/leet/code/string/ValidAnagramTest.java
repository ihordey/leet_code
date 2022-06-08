package org.leet.code.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {
    private final ValidAnagram service = new ValidAnagram();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(String str1, String str2, boolean expectedResult) {
        final var actualResult = service.isAnagram(str1, str2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false)
        );
    }
}