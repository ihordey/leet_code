package org.leet.code.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {
    private final SingleNumber service = new SingleNumber();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(int[] data, int expectedResult) {
        final var actualResult = service.singleNumber(data);

        assertThat(actualResult)
                .isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{-1,-1,-2}, -2),
                Arguments.of(new int[]{2, 2, 1}, 1),
                Arguments.of(new int[]{4, 1, 2, 1, 2}, 4),
                Arguments.of(new int[]{1}, 1)
        );
    }

}