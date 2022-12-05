package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;

import java.util.ArrayList;

public class BinaryTreeFromInorderAndPostorder {
    public TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) {
        if (inorder == null || postorder == null || inorder.size() == 0 || inorder.size() != postorder.size())
            return null;
        TreeNode root;
        int n = inorder.size();
        root = rec(inorder, postorder, 0, n - 1, n - 1);
        return root;
    }

    public TreeNode rec(ArrayList<Integer> inorder, ArrayList<Integer> postorder, int start, int end, int postIndex) {
        if (start > end) return null;
        TreeNode node;
        int nodeVal = postorder.get(postIndex);
        node = new TreeNode(nodeVal);
        int i;
        for (i = start; i <= end; i++) {
            if (inorder.get(i) == nodeVal) break;
        }
        node.left = rec(inorder, postorder, start, i - 1, postIndex - (end - i + 1));
        node.right = rec(inorder, postorder, i + 1, end, postIndex - 1);
        return node;

    }
}

/*Q2. Binary Tree From Inorder And Postorder
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given the inorder and postorder traversal of a tree, construct the binary tree.

NOTE: You may assume that duplicates do not exist in the tree.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First argument is an integer array A denoting the inorder traversal of the tree.

Second argument is an integer array B denoting the postorder traversal of the tree.



Output Format
Return the root node of the binary tree.



Example Input
Input 1:

 A = [2, 1, 3]
 B = [2, 3, 1]
Input 2:

 A = [6, 1, 3, 2]
 B = [6, 3, 2, 1]


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

/*Focus on the postorder traversal, to begin with.
The last element in the traversal will definitely be the root.
Based on this information, can you identify the left subtree and right subtree elements? ( Hint: Focus on inorder traversal and root information )

Once you do that, your problem has now been reduced to a smaller set. Now you have the inorder and postorder traversal for the left and right subtree, and you need to figure them out.
Divide and conquer.

Bonus points if you can do it without recursion.

*/