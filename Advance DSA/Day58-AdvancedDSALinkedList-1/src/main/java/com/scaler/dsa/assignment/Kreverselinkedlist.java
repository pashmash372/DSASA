package com.scaler.dsa.assignment;

import com.scaler.dsa.common.classes.ListNode;

public class Kreverselinkedlist {
    public ListNode reverseList(ListNode A, int B) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        prev.next = A;
        while (A != null) {
            int cnt = 1;
            ListNode cur = A;
            while (cur.next != null && cnt < B) {
                cnt++;
                cur = cur.next;
            }
            if (cnt == B) {
                ListNode next = cur.next;
                cur.next = null;
                ListNode rev = reverse(A);
                prev.next = rev;
                A.next = next;
            }
            prev = A;
            A = A.next;
        }
        return dummy.next;
    }

    public ListNode reverse(ListNode A) {
        ListNode prev = new ListNode(0), head = A;
        prev.next = A;
        while (A != null) {
            ListNode temp = A.next;
            A.next = prev;
            prev = A;
            A = temp;
        }
        head.next = null;
        return prev;
    }
}

/*Q2. K reverse linked list
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a singly linked list A and an integer B, reverse the nodes of the list B at a time and return the modified linked list.



Problem Constraints
1 <= |A| <= 103

B always divides A



Input Format
The first argument of input contains a pointer to the head of the linked list.

The second arugment of input contains the integer, B.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5, 6]
 B = 2
Input 2:

 A = [1, 2, 3, 4, 5, 6]
 B = 3


Example Output
Output 1:

 [2, 1, 4, 3, 6, 5]
Output 2:

 [3, 2, 1, 6, 5, 4]


Example Explanation
Explanation 1:

 For the first example, the list can be reversed in groups of 2.
    [[1, 2], [3, 4], [5, 6]]
 After reversing the K-linked list
    [[2, 1], [4, 3], [6, 5]]
Explanation 2:

 For the second example, the list can be reversed in groups of 3.
    [[1, 2, 3], [4, 5, 6]]
 After reversing the K-linked list
    [[3, 2, 1], [6, 5, 4]]
*/

/*The given linked list can be split into buckets of length K. For doing this; you can use two pointers that are K elements apart in the linked
list.

Now, let us try to solve the problem for one bucket, i.e., reversing
a single linked list. For this, you can check this.

So now, our problem has been modified to solve the problem for each bucket and then concatenating the lists to get a final
K-reversed linked list which is just an implementation issue.

*/