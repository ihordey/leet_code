package org.leet.code;

import org.leet.code.utils.ListNode;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var temp = new ListNode();
        ListNode current = temp;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1; list1 = list1.next;
            } else {
                current.next = list2; list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null){
            current.next = list1;
        }
        if(list2 != null) {
            current.next = list2;
        }
        return temp.next;
    }
}
