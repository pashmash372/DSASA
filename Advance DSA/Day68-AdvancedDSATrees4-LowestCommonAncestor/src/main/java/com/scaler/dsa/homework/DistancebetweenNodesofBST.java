package com.scaler.dsa.homework;

import com.scaler.dsa.common.TreeNode;

public class DistancebetweenNodesofBST {
    public static int distanceFromRoot(TreeNode root, int x) {
        if (root.val == x) return 0;
        else if (root.val > x) return 1 + distanceFromRoot(root.left, x);
        return 1 + distanceFromRoot(root.right, x);
    }

    public static int distanceBetween2(TreeNode root, int a, int b) {
        if (root == null) return 0;
        if (root.val > a && root.val > b) return distanceBetween2(root.left, a, b);
        if (root.val < a && root.val < b) return distanceBetween2(root.right, a, b);
        if (root.val >= a && root.val <= b) return distanceFromRoot(root, a) + distanceFromRoot(root, b);
        return 0;
    }

    public int solve(TreeNode root, int a, int b) {
        int temp = 0;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        return distanceBetween2(root, a, b);
    }
}

/*Q2. Distance between Nodes of BST
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary search tree.
Return the distance between two nodes with given two keys B and C. It may be assumed that both keys exist in BST.

NOTE: Distance between two nodes is number of edges between them.



Problem Constraints
1 <= Number of nodes in binary tree <= 1000000

0 <= node values <= 109



Input Format
First argument is a root node of the binary tree, A.

Second argument is an integer B.

Third argument is an integer C.



Output Format
Return an integer denoting the distance between two nodes with given two keys B and C



Example Input
Input 1:


         5
       /   \
      2     8
     / \   / \
    1   4 6   11
 B = 2
 C = 11
Input 2:


         6
       /   \
      2     9
     / \   / \
    1   4 7   10
 B = 2
 C = 6


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

 Path between 2 and 11 is: 2 -> 5 -> 8 -> 11. Distance will be 3.
Explanation 2:

 Path between 2 and 6 is: 2 -> 6. Distance will be 1
*/

/*An efficient way to solve the above problem:

We start from the root and for every node, we do following.

If both keys are greater than the current node, we move to the right child of the current node.
If both keys are smaller than current node, we move to left child of current node.
If one keys is smaller and other key is greater, current node is Lowest Common Ancestor (LCA) of two nodes. We find distances of current node from two keys and return sum of the distances.

Time Complexity : O(h) (height of Tree)*/