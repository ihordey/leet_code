package org.leet.code.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.leet.code.array.RotateArray;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RotateArrayTest {
    private final RotateArray service = new RotateArray();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(int[] data, int steps, int[] expectedResult) {
        service.myRotate(data, steps);

        assertThat(data)
                .containsExactly(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                Arguments.of(new int[]{1, 2}, 3, new int[]{2, 1}),
                Arguments.of(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100}),
                Arguments.of(new int[]{-1}, 2, new int[]{-1}),
                Arguments.of(new int[]{1, 2}, 5, new int[]{2, 1})
        );
    }
}