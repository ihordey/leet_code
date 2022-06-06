package org.leet.code.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringTest {
    private final ReverseString service = new ReverseString();

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(char[] data, char[] expectedResult) {
        service.reverseString(data);

        assertThat(data)
                .containsExactly(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(
                        new char[]{'h'},
                        new char[]{'h'}
                ),
                Arguments.of(
                        new char[]{'h', 'o'},
                        new char[]{'o', 'h'}
                ),
                Arguments.of(
                        new char[]{'h', 'e', 'l', 'l', 'o'},
                        new char[]{'o', 'l', 'l', 'e', 'h'}
                ),
                Arguments.of(
                        new char[]{'H', 'a', 'n', 'n', 'a', 'h'},
                        new char[]{'h', 'a', 'n', 'n', 'a', 'H'})
        );
    }

}