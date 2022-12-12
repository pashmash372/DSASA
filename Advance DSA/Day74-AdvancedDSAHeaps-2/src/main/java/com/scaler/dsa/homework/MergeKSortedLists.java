package com.scaler.dsa.homework;


import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MergeKSortedLists {

    public ListNode mergeKLists(ArrayList<ListNode> A) {

        TreeMap<Integer, ArrayList<ListNode>> map = new TreeMap<>();
        ListNode node;
        ArrayList<ListNode> list;
        int val;

        for (ListNode head : A) {
            node = head;
            while (node != null) {
                val = node.val;

                if (map.containsKey(val)) {
                    list = map.get(val);
                    list.add(node);
                } else {
                    list = new ArrayList<>();
                    list.add(node);
                    map.put(val, list);
                }

                node = node.next;
            }
        }

        ListNode head = null;
        node = null;

        for (Map.Entry<Integer, ArrayList<ListNode>> entry : map.entrySet()) {

            list = entry.getValue();

            for (ListNode n : list) {
                if (head == null) head = n;
                if (node != null) node.next = n;
                node = n;
            }

        }

        return head;
    }
}

/*Q4. Merge K Sorted Lists
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a list containing head pointers of N sorted linked lists.
Merge these given sorted linked lists and return them as one sorted list.



Problem Constraints
1 <= total number of elements in given linked lists <= 100000



Input Format
The first and only argument is a list containing N head pointers.



Output Format
Return a pointer to the head of the sorted linked list after merging all the given linked lists.



Example Input
Input 1:

 1 -> 10 -> 20
 4 -> 11 -> 13
 3 -> 8 -> 9
Input 2:

 10 -> 12
 13
 5 -> 6


Example Output
Output 1:

 1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20
Output 2:

 5 -> 6 -> 10 -> 12 ->13


Example Explanation
Explanation 1:

 The resulting sorted Linked List formed after merging is 1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20.
Explanation 2:

 The resulting sorted Linked List formed after merging is 5 -> 6 -> 10 -> 12 ->13.

*/

/*There are two approaches to solving the problem.

Approach 1: Using heap.
You need the minimum of the head of all the K linked lists at every instant.
Once you know the minimum, you can push the node to your answer list and move it over to the next node in that linked list.

Approach 2: Divide and conquer.
Solve the problem for the first k/2 and last k/2 list. Then you have two sorted lists. Then merge the lists.
Analyze the time complexity.

T(N) = 2 T(N/2) + N
T(N) = O (N log N)*/