package com.scaler.dsa.assignment;


import java.util.ArrayList;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


public class InorderTraversal {
    // Threaded binary tree Morris traversal
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        TreeNode current, node;
        ArrayList<Integer> res = new ArrayList<>();
        current = A;
        while (current != null) {
            if (current.left == null) {
                res.add(current.val);
                current = current.right;
            } else {
                node = current.left;
                while (node.right != null && !current.equals(node.right)) node = node.right;

                if (node.right == null) {
                    node.right = current;
                    current = current.left;
                } else {
                    current = node.right;
                    node.right = null;
                    res.add(current.val);
                    current = current.right;
                }
            }
        }
        return res;
    }
}

/*Q1. Inorder Traversal
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree, return the inorder traversal of its nodes' values.

NOTE: Using recursion is not allowed.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return an integer array denoting the inorder traversal of the given binary tree.



Example Input
Input 1:

   1
    \
     2
    /
   3
Input 2:

   1
  / \
 6   2
    /
   3


Example Output
Output 1:

 [1, 3, 2]
Output 2:

 [6, 1, 3, 2]


Example Explanation
Explanation 1:

 The Inorder Traversal of the given tree is [1, 3, 2].
Explanation 2:

 The Inorder Traversal of the given tree is [6, 1, 3, 2].
*/

/*Think stack.

Recursive call would look something like this :

inorderprint(root->left);
print(root->val);
inorderprint(root->right);

Instead of calling the functions, can you put the nodes on a stack and process them?

How would your solution work if you could change the original tree?
How would it work if you were not allowed to change the tree but use additional memory ( track the number of times a node has appeared in the tree )?
How would it work if you were not even allowed the extra memory?*/