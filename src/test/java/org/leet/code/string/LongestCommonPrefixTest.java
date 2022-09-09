package org.leet.code.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {
    private LongestCommonPrefix service = new LongestCommonPrefix();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(String[] data, String expectedResult) {
        assertThat(service.longestCommonPrefix(data))
                .isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new String[]{"ab", "a"}, "a"),
                Arguments.of(new String[]{"flower", "flower", "flower"}, "flower"),
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, "")
        );
    }
}