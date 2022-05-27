package org.leet.code;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesSortedArrayTest {
    private final RemoveDuplicatesSortedArray service = new RemoveDuplicatesSortedArray();

    @Test
    void removeDuplicateFromEmptyArray() {
        int k = service.removeDuplicates(new int[]{});

        assertThat(k).isEqualTo(-1);
    }

    @Test
    void removeDuplicateMiddleSizeArray() {
        final int[] data = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = service.removeDuplicates(data);

        assertThat(k)
                .isEqualTo(5);
        assertThat(data)
                .isNotEmpty()
                .containsExactly(0, 1, 2, 3, 4, -1, -1, -1, -1, -1);
    }

    @Test
    void removeDuplicateMiddleSizeOneTwoArray() {
        final int[] data = {1, 2};
        int k = service.removeDuplicates(data);

        assertThat(k)
                .isEqualTo(2);
        assertThat(data)
                .isNotEmpty()
                .containsExactly(1, 2);
    }

    @Test
    void removeDuplicateMiddleSizeOneTwoThreeArray() {
        final int[] data = {1, 1, 2, 3};
        int k = service.removeDuplicates(data);

        assertThat(k)
                .isEqualTo(3);
        assertThat(data)
                .isNotEmpty()
                .containsExactly(1, 2, 3, -1);
    }
}