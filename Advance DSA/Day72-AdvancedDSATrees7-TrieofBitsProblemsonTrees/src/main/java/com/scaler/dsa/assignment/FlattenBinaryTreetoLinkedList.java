package com.scaler.dsa.assignment;


public class FlattenBinaryTreetoLinkedList {
    TreeNode head = null;

    public TreeNode flatten(TreeNode a) {
        if (a == null) return null;
        flatten(a.right);
        flatten(a.left);

        a.right = head;
        a.left = null;
        head = a;
        return head;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class FlattenBinaryTreetoLinkedList1 {
    public TreeNode flatten(TreeNode A) {
        TreeNode node = A;
        while (node != null) {
            if (node.left != null) {
                TreeNode rtmost = node.left;
                while (rtmost.right != null) rtmost = rtmost.right;
                rtmost.right = node.right;
                node.right = node.left;
                node.left = null;
            }
            node = node.right;
        }
        return A;
    }
}

/*Q3. Flatten Binary Tree to Linked List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree A, flatten it to a linked list in-place.

The left child of all nodes should be NULL.



Problem Constraints
1 <= size of tree <= 100000



Input Format
First and only argument is the head of tree A.



Output Format
Return the linked-list after flattening.



Example Input
Input 1:

     1
    / \
   2   3
Input 2:

         1
        / \
       2   5
      / \   \
     3   4   6


Example Output
Output 1:

1
 \
  2
   \
    3
Output 2:

1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6


Example Explanation
Explanation 1:

 Tree flattening looks like this.
Explanation 2:

 Tree flattening looks like this.*/

/*If you notice carefully in the flattened tree, each node’s right child points to the next node of a pre-order traversal.

Now, if a node does not have a left node, then our problem reduces to solving it for the node->right.
If it does, then the next element in the preorder traversal is the immediate left child. But if we make the immediate left child the right child of the node, then the right subtree will be lost. So we figure out where the right subtree should go. In the preorder traversal, the right subtree comes right after the rightmost element in the left subtree.
So we figure out the rightmost element in the left subtree and attach the right subtree as its right child. We make the left child the right child now and move on to the next node.*/
