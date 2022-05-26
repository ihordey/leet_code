package org.leet.code;

import org.junit.jupiter.api.Test;
import org.leet.code.utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.leet.code.utils.ListNodeUtils.toList;
import static org.leet.code.utils.ListNodeUtils.toListNode;

class AddTwoNumbersTest {
    @Test
    void addEqualsData() {
        final ListNode firstLN = toListNode(new int[]{2, 4, 3});
        final ListNode secondLN = toListNode(new int[]{5, 6, 4});

        AddTwoNumbers service = new AddTwoNumbers();
        ListNode result = service.addTwoNumbers(firstLN, secondLN);
        assertThat(toList(result))
                .isNotEmpty()
                .containsExactly(7, 0, 8);
    }

    @Test
    void interesting() {
        final ListNode firstLN = toListNode(new int[]{3, 7});
        final ListNode secondLN = toListNode(new int[]{9, 2});

        AddTwoNumbers service = new AddTwoNumbers();
        ListNode result = service.addTwoNumbers(firstLN, secondLN);
        assertThat(toList(result))
                .isNotEmpty()
                .containsExactly(2, 0, 1);
    }


    @Test
    void addMoreDataToLeft() {
        final ListNode firstLN = toListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        final ListNode secondLN = toListNode(new int[]{9, 9, 9, 9});

        AddTwoNumbers service = new AddTwoNumbers();
        ListNode result = service.addTwoNumbers(firstLN, secondLN);
        assertThat(toList(result))
                .isNotEmpty()
                .containsExactly(8, 9, 9, 9, 0, 0, 0, 1);
    }

    @Test
    void addMoreDataToRight() {
        final ListNode firstLN = toListNode(new int[]{9, 9, 9, 9});
        final ListNode secondLN = toListNode(new int[]{9, 9, 9, 9, 9, 9, 9});

        AddTwoNumbers service = new AddTwoNumbers();
        ListNode result = service.addTwoNumbers(firstLN, secondLN);
        assertThat(toList(result))
                .isNotEmpty()
                .containsExactly(8, 9, 9, 9, 0, 0, 0, 1);
    }

}