package org.leet.code.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StrStrTest {
    private StrStr service = new StrStr();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(String haystack, String needle,  int expectedResult) {
        final var actualResult = service.strStr(haystack, needle);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("hello", "ll", 2),
                Arguments.of("headfl", "ll", -1),
                Arguments.of("aaaaa", "bba", -1),
                Arguments.of("test", "", 0)
        );
    }
}