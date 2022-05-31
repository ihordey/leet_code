package org.leet.code.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class IntersectionOfTwoArraysTest {
    private final IntersectionOfTwoArrays service = new IntersectionOfTwoArrays();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(int[] leftData, int[] rightData, int[] expectedResult) {
        final var actualResult = service.intersection(leftData, rightData);

        assertThat(actualResult)
                .containsExactly(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2}),
                Arguments.of(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new int[]{4, 9}));
    }
}