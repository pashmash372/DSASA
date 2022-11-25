package com.scaler.dsa.assignment;

import com.scaler.dsa.common.classes.ListNode;

public class ReorderList {
    public ListNode reorderList(ListNode head) {
        int sz = 0;
        ListNode tmp = head;
        while (tmp != null) {
            sz++;
            tmp = tmp.next;
        }
        if (head == null || head.next == null || head.next.next == null) return head;
        //find the middle of the list, and split into two lists.
        ListNode slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        //reverse from the middle to the end
        ListNode secondHalfReversed = reverseLinkedList(mid);
        //merge these two list
        return head = mergeTwoLists(head, secondHalfReversed);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = l1; // head of the list to return
        l1 = l1.next;
        ListNode p = head; // pointer to form new list
        // A boolean to track which list we need to extract from.
        // We alternate between first and second list.
        boolean curListNum = true;
        while (l1 != null && l2 != null) {
            if (!curListNum) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
            curListNum = !curListNum;
        }
        // add the rest of the tail, done!
        if (l1 != null) {
            p.next = l1;
        } else {
            p.next = l2;
        }
        return head;
    }

    ListNode reverseLinkedList(ListNode head) {
        if (head.next == null) return head;
        ListNode cur = head, nextNode = head.next, tmp;
        while (nextNode != null) {
            tmp = nextNode.next;
            nextNode.next = cur;
            cur = nextNode;
            nextNode = tmp;
        }
        head.next = nextNode;
        return cur;
    }
}

/*Q3. Reorder List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a singly linked list A

 A: A0 → A1 → … → An-1 → An
reorder it to:

 A0 → An → A1 → An-1 → A2 → An-2 → …
You must do this in-place without altering the nodes' values.



Problem Constraints
1 <= |A| <= 106



Input Format
The first and the only argument of input contains a pointer to the head of the linked list A.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [1, 2, 3, 4]


Example Output
Output 1:

 [1, 5, 2, 4, 3]
Output 2:

 [1, 4, 2, 3]


Example Explanation
Explanation 1:

 The array will be arranged to [A0, An, A1, An-1, A2].
Explanation 2:

 The array will be arranged to [A0, An, A1, An-1, A2].
*/


/*We can try to break down the solution approach into majorly three parts.

Firstly, we try to break the list from the middle into two separate linked lists.
Now, we reverse the latter half of the linked list.
Finally, we would merge the lists so that the nodes alternate to get the required answer.

*/