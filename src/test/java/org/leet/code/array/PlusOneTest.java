package org.leet.code.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PlusOneTest {
    private final PlusOne service = new PlusOne();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(int[] data, int[] expectedResult) {
        final var actualResult = service.plusOne(data);

        assertThat(actualResult)
                .containsExactly(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{9,  9}, new int[]{1, 0, 0}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
                Arguments.of(new int[]{9}, new int[]{1, 0}),
                Arguments.of(new int[]{4, 3, 2, 1}, new int[]{4, 3, 2, 2})
        );
    }
}