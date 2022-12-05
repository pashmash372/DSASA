package com.scaler.dsa.homework;

public class CheckforBSTwithOneChild {
    public String solve(int[] A) {
        int n = A.length;
        if (n <= 2) return "YES";
        int mn = Math.min(A[n - 1], A[n - 2]);
        int mx = Math.max(A[n - 1], A[n - 2]);

        for (int i = n - 3; i >= 0; i--) {
            /*Each node must be either smaller than the min node or larger than the max code*/
            if (A[i] > mn && A[i] < mx) return "NO";
            mn = Math.min(mn, A[i]);
            mx = Math.min(mx, A[i]);
        }
        return "YES";
    }
}


/*Q1. Check for BST with One Child
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given preorder traversal of a binary tree, check if it is possible that it is also a preorder traversal of a Binary Search Tree (BST), where each internal node (non-leaf nodes) have exactly one child.



Problem Constraints

1 <= number of nodes <= 100000



Input Format

First and only argument is an integer array denoting the preorder traversal of binary tree.



Output Format

Return a string "YES" if true else "NO".



Example Input

Input 1:

 A : [4, 10, 5, 8]
Input 2:

 A : [1, 5, 6, 4]


Example Output

Output 1:

 "YES"
Output 2:

 "NO"


Example Explanation

Explanation 1:

 The possible BST is:
            4
             \
             10
             /
             5
              \
              8
Explanation 2:

 There is no possible BST which have the above preorder traversal.*/


/*In Preorder traversal, descendants (or Preorder successors) of every node appear after the node.

We can say, if all internal nodes have only one child in a BST, then all the descendants of every node are either smaller or larger than the node.

To check the above condition:

Scan the last two nodes of preorder & mark them as min & max.

Scan every node down the preorder array. Each node must be either smaller than the min node or larger than the max node. Update min & max accordingly.

*/