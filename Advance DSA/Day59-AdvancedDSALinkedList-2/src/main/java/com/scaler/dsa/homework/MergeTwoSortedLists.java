package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        return solve(A, B);
    }

    public ListNode solve(ListNode A, ListNode B) {
        if (A == null) return B;
        if (B == null) return A;
        ListNode head;
        ListNode node = new ListNode(0);
        head = node;
        while (A != null && B != null) {
            //compare both the values
            if (A.val <= B.val) {
                node.next = A;
                A = A.next;
                node = node.next;
            } else {
                node.next = B;
                B = B.next;
                node = node.next;
            }
        }
        if (A == null) node.next = B;
        else node.next = A;
        head = head.next;
        return head;
    }
}


/*Q2. Merge Two Sorted Lists
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Merge two sorted linked lists, A and B, and return it as a new list.

The new list should be made by splicing together the nodes of the first two lists and should also be sorted.



Problem Constraints
0 <= |A|, |B| <= 105



Input Format
The first argument of input contains a pointer to the head of linked list A.

The second argument of input contains a pointer to the head of linked list B.



Output Format
Return a pointer to the head of the merged linked list.



Example Input
Input 1:

 A = 5 -> 8 -> 20
 B = 4 -> 11 -> 15
Input 2:

 A = 1 -> 2 -> 3
 B = Null


Example Output
Output 1:

 4 -> 5 -> 8 -> 11 -> 15 -> 20
Output 2:

 1 -> 2 -> 3


Example Explanation
Explanation 1:

 Merging A and B will result in 4 -> 5 -> 8 -> 11 -> 15 -> 20
Explanation 2:

 We don't need to merge as B is empty. */


/*The first thing to note is that all you would want to do is modify the next pointers. You don’t need to create new nodes.

At every step, you choose the minimum of the current head X on the 2 lists and modify your answer’s next pointer to X. You move the current pointer on the said list and the current answer.

Corner case,
Make sure that at the end of the loop, when one of the lists goes empty, you do include the remaining elements from the second list into your answer.

Test case : 1->2->3 4->5->6

*/