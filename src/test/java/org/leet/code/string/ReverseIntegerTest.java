package org.leet.code.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {
    private final ReverseInteger service = new ReverseInteger();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(int data, int expectedResult) {
        final int actualResult = service.reverse(data);

        assertThat(actualResult)
                .isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(-123, -321),
                Arguments.of(120, 21),
                Arguments.of(Integer.MAX_VALUE, -Integer.MAX_VALUE),
                Arguments.of(-Integer.MAX_VALUE, Integer.MAX_VALUE),
                Arguments.of(-Integer.MAX_VALUE + 1, Integer.MAX_VALUE - 1),
                Arguments.of(+Integer.MAX_VALUE + 1, 0)

        );
    }
}