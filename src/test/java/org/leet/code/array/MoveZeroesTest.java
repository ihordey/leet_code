package org.leet.code.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MoveZeroesTest {
    private final MoveZeroes service = new MoveZeroes();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(int[] data, int[] expectedResult) {
        service.moveZeroesMySolution(data);
        assertThat(data).containsExactly(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{0, 0, 1}, new int[]{1, 0, 0}),
                Arguments.of(new int[]{1, 0, 0}, new int[]{1, 0, 0})
        );
    }
}