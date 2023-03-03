package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;

public class KthSmallestElementInBST {
    static int k = 0;

    public static int find(TreeNode root) {
        if (root == null) return -1;
        /* We do an inorder traversal here. */
        int k1 = find(root.left);
        if (k == 0) return k1; /* left subtree has k or more elements. */
        k--;
        if (k == 0) return root.val; /* root is the kth element */
        return find(root.right); /* answer lies in the right node*/
    }

    public int kthsmallest(TreeNode A, int B) {
        k = B;
        return find(A);
    }
}

/*Java sol | TC O(N) | SC O(H)*/

class KthSmallestElementInBST1 {
    int ans = 0, count = 0;

    public int kthsmallest(TreeNode A, int B) {
        inorder(A, B);
        return ans;
    }

    public void inorder(TreeNode A, int B) {
        if (A == null) return;
        inorder(A.left, B);
        count++;
        if (count == B) {
            ans = A.val;
            return;
        }
        inorder(A.right, B);
    }
}

/*Q4. Kth Smallest Element In BST
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary search tree represented by root A, write a function to find the Bth smallest element in the tree.



Problem Constraints
1 <= Number of nodes in binary tree <= 100000

0 <= node values <= 10^9



Input Format
First and only argument is head of the binary tree A.



Output Format
Return an integer, representing the Bth element.



Example Input
Input 1:


            2
          /   \
         1    3
B = 2
Input 2:


            3
           /
          2
         /
        1
B = 1



Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

2nd element is 2.
Explanation 2:

1st element is 1.
*/

/*Note the property of the binary search tree.
All elements smaller than root will be in the left subtree, and all elements greater than root will be in the right subtree.
This means we need not even explore the right subtree till we have explored everything in the left subtree. Or in other words, we go to the right subtree only when the size of left subtree + 1 ( root ) < k.

With that in mind, we can come up with an easy recursive solution which is similar to inorder traversal :

Step 1: Find the kth smallest element in left subtree decrementing k for every node visited. If answer is found, return answer.
Step 2: Decrement k by 1. If k == 0 ( this node is the kth node visited ), return node’s value
Step 3: Find the kth smallest element in right subtree.

*/