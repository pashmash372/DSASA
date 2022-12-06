package com.scaler.dsa.assignment;

import java.util.LinkedList;
import java.util.Queue;

public class NextPointerBinaryTree {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        Queue<TreeLinkNode> q = new LinkedList<>();
        q.offer(root);

        while (q.size() > 0) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeLinkNode front = q.poll();
                if (i == n - 1) front.next = null;
                else front.next = q.peek();
                if (front.left != null) q.offer(front.left);
                if (front.right != null) q.offer(front.right);
            }
        }
    }

    class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

}

/*Q3. Next Pointer Binary Tree
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree,

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Assume perfect binary tree and try to solve this in constant extra space.



Problem Constraints
1 <= Number of nodes in binary tree <= 100000

0 <= node values <= 10^9



Input Format
First and only argument is head of the binary tree A.



Output Format
Return the head of the binary tree after the changes are made.



Example Input
Input 1:


     1
    /  \
   2    3
Input 2:


        1
       /  \
      2    5
     / \  / \
    3  4  6  7


Example Output
Output 1:


        1 -> NULL
       /  \
      2 -> 3 -> NULL
Output 2:


         1 -> NULL
       /  \
      2 -> 5 -> NULL
     / \  / \
    3->4->6->7 -> NULL


Example Explanation
Explanation 1:

Next pointers are set as given in the output.
Explanation 2:

Next pointers are set as given in the output.

*/

/*Breadth first approach to exploring a tree is based on the concept of the level of a node.
The level of a node is its depth or distance from the root node.
We process all the nodes on one level before moving on to the next one.
We need to link all the nodes together which lie on the same level and the
level order or the breadth first traversal gives us access to all such nodes.

*/