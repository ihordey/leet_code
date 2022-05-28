package org.leet.code;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {
    private final ContainsDuplicate service = new ContainsDuplicate();

    @ParameterizedTest
    @MethodSource("provideData")
    void containsDuplicates(int[] data, boolean expectedResult) {
        final boolean actualResult = service.containsDuplicate(data);

        assertThat(actualResult)
                .isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, true),
                Arguments.of(new int[]{1, 2, 3, 4}, false),
                Arguments.of(new int[]{-1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true)
        );
    }
}