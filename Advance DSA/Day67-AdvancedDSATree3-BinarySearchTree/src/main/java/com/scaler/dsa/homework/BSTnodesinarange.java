package com.scaler.dsa.homework;

import com.scaler.dsa.common.TreeNode;

public class BSTnodesinarange {
    static int ans = 0;

    public static void traverse(TreeNode a, int B, int C) {
        if (a == null) return;
        if (a.val >= B && a.val <= C) ans++;
        traverse(a.left, B, C);
        traverse(a.right, B, C);
    }

    public int solve(TreeNode A, int B, int C) {
        ans = 0;
        traverse(A, B, C);
        return ans;
    }
}

/*Q2. BST nodes in a range
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary search tree of integers. You are given a range B and C.

Return the count of the number of nodes that lie in the given range.



Problem Constraints
1 <= Number of nodes in binary tree <= 100000

0 <= B < = C <= 109



Input Format
First argument is a root node of the binary tree, A.

Second argument is an integer B.

Third argument is an integer C.



Output Format
Return the count of the number of nodes that lies in the given range.



Example Input
Input 1:

            15
          /    \
        12      20
        / \    /  \
       10  14  16  27
      /
     8

     B = 12
     C = 20
Input 2:

            8
           / \
          6  21
         / \
        1   7

     B = 2
     C = 20


Example Output
Output 1:

 5
Output 2:

 3


Example Explanation
Explanation 1:

 Nodes which are in range [12, 20] are : [12, 14, 15, 20, 16]
Explanation 2:

 Nodes which are in range [2, 20] are : [8, 6, 7]
*/


/*The idea is to traverse the given binary search tree starting from the root.
For every node being visited, check if this node lies in range,
if yes, then add 1 to the result and recur for both of its children.
If the current node is smaller than the low value of the range, then recur for the right child; else recur for the left child.

*/