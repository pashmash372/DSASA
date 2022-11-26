package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;

public class AddTwoNumbersasLists {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode node;
        ListNode prev = null;
        ListNode first = null;
        int carry = 0;
        int sum = 0;
        while (A != null || B != null || carry != 0) {
            node = new ListNode(0);
//            find the value of each node
            sum = carry;
            if (first == null) first = node;
            if (prev != null) prev.next = node;
            if (A != null) {
                sum += A.val;
                A = A.next;
            }
            if (B != null) {
                sum += B.val;
                B = B.next;
            }
            node.val = sum % 10;
            sum /= 10;
            carry = sum;
            prev = node;
        }
        return first;
    }
}


/*Q2. Add Two Numbers as Lists
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given two linked lists, A and B, representing two non-negative numbers.

The digits are stored in reverse order, and each of their nodes contains a single digit.

Add the two numbers and return it as a linked list.



Problem Constraints
1 <= |A|, |B| <= 105



Input Format
The first argument of input contains a pointer to the head of linked list A.

The second argument of input contains a pointer to the head of linked list B.



Output Format
Return a pointer to the head of the required linked list.



Example Input
Input 1:


 A = [2, 4, 3]
 B = [5, 6, 4]
Input 2:


 A = [9, 9]
 B = [1]


Example Output
Output 1:


 [7, 0, 8]
Output 2:


 [0, 0, 1]


Example Explanation
Explanation 1:

 A = 342 and B = 465. A + B = 807.
Explanation 2:

 A = 99 and B = 1. A + B = 100.
*/


/*This problem can be solved exactly like the naive addition is done, using the temporary sum and implementing a value that represents a carryover.
Although, you can consider that there are two edge cases to it:

1) The first list can be shorter than the second list. How will you solve a problem like that?
2) It is possible that the answer has more digits than both the given integers. How to handle a case like this?

*/