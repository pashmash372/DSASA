package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;


public class LargestBSTSubtree {
    public int solve(TreeNode A) {
        return largestBST(A);
    }

    int largestBST(TreeNode node) {
        Value val = new Value();
        largestBSTUtil(node, val, val, val, val);

        return val.max_size;
    }

    /* largestBSTUtil() updates *max_size_ref for the size of the largest BST
     subtree.   Also, if the tree rooted with node is non-empty and a BST,
     then returns size of the tree. Otherwise returns 0.*/
    int largestBSTUtil(TreeNode node, Value min_ref, Value max_ref, Value max_size_ref, Value is_bst_ref) {

        /* Base Case */
        if (node == null) {
            is_bst_ref.is_bst = true; // An empty tree is BST
            return 0; // Size of the BST is 0
        }

        int min = Integer.MAX_VALUE;

        /* A flag variable for left subtree property
         i.e., max(root->left) < root->data */
        boolean left_flag = false;

        /* A flag variable for right subtree property
         i.e., min(root->right) > root->data */
        boolean right_flag = false;

        int ls, rs; // To store sizes of left and right subtrees

        /* Following tasks are done by recursive call for left subtree
         a) Get the maximum value in left subtree (Stored in *max_ref)
         b) Check whether Left Subtree is BST or not (Stored in *is_bst_ref)
         c) Get the size of maximum size BST in left subtree (updates *max_size) */
        max_ref.max = Integer.MIN_VALUE;
        ls = largestBSTUtil(node.left, min_ref, max_ref, max_size_ref, is_bst_ref);
        if (is_bst_ref.is_bst && node.val > max_ref.max) {
            left_flag = true;
        }

        /* Before updating *min_ref, store the min value in left subtree. So that we
         have the correct minimum value for this subtree */
        min = min_ref.min;

        /* The following recursive call does similar (similar to left subtree)
         task for right subtree */
        min_ref.min = Integer.MAX_VALUE;
        rs = largestBSTUtil(node.right, min_ref, max_ref, max_size_ref, is_bst_ref);
        if (is_bst_ref.is_bst && node.val < min_ref.min) {
            right_flag = true;
        }

        // Update min and max values for the parent recursive calls
        if (min < min_ref.min) {
            min_ref.min = min;
        }
        if (node.val < min_ref.min) // For leaf nodes
        {
            min_ref.min = node.val;
        }
        if (node.val > max_ref.max) {
            max_ref.max = node.val;
        }

        /* If both left and right subtrees are BST. And left and right
         subtree properties hold for this node, then this tree is BST.
         So return the size of this tree */
        if (left_flag && right_flag) {
            if (ls + rs + 1 > max_size_ref.max_size) {
                max_size_ref.max_size = ls + rs + 1;
            }
            return ls + rs + 1;
        } else {
            //Since this subtree is not BST, set is_bst flag for parent calls
            is_bst_ref.is_bst = false;
            return 0;
        }
    }
}

class Value {

    int max_size = 0; // for size of largest BST
    boolean is_bst = false;
    int min = Integer.MAX_VALUE; // For minimum value in right subtree
    int max = Integer.MIN_VALUE; // For maximum value in left subtree

}

/*Java simple solution | TC - O(N) | SC - O(N)*/

class LargestBSTSubtree1 {
    public int solve(TreeNode A) {
        Pair pair = this.process(A);
        return pair.size;
    }

    public Pair process(TreeNode node) {
        if (node == null) {
            return new Pair(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        boolean valid = true;
        Pair left = process(node.left);
        Pair right = process(node.right);

        if ((left.valid) && (right.valid)) {
            if ((node.val <= left.max) || (node.val >= right.min)) {
                valid = false;
            }
        } else {
            valid = false;
        }

        int min = Math.min(node.val, Math.min(left.min, right.min));
        int max = Math.max(node.val, Math.max(left.max, right.max));

        if (valid) {
            return new Pair(valid, left.size + right.size + 1, min, max);
        }
        return new Pair(valid, java.lang.Math.max(left.size, right.size), min, max);
    }

    class Pair {
        boolean valid;
        int min;
        int max;
        int size;

        Pair(boolean valid, int size, int min, int max) {
            this.valid = valid;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
}



/*Q2. Largest BST Subtree
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a Binary Tree A with N nodes.

Write a function that returns the size of the largest subtree, which is also a Binary Search Tree (BST).

If the complete Binary Tree is BST, then return the size of the whole tree.

NOTE:

The largest subtree is the subtree with the most number of nodes.


Problem Constraints
1 <= N <= 105



Input Format
First and only argument is an pointer to root of the binary tree A.



Output Format
Return an single integer denoting the size of the largest subtree which is also a BST.



Example Input
Input 1:

     10
    / \
   5  15
  / \   \
 1   8   7
Input 2:

     5
    / \
   3   8
  / \ / \
 1  4 7  9


Example Output
Output 1:

 3
Output 2:

 7


Example Explanation
Explanation 1:

 Largest BST subtree is
                            5
                           / \
                          1   8
Explanation 2:

 Given binary tree itself is BST.
*/


/*Maintain a data structure that stores for every node the maximum value in the subtree of a node, the minimum value in the subtree of a node,
size of the subtree, size of the largest BST found in the subtree of a node, and flag to denote whether this subtree is bst or not.

Traverse the tree in a bottom-up manner.

A Tree is BST if the following is true for every node X.

The largest value in the left subtree (of X) is smaller than the value of X.
The smallest value in the right subtree (of X) is greater than the value of X.
update the details of these nodes accordingly.*/