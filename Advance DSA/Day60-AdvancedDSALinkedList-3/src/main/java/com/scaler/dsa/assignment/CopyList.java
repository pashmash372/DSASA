package com.scaler.dsa.assignment;

import com.scaler.dsa.common.RandomListNode;

import java.util.HashMap;
import java.util.Map;

public class CopyList {
    private HashMap<RandomListNode, RandomListNode> hashMap;

    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode node, newHead, newNode;
        hashMap = new HashMap<>();
        node = head;
        newHead = null;
        while (node != null) {
            newNode = new RandomListNode(node.label);
            if (newHead == null) newHead = newNode;
            hashMap.put(node, newNode);
            node = node.next;
        }
        for (Map.Entry<RandomListNode, RandomListNode> entry : hashMap.entrySet()) {
            node = entry.getKey();
            newNode = entry.getValue();
            if (node.next != null) newNode.next = hashMap.get(node.next);
            if (node.random != null) newNode.random = hashMap.get(node.random);
        }
        return newHead;
    }
}


/*Q1. Copy List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
A linked list A is given such that each node contains an additional random pointer which could point to any node in the list or NULL.

Return a deep copy of the list.



Problem Constraints
0 <= |A| <= 106



Input Format
The first argument of input contains a pointer to the head of linked list A.



Output Format
Return a pointer to the head of the required linked list.



Example Input
Given list
   1 -> 2 -> 3
with random pointers going from
  1 -> 3
  2 -> 1
  3 -> 1



Example Output
   1 -> 2 -> 3
with random pointers going from
  1 -> 3
  2 -> 1
  3 -> 1



Example Explanation
You should return a deep copy of the list. The returned answer should not contain the same node as the original list, but a copy of them. The pointers in the returned list should not link to any node in the original input list.

*/

/*There are 2 approaches to solving this problem.

Approach 1: Using hashmap.
Use a hashmap to store the mapping from oldListNode to the newListNode. Whenever you encounter a new node in the oldListNode (either via a random pointer or through the next pointer ), create the newListNode, store the mapping. And update the next and random pointers of the newListNode using the mapping from the hashmap.

Approach 2 : Using 2 traversals of the list.
Step 1: create a new node for each existing node and join them together eg: A->B->C will be A->A’->B->B’->C->C’

Step2: copy the random links: for each new node n’, n’.random = n.random.next

Step3: detach the list: basically n.next = n.next.next; n’.next = n’.next.next

*/