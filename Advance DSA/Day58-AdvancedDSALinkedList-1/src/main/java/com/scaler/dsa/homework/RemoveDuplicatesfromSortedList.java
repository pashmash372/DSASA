package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode A) {
        if (A == null) return A;
        ListNode next;
        ListNode prevNode;
        int prev = A.val;
        next = A.next;
        prevNode = A;
        while (next != null) {
            if (next.val == prev) {
                prevNode.next = next.next;
            } else {
                prevNode = next;
                prev = next.val;
            }
            next=next.next;
        }
        return A;
    }
}


/*Q2. Remove Duplicates from Sorted List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a sorted linked list, delete all duplicates such that each element appears only once.



Problem Constraints
0 <= length of linked list <= 106



Input Format
First argument is the head pointer of the linked list.



Output Format
Return the head pointer of the linked list after removing all duplicates.



Example Input
Input 1:

 1->1->2
Input 2:

 1->1->2->3->3


Example Output
Output 1:

 1->2
Output 2:

 1->2->3


Example Explanation
Explanation 1:

 Each element appear only once in 1->2.
*/


/*Skip the node where head->next != NULL && head->val == head->next->val.

Make sure you take care of corner cases :
1) Do you handle repetitions at the end? ex : 1 -> 1
2) Do you handle cases where there is just one element? ex : 1
3) Do you handle cases where there is just one element repeated numerous times? 1->1->1->1->1->1

*/