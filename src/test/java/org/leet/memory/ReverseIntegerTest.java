package org.leet.memory;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {
    private ReverseInteger service = new ReverseInteger();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(int data, int expectedResult) {
        final var actualResult = service.reverse(data);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(1534236469, 0),
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(120, 21)
        );
    }
}