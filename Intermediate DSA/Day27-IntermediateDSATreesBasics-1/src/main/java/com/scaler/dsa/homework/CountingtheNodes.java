package com.scaler.dsa.homework;



/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class CountingtheNodes {
    int dfs(TreeNode cur, int mx){
        if(cur == null){
            return 0;
        }
        int ans = dfs(cur.left, Math.max(mx, cur.val)) + dfs(cur.right, Math.max(mx, cur.val));
        if(cur.val > mx){
            ++ans;
        }
        return ans;
    }
    public int solve(TreeNode A) {
        return dfs(A, 0);
    }
}

/*Q2. Counting the Nodes
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given the root of a tree A with each node having a certain value, find the count of nodes with more value than all its ancestor.



Problem Constraints
1 <= Number of Nodes <= 200000

1 <= Value of Nodes <= 2000000000



Input Format
The first and only argument of input is a tree node.



Output Format
Return a single integer denoting the count of nodes that have more value than all of its ancestors.



Example Input
Input 1:


     3
Input 2:


    4
   / \
  5   2
     / \
    3   6


Example Output
Output 1:

 1
Output 2:

 3


Example Explanation
Explanation 1:

 There's only one node in the tree that is the valid node.
Explanation 2:

 The valid nodes are 4, 5 and 6.*/


/*Run a DFS and keep track of the maximum so far.

When arriving at a node, first find the answer for the left sub-tree, if it exists; then find the answer for the right sub-tree; Our current answer is the sum of both ans. But if the current node value is greater than max so far, we increment the answer.

Note that since we keep track of max from above, it covers all nodes. Please look into complete solution for implementation.*/