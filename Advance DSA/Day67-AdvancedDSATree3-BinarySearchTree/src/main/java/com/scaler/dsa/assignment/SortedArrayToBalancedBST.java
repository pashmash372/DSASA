package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;

public class SortedArrayToBalancedBST {
    public TreeNode sortedArrayToBST(final int[] A) {
        return helper(A, 0, A.length - 1);
    }

    private TreeNode helper(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        if (l == r) {
            return new TreeNode(nums[l]);
        }
        TreeNode node = new TreeNode(nums[(l + r) / 2]);
        node.left = helper(nums, l, (l + r) / 2 - 1);
        node.right = helper(nums, (l + r) / 2 + 1, r);
        return node;
    }
}

/*Q3. Sorted Array To Balanced BST
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array where elements are sorted in ascending order, convert it to a height Balanced Binary Search Tree (BBST).

Balanced tree : a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.



Problem Constraints
1 <= length of array <= 100000



Input Format
First argument is an integer array A.



Output Format
Return a root node of the Binary Search Tree.



Example Input
Input 1:

 A : [1, 2, 3]
Input 2:

 A : [1, 2, 3, 5, 10]


Example Output
Output 1:

      2
    /   \
   1     3
Output 2:

      3
    /   \
   2     5
  /       \
 1         10


Example Explanation
Explanation 1:

 You need to return the root node of the Binary Tree.
*/

/*For a BST, all values lower than the root go in the left part of the root, and all values higher go in the right part of the root.
To balance the tree, we will need to make sure we distribute the elements almost equally in the left and right parts.
So we choose the mid part of the array as the root and divide the elements around it.

Things to take care of :
1) Are you passing a copy of the array around, or are you only passing around a reference?
2) Are you dividing the array before passing it onto the next function call or are you just specifying the start and end index?*/