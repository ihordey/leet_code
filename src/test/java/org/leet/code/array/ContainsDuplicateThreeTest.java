package org.leet.code.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateThreeTest {
    private final ContainsDuplicateThree service = new ContainsDuplicateThree();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(int[] data, int k, int t, boolean expectedResult) {
        boolean actualResult = service.containsNearbyAlmostDuplicateAsSet(data, k, t);

        assertThat(actualResult)
                .isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{-2147483648, 2147483647}, 1, 1, false),
                Arguments.of(new int[]{8, 7, 15, 1, 6, 1, 9, 15}, 1, 3, true),
                Arguments.of(new int[]{1, 2, 3, 1}, 3, 0, true),
                Arguments.of(new int[]{1, 0, 1, 1}, 1, 2, true),
                Arguments.of(new int[]{1, 5, 9, 1, 5, 9}, 2, 3, false)
        );
    }
}