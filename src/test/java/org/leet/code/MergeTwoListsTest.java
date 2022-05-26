package org.leet.code;

import org.junit.jupiter.api.Test;
import org.leet.code.utils.ListNodeUtils;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoListsTest {
    private final MergeTwoLists mergeTwoLists = new MergeTwoLists();

    @Test
    void mergeEmptyList() {
        final var left = ListNodeUtils.toListNode(new int[]{});
        final var right = ListNodeUtils.toListNode(new int[]{});
        final var result = mergeTwoLists.mergeTwoLists(left, right);

        assertThat(ListNodeUtils.toList(result))
                .isEmpty();
    }

    @Test
    void mergeZeroList() {
        final var left = ListNodeUtils.toListNode(new int[]{0});
        final var right = ListNodeUtils.toListNode(new int[]{0});
        final var result = mergeTwoLists.mergeTwoLists(left, right);

        assertThat(ListNodeUtils.toList(result))
                .isNotEmpty()
                .containsExactly(0, 0);
    }

    @Test
    void mergeOneZeroList() {
        final var left = ListNodeUtils.toListNode(new int[]{0});
        final var right = ListNodeUtils.toListNode(new int[]{});
        final var result = mergeTwoLists.mergeTwoLists(left, right);

        assertThat(ListNodeUtils.toList(result))
                .isNotEmpty()
                .containsExactly(0);
    }

    @Test
    void mergeEqualsList() {
        final var left = ListNodeUtils.toListNode(new int[]{1, 2, 4});
        final var right = ListNodeUtils.toListNode(new int[]{1, 3, 4});
        final var result = mergeTwoLists.mergeTwoLists(left, right);

        assertThat(ListNodeUtils.toList(result))
                .isNotEmpty()
                .containsExactly(1, 1, 2, 3, 4, 4);
    }

    @Test
    void mergeMoreLeftList() {
        final var left = ListNodeUtils.toListNode(new int[]{1, 2, 4, 7, 9});
        final var right = ListNodeUtils.toListNode(new int[]{1, 3, 4});
        final var result = mergeTwoLists.mergeTwoLists(left, right);

        assertThat(ListNodeUtils.toList(result))
                .isNotEmpty()
                .containsExactly(1, 1, 2, 3, 4, 4, 7, 9);
    }

    @Test
    void mergeMoreRightList() {
        final var left = ListNodeUtils.toListNode(new int[]{1, 3, 4});
        final var right = ListNodeUtils.toListNode(new int[]{1, 2, 4, 7, 9});
        final var result = mergeTwoLists.mergeTwoLists(left, right);

        assertThat(ListNodeUtils.toList(result))
                .isNotEmpty()
                .containsExactly(1, 1, 2, 3, 4, 4, 7, 9);
    }
}