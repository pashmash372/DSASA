package com.scaler.dsa.homework;

public class CloneaLinkedList {
    ListNode cloneList(ListNode A) {
        ListNode curr = A;
        ListNode temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = new ListNode(curr.val);
            curr.next.next = temp;
            curr = temp;
        }
        curr = A;
        while (curr != null) {
            if (curr.next != null) {
                curr.next.random = (curr.random != null) ? curr.random.next : curr.random;
            }
            curr = (curr.next != null) ? curr.next.next : curr.next;
        }
        ListNode original = A;
        ListNode copyy = A.next;
        temp = copyy;
        while (original != null && copyy != null) {
            original.next = (original.next != null) ? original.next.next : original.next;
            copyy.next = (copyy.next != null) ? copyy.next.next : copyy.next;
            original = original.next;
            copyy = copyy.next;
        }
        return temp;
    }

    class ListNode {
        int val;
        ListNode next, random;

        ListNode(int x) {
            val = x;
            next = random = null;
        }
    }
}


/*Q5. Clone a Linked List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a doubly linked list of integers with one pointer of each node pointing to the next node (just like in a single link list) while the second pointer, however, can point to any node in the list and not just the previous node.

You have to create a copy of this list and return the head pointer of the duplicated list.



Problem Constraints
1 <= length of the list <= 100000

1 <= Value of node <= 100000



Input Format
The only argument given is head pointer of the doubly linked list.



Output Format
Return the head pointer of the duplicated list.



Example Input
Input 1:

1 -> 2 -> 3 -> 4 -> 5
random pointer of each node
1 -> 5 2 -> 4 3 -> 3 4 -> 2 5 -> 1
Input 2:

1 -> 2 -> 3 -> 4 -> 5
random pointer of each node
1 -> 5 2 -> 4 3 -> 3 4 -> 2 5 -> 1


Example Output
Output 1:

1 -> 2 -> 3 -> 4 -> 5
random pointer of each node
1 -> 5 2 -> 4 3 -> 3 4 -> 2 5 -> 1
Output 2:

1 -> 2 -> 3 -> 4 -> 5
random pointer of each node
1 -> 5 2 -> 4 3 -> 3 4 -> 2 5 -> 1


Example Explanation
Explanation 1:

 Just clone the given list.
Explanation 2:

 Just clone the given list*/


/*1.Create all nodes in copy linked list using next pointers.

2.Store the node and its next pointer mappings of original linked list.

3.Change next pointer of all nodes in original linked list to point to the corresponding node in copy linked list.*/