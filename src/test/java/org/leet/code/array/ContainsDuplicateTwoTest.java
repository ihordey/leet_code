package org.leet.code.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTwoTest {
    private final ContainsDuplicateTwo service = new ContainsDuplicateTwo();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(int[] data, int steps, boolean expectedResult) {
        boolean actualResult = service.containsNearbyDuplicate(data, steps);

        assertThat(actualResult)
                .isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, 3, true),
                Arguments.of(new int[]{1, 0, 1, 1}, 1, true),
                Arguments.of(new int[]{1, 2, 3, 1, 2, 3}, 2, false)
        );
    }
}