package com.scaler.dsa.homework;

import com.scaler.dsa.common.TreeNode;

import java.util.Stack;

public class CommonNodesinTwoBST {
    public static long common(TreeNode root1, TreeNode root2) {
        int mod = 1000000007;
        long sum = 0;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();

        while (true) {
            // push the Nodes of first tree in stack s1
            if (root1 != null) {
                s1.push(root1);
                root1 = root1.left;
            }

            // push the Nodes of second tree in stack s2
            else if (root2 != null) {
                s2.push(root2);
                root2 = root2.left;
            }

            // Both root1 and root2 are NULL here
            else if (!s1.isEmpty() && !s2.isEmpty()) {
                root1 = s1.peek();
                root2 = s2.peek();

                // If current keys in two trees are same
                if (root1.val == root2.val) {
                    long temp = root1.val;
                    sum = ((sum % mod) + (temp % mod)) % mod;
                    s1.pop();
                    s2.pop();

                    // move to the inorder successor
                    root1 = root1.right;
                    root2 = root2.right;
                } else if (root1.val < root2.val) {
                    // If Node of first tree is smaller, than that of
                    // second tree, then its obvious that the inorder
                    // successors of current Node can have same value
                    // as that of the second tree Node. Thus, we pop
                    // from s2
                    s1.pop();
                    root1 = root1.right;

                    // root2 is set to NULL, because we need
                    // new Nodes of tree 1
                    root2 = null;
                } else if (root1.val > root2.val) {
                    s2.pop();
                    root2 = root2.right;
                    root1 = null;
                }
            }

            // Both roots and both stacks are empty
            else break;
        }
        return sum;
    }

    public int solve(TreeNode A, TreeNode B) {
        int temp = (int) common(A, B);
        return temp;
    }

}

/*Q1. Common Nodes in Two BST
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two BST's A and B, return the (sum of all common nodes in both A and B) % (109 +7) .

In case there is no common node, return 0.

NOTE:

Try to do it one pass through the trees.



Problem Constraints
1 <= Number of nodes in the tree A and B <= 105

1 <= Node values <= 106



Input Format
First argument represents the root of BST A.

Second argument represents the root of BST B.



Output Format
Return an integer denoting the (sum of all common nodes in both BST's A and B) % (109 +7) .



Example Input
Input 1:

 Tree A:
    5
   / \
  2   8
   \   \
    3   15
        /
        9

 Tree B:
    7
   / \
  1  10
   \   \
    2  15
       /
      11
Input 2:

  Tree A:
    7
   / \
  1   10
   \   \
    2   15
        /
       11

 Tree B:
    7
   / \
  1  10
   \   \
    2  15
       /
      11


Example Output
Output 1:

 17
Output 2:

 46


Example Explanation
Explanation 1:

 Common Nodes are : 2, 15
 So answer is 2 + 15 = 17
Explanation 2:

 Common Nodes are : 7, 2, 1, 10, 15, 11
 So answer is 7 + 2 + 1 + 10 + 15 + 11 = 46
*/

/*Method 1 (Linear Time) We can find common elements in O(n) time.

1) Do inorder traversal of first tree and store the traversal in an auxiliary array ar1[].
2) Do inorder traversal of second tree and store the traversal in an auxiliary array ar2[]
3) Find intersection of ar1[] and ar2[].

Time complexity of this method is O(m+n) where m and n are number of nodes in first and second tree respectively.
This solution requires O(m+n) extra space.

Method 2 (Linear Time and limited Extra Space) We can find common elements in O(n) time and O(h1 + h2) extra space where h1 and h2 are heights of first and second BSTs respectively.

The idea is to use iterative inorder traversal. We use two auxiliary stacks for two BSTs. Since we need to find common elements, whenever we get same element, we add it to the sum .

*/