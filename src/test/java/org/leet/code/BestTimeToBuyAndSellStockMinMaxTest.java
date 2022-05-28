package org.leet.code;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BestTimeToBuyAndSellStockMinMaxTest {
    private final BestTimeToBuyAndSellStockMinMax service = new BestTimeToBuyAndSellStockMinMax();

    @ParameterizedTest
    @MethodSource("provideData")
    void buyAndSel(int[] data, int expectedResult) {
        final var actualResult = service.maxProfit(data);
        assertThat(actualResult)
                .isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 7)
        );
    }
}