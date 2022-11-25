package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;

public class SortList {
    public ListNode sortList(ListNode A) {
        if (A == null || A.next == null) return A;
        ListNode first = A;
//        find the middle node
        ListNode second = findMidNode(A);
        first = sortList(first);
        second = sortList(second);
        ListNode res = mergeNodes(first, second);
        return res;
    }

    public ListNode mergeNodes(ListNode node1, ListNode node2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (node1 != null && node2 != null) {
            //find the smaller node
            if (node1.val <= node2.val) {
                dummy.next = node1;
                node1 = node1.next;
            } else {
                dummy.next = node2;
                node2 = node2.next;
            }
            dummy = dummy.next;
        }
        // add the remaining nodes
        dummy = addNodes(dummy, node1);
        addNodes(dummy, node2);
        head = head.next;
        return head;
    }

    public ListNode addNodes(ListNode node, ListNode node1) {
        while (node1 != null) {
            node.next = node1;
            node1 = node1.next;
            node = node.next;
        }
        return node;
    }

    public ListNode findMidNode(ListNode node) {
        ListNode doubleRate;
        ListNode prev;
        if (node == null || node.next == null) return node;
        doubleRate = node;
        prev = node;
        while (doubleRate.next != null && doubleRate.next.next != null) {
            prev = node;
            node = node.next;
            doubleRate = doubleRate.next.next;
        }
        prev = node;
        node = node.next;
        prev.next = null;
        return node;
    }
}


/*Q1. Sort List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Sort a linked list, A in O(n log n) time using constant space complexity.



Problem Constraints
0 <= |A| = 105



Input Format
The first and the only arugment of input contains a pointer to the head of the linked list, A.




Output Format
Return a pointer to the head of the sorted linked list.



Example Input
Input 1:

A = [3, 4, 2, 8]
Input 2:

A = [1]


Example Output
Output 1:

[2, 3, 4, 8]
Output 2:

[1]


Example Explanation
Explanation 1:

 The sorted form of [3, 4, 2, 8] is [2, 3, 4, 8].
Explanation 2:

 The sorted form of [1] is [1].*/

/*We can try to implement either merge sort or qsort.

Let us look at the merge sort. We start traversing the singly linked list to find the midpoint of the singly linked list.
Now, we will sort the first half and second half separately by calling the merge sort function on them.
Then we only have to merge the 2 lists ( Note that we already have solved a problem to merge 2 lists ).

*/