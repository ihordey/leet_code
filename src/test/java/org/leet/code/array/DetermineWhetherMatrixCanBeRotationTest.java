package org.leet.code.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DetermineWhetherMatrixCanBeRotationTest {
    private final DetermineWhetherMatrixCanBeRotation service = new DetermineWhetherMatrixCanBeRotation();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(int[][] source, int[][] destination, boolean expectedResult) {
        final boolean actualResult = service.findRotation(source, destination);

        assertThat(actualResult)
                .isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1, 1}, {0, 1}},
                        new int[][]{{1, 1}, {1, 0}},
                        true
                ),
                Arguments.of(
                        new int[][]{{1}},
                        new int[][]{{1}},
                        true
                ),
                Arguments.of(
                        new int[][]{{1}},
                        new int[][]{{0}},
                        false
                ),
                Arguments.of(
                        new int[][]{{0, 0}, {0, 1}},
                        new int[][]{{0, 0}, {1, 0}},
                        true
                ),
                Arguments.of(
                        new int[][]{{0, 1}, {1, 0}},
                        new int[][]{{1, 0}, {0, 1}},
                        true
                ),
                Arguments.of(
                        new int[][]{{0, 1}, {1, 1}},
                        new int[][]{{1, 0}, {0, 1}},
                        false
                ),

                Arguments.of(
                        new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}},
                        new int[][]{{1, 1, 1}, {0, 1, 0}, {0, 0, 0}},
                        true
                )
        );
    }
}