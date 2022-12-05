package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;

public class ValidBinarySearchTree {
    public static boolean isValid(TreeNode A, Long l, Long r) {
        if (A == null) return true;
        if (A.val > l && A.val < r) {
            boolean left = isValid(A.left, l, (long) A.val);
            boolean right = isValid(A.right, (long) A.val, r);
            return (left && right);
        } else return false;
    }

    public int isValidBST(TreeNode A) {
        if (isValid(A, Long.MIN_VALUE, Long.MAX_VALUE)) return 1;
        return 0;
    }
}

/*Q1. Valid Binary Search Tree
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a binary tree represented by root A.

Assume a BST is defined as follows:

1) The left subtree of a node contains only nodes with keys less than the node's key.

2) The right subtree of a node contains only nodes with keys greater than the node's key.

3) Both the left and right subtrees must also be binary search trees.



Problem Constraints
1 <= Number of nodes in binary tree <= 105

0 <= node values <= 232-1



Input Format
First and only argument is head of the binary tree A.



Output Format
Return 0 if false and 1 if true.



Example Input
Input 1:


   1
  /  \
 2    3
Input 2:


  2
 / \
1   3


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 2 is not less than 1 but is in left subtree of 1.
Explanation 2:

Satisfies all conditions.*/


/*As mentioned in the hints, we can check two conditions for a valid Binary Search Tree.

At each node, the left subtree is also a Binary Search Tree, and the max value in the left subtree is smaller than the node.
At each node, the right subtree is also a Binary Search Tree, and the min value in the right subtree is greater than the node.
The trick is when we traverse down the tree, maintain max and min allowed values for the subtree, and check that the node’s value should lie between the allowed max and min. The initial values for min and max should be INT_MIN and INT_MAX.

If at the current node, allowed min is minn and allowed max is maxx.

If we move to the left, then the max value in the left subtree should be smaller than the node. So, update maxx = min(maxx, value of node).
Similarly, If we move to the right, the min value in the right subtree should be greater than the node.So, update minn = max(minn, value of node).

In this, we are traversing each node only once. So, the time complexity is O(n).

*/