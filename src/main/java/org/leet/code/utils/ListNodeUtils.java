package org.leet.code.utils;

import java.util.ArrayList;
import java.util.List;

public class ListNodeUtils {
    private ListNodeUtils() {
    }

    public static ListNode toListNode(int[] data) {
        ListNode head = new ListNode(data[data.length - 1]);
        for (int i = data.length - 2; i >= 0; i--) {
            head = new ListNode(data[i], head);
        }
        return head;
    }

    public static List<Integer> toList(ListNode listNode) {
        final List<Integer> result = new ArrayList<>(10);
        while (listNode != null) {
            result.add(listNode.val);
            listNode = listNode.next;
        }
        return result;
    }
}
