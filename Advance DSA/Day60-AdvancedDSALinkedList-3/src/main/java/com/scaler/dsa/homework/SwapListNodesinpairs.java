package com.scaler.dsa.homework;

import com.scaler.dsa.common.classes.ListNode;

public class SwapListNodesinpairs {
    public ListNode swapPairs(ListNode A) {
        if (A == null) return null;
        A = rec(A);
        return A;
    }

    public ListNode rec(ListNode node) {
        ListNode nextNode;
        ListNode firstNode = node;
        ListNode prevNode = null;
        if (node.next != null) firstNode = node.next;
        while (!(node == null || node.next == null)) {
            //swap the two adjacent nodes
            nextNode = node.next;
            node.next = nextNode.next;
            nextNode.next = node;
            if (prevNode != null) prevNode.next = nextNode;
            prevNode = node;
            node = node.next;
        }
        return firstNode;
    }
}


/*Q4. Swap List Nodes in pairs
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a linked list A, swap every two adjacent nodes and return its head.

NOTE: Your algorithm should use only constant space. You may not modify the values in the list; only nodes themselves can be changed.



Problem Constraints
1 <= |A| <= 106



Input Format
The first and the only argument of input contains a pointer to the head of the given linked list.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = 1 -> 2 -> 3 -> 4
Input 2:

 A = 7 -> 2 -> 1


Example Output
Output 1:

 2 -> 1 -> 4 -> 3
Output 2:

 2 -> 7 -> 1


Example Explanation
Explanation 1:

 In the first example (1, 2) and (3, 4) are the adjacent nodes. Swapping them will result in 2 -> 1 -> 4 -> 3
Explanation 2:

 In the second example, 3rd element i.e. 1 does not have an adjacent node, so it won't be swapped.
*/

/*Let’s first look at the problem of swapping 2 nodes.

Method 1: Just swap the values in the 2 nodes. In most cases, this won’t be a permissible solution.
Method 2: Move around the pointers.

*/