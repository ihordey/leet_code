package org.leet.code;

import org.leet.code.utils.ListNode;

import java.util.Objects;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final ListNode result = new ListNode();
        ListNode current = result;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int l1Val = Objects.nonNull(l1) ? l1.val : 0;
            int l2Val = Objects.nonNull(l2) ? l2.val : 0;

            int sum = l1Val + l2Val + carry;
            current = current.next = new ListNode(sum % 10);
            carry = sum / 10;

            l1 = Objects.nonNull(l1) ? l1.next : null;
            l2 = Objects.nonNull(l2) ? l2.next : null;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return result.next;
    }
}
