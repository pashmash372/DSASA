package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;

public class PalindromeList {
    public int lPalin(ListNode A) {
        ListNode slow_ptr = A, fast_ptr = A;
        ListNode second_half, prev_of_slow_ptr = A;
        ListNode midnode = null; // To handle odd size list
        int res = 1; // initialize result
        if (A != null && A.next != null) {
            /* Get the middle of the list. Move slow_ptr by 1
               and fast_ptrr by 2, slow_ptr will have the middle
               ListNode */
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;

                /*We need previous of the slow_ptr for
                  linked lists  with odd elements */
                prev_of_slow_ptr = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
            /* fast_ptr would become NULL when there are even elements in list.
               And not NULL for odd elements. We need to skip the middle ListNode
               for odd case and store it somewhere so that we can restore the
               original list*/
            if (fast_ptr != null) {
                midnode = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
            // Now reverse the second half and compare it with first half
            second_half = slow_ptr;
            prev_of_slow_ptr.next = null; // NULL terminate first half
            second_half = reverse(second_half); // Reverse the second half
            res = compareLists(A, second_half); // compare
        }
        return res;
    }

    public ListNode reverse(ListNode head_ref) {
        ListNode prev = null;
        ListNode current = head_ref;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /*Function to check if two input lists have same val*/
    int compareLists(ListNode head1, ListNode head2) {
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val == temp2.val) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else return 0;
        }
        /*Both are empty return 1*/
        if (temp1 == null && temp2 == null) return 1;
        /*Will reach here when one is NULL and other is not*/
        return 0;
    }
}


/*Q1. Palindrome List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a singly linked list A, determine if it's a palindrome. Return 1 or 0, denoting if it's a palindrome or not, respectively.



Problem Constraints
1 <= |A| <= 105



Input Format
The first and the only argument of input contains a pointer to the head of the given linked list.



Output Format
Return 0, if the linked list is not a palindrome.

Return 1, if the linked list is a palindrome.



Example Input
Input 1:

A = [1, 2, 2, 1]
Input 2:

A = [1, 3, 2]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 The first linked list is a palindrome as [1, 2, 2, 1] is equal to its reversed form.
Explanation 2:

 The second linked list is not a palindrom as [1, 3, 2] is not equal to [2, 3, 1].
*/


/*To check palindrome, we just have to reverse the latter half of the linked list, and then we can, in (n/2) steps total can compare if all elements are the same or not.
For finding the midpoint, first, we can in O(N) traverse the whole list and calculate the total number of elements.
Reversing is again O(N).

*/