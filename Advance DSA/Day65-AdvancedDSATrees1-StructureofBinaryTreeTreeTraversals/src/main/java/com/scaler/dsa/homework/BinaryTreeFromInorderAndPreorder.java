package com.scaler.dsa.homework;

import com.scaler.dsa.TreeNode;

import java.util.ArrayList;

public class BinaryTreeFromInorderAndPreorder {

    ArrayList<Integer> preorder, inorder;

    public TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {
        if (preorder == null || inorder == null || preorder.size() == 0 || inorder.size() == 0) return null;
        if (preorder.size() != inorder.size()) return null;
        this.preorder = preorder;
        this.inorder = inorder;
        return rec(0, preorder.size() - 1, 0);
    }

    private TreeNode rec(int start, int end, int index) {
        if (start > end) return null;
        TreeNode root = new TreeNode(preorder.get(index));
        int i = start;
        for (; i <= end; i++) {
            if (inorder.get(i).intValue() == root.val) {
                break;
            }
        }
        root.left = rec(start, i - 1, index + 1);
        root.right = rec(i + 1, end, index + i - start + 1);
        return root;
    }
}


/*Q1. Binary Tree From Inorder And Preorder
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given preorder and inorder traversal of a tree, construct the binary tree.

NOTE: You may assume that duplicates do not exist in the tree.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First argument is an integer array A denoting the preorder traversal of the tree.

Second argument is an integer array B denoting the inorder traversal of the tree.



Output Format
Return the root node of the binary tree.



Example Input
Input 1:

 A = [1, 2, 3]
 B = [2, 1, 3]
Input 2:

 A = [1, 6, 2, 3]
 B = [6, 1, 3, 2]


Example Output
Output 1:

   1
  / \
 2   3
Output 2:

   1
  / \
 6   2
    /
   3


Example Explanation
Explanation 1:

 Create the binary tree and return the root node of the tree.

*/

/*Focus on the preorder traversal to begin with.
The first element in the traversal will definitely be the root.
Based on this information, can you identify the elements in the left subtree
and right subtree ? ( Hint : Focus on inorder traversal and root information )

Once you do that, your problem has now been reduced to a smaller set. Now you
have the inorder and preorder traversal for the left and right subtree and you
need to figure them out.
Divide and conquer.

Bonus points if you can do it without recursion.
*/