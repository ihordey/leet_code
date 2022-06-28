package org.leet.code.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class StringToIntegerTest {
    private final StringToInteger service = new StringToInteger();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(String str, int expectedResult) {
        final var actualResult = service.myAtoi(str);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("2147483646", 2147483646),
                Arguments.of("2147483647444", 2147483647),
                Arguments.of("     ", 0),
                Arguments.of("00000-42a1234", 0),
                Arguments.of("+", 0),
                Arguments.of("-", 0),
                Arguments.of("-+12", 0),
                Arguments.of("-91283472332", -2147483648),
                Arguments.of("0000000000000032", 32),
                Arguments.of("words and", 0),
                Arguments.of("words and 987", 0),
                Arguments.of("0032", 32),
                Arguments.of("42", 42),
                Arguments.of("   -42", -42)
        );
    }
}