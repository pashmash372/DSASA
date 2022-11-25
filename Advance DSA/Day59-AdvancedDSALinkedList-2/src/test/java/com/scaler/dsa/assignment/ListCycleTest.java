package com.scaler.dsa.assignment;

import com.scaler.dsa.common.classes.ListNode;
import org.junit.Test;

public class ListCycleTest {

    @Test
    public void detectCycle() {
        ListNode A = new ListNode(1);
        A.next = new ListNode(2);
        A.next.next = new ListNode(3);
        A.next.next.next = new ListNode(4);
//        A.next.next.next.next = A.next.next;

        ListCycle l = new ListCycle();
        ListNode node = l.detectCycle(A);
        System.out.println(node.val);

    }
}