package com.scaler.dsa.assignment;

import com.scaler.dsa.common.ListNode;

public class DeletemiddlenodeofaLinkedList {
    public static ListNode solve(ListNode A) {
        if (A == null || A.next == null) return null;
        ListNode slow, fast, prevSlow;
        slow = fast = prevSlow = A;
        while (fast.next != null && fast.next.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
//        System.out.println(prevSlow.val);
        if (fast.next != null && fast.next.next == null) {
            prevSlow = slow;
            slow = slow.next;
        }
        prevSlow.next = slow.next;
        return A;
    }
}


/*Q1. Delete middle node of a Linked List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given a singly linked list, delete middle of the linked list.

For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5

If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.

For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.

Return the head of the linked list after removing the middle node.

If the input linked list has 1 node, then this node should be deleted and a null node should be returned.


Input Format

The only argument given is the node pointing to the head node of the linked list
*/