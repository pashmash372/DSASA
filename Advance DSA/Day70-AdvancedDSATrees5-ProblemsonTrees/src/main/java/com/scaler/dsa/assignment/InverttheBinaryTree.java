package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;

public class InverttheBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}

/*Q1. Invert the Binary Tree
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree A, invert the binary tree and return it.

Inverting refers to making the left child the right child and vice versa.



Problem Constraints
1 <= size of tree <= 100000



Input Format
First and only argument is the head of the tree A.



Output Format
Return the head of the inverted tree.



Example Input
Input 1:


     1
   /   \
  2     3
Input 2:


     1
   /   \
  2     3
 / \   / \
4   5 6   7


Example Output
Output 1:


     1
   /   \
  3     2
Output 2:


     1
   /   \
  3     2
 / \   / \
7   6 5   4


Example Explanation
Explanation 1:

Tree has been inverted.
Explanation 2:

Tree has been inverted.
*/

/*Think recursively.
You need to invert the left and right subtree on every node and then swap them.*/