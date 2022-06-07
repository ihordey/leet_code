package org.leet.code.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FirstUniqueCharacterTest {
    private final FirstUniqueCharacter service = new FirstUniqueCharacter();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(String data, int expectedResult) {
        final int actualResult = service.firstUniqChar(data);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("leetcode", 0),
                Arguments.of("loveleetcode", 2),
                Arguments.of("aabb", -1)
        );
    }

}