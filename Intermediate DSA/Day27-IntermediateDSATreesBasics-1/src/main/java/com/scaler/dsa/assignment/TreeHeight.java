package com.scaler.dsa.assignment;


/**
 * Definition for binary tree
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) {
 * val = x;
 * left=null;
 * right=null;
 * }
 * }
 */
public class TreeHeight {
    public int solve(TreeNode A) {
        if (A == null) return 0;
        return 1 + Math.max(solve(A.left), solve(A.right));
    }
}

/*Q4. Tree Height
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given the root node of a binary tree A. You have to find the height of the given tree.

A binary tree's height is the number of nodes along the longest path from the root node down to the farthest leaf node.



Problem Constraints
1 <= Number of nodes in the tree <= 105

0 <= Value of each node <= 109



Input Format
The first and only argument is a tree node A.



Output Format
Return an integer denoting the height of the tree.



Example Input
Input 1:

 Values =  1
          / \
         4   3
Input 2:


 Values =  1
          / \
         4   3
        /
       2


Example Output
Output 1:

 2
Output 2:

 3


Example Explanation
Explanation 1:

 Distance of node having value 1 from root node = 1
 Distance of node having value 4 from root node = 2 (max)
 Distance of node having value 3 from root node = 2 (max)
Explanation 2:

 Distance of node having value 1 from root node = 1
 Distance of node having value 4 from root node = 2
 Distance of node having value 3 from root node = 2
 Distance of node having value 2 from root node = 3 (max)*/


/*If the root node is Null, we can say the height is 0.
Else the tree's height will be 1 + (maximum out of left child's subtree height and right child's subtree height).*/