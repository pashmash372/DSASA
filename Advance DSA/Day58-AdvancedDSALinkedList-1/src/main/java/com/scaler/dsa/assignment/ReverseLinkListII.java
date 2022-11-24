package com.scaler.dsa.assignment;

import com.scaler.dsa.common.classes.ListNode;

public class ReverseLinkListII {
    public ListNode reverseBetween(ListNode A, int m, int n) {
        int i;
        ListNode node = A;
        ListNode prev = null;
        m--;
        n--;
        for (i = 0; i < m; i++) {
            prev = node;
            node = node.next;
        }
        if (prev != null) {
            prev.next = reverseList(node, n - m + 1);
        } else A = reverseList(node, n - m + 1);
        return A;
    }

    public ListNode reverseList(ListNode A, int count) {
        ListNode node, prev, temp, last;
        node = A;
        last = A;
        if (node == null) return null;
        prev = null;
        while (node != null && count > 0) {
            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
            count--;
        }
        last.next = node;
        return prev;
    }
}

/*Q4. Reverse Link List II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Reverse a linked list A from position B to C.

NOTE: Do it in-place and in one-pass.



Problem Constraints
1 <= |A| <= 106

1 <= B <= C <= |A|



Input Format
The first argument contains a pointer to the head of the given linked list, A.

The second arugment contains an integer, B.

The third argument contains an integer C.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 2
 C = 4

Input 2:

 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 1
 C = 5


Example Output
Output 1:

 1 -> 4 -> 3 -> 2 -> 5
Output 2:

 5 -> 4 -> 3 -> 2 -> 1


Example Explanation
Explanation 1:

 In the first example, we want to reverse the highlighted part of the given linked list : 1 -> 2 -> 3 -> 4 -> 5
 Thus, the output is 1 -> 4 -> 3 -> 2 -> 5
Explanation 2:

 In the second example, we want to reverse the highlighted part of the given linked list : 1 -> 4 -> 3 -> 2 -> 5
 Thus, the output is 5 -> 4 -> 3 -> 2 -> 1
*/

/*If you are still stuck at reversing the full linked list problem,
then would maintaining curNode, nextNode and a tmpNode help?

Maybe at every step, you do something like this :

    tmp = nextNode->next;
            nextNode->next = cur;
            cur = nextNode;
            nextNode = tmp;
Now, let’s say you did solve the problem of reversing the linked list and are stuck at applying it to the current problem.
What if your function reverses the linked list and returns the endNode of the list.
You can simply do
prevNodeOfFirstNode->next = everseLinkedList(curNode, n - m + 1);

Explanation in the video:
We can also find the two pointers between which the list needs to be reversed and only reverse that portion.
We will also have to make two new connections, one from the node just before the first node in the original portion to the node at the starting of the reversed portion, another from the first node of the original portion to the node after the last node in the original portion.
A detailed explanation is in the video.

*/