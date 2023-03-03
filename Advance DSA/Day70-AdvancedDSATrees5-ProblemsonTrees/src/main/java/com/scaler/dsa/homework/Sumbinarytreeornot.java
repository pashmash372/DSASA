package com.scaler.dsa.homework;


import com.scaler.dsa.common.TreeNode;

public class Sumbinarytreeornot {
    public static int isLeaf(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return 0;
    }

    public static int isSumTree(TreeNode node) {
        int ls, rs;
        if (node == null || isLeaf(node) == 1) return 1;

        if (isSumTree(node.left) == 1 && isSumTree(node.right) == 1) {
            if (node.left == null) ls = 0;
            else if (isLeaf(node.left) == 1) ls = node.left.val;
            else ls = 2 * (node.left.val);
            if (node.right == null) rs = 0;
            else if (isLeaf(node.right) == 1) rs = node.right.val;
            else rs = 2 * (node.right.val);
            if (node.val == ls + rs) return 1;
            else return 0;
        }
        return 0;
    }

    public static int checksumtree(TreeNode root) {
        if (isSumTree(root) == 1) return 1;
        return 0;
    }

    public int solve(TreeNode A) {
        return checksumtree(A);
    }
}

/*Easy Java solution with diagram*/

class Sumbinarytreeornot1 {
    int ans = 1;// considering my tree is sum tree

    public int solve(TreeNode root) {
        traverse(root);
        return ans;
    }

    public int traverse(TreeNode root) {
        if (root == null) return 0;
        //as I know all leaf nodes are considered as sum tree
        if (root.left == null && root.right == null) return root.val;
        int l = traverse(root.left);
        int r = traverse(root.right);
        //condition to check if tree is not sum tree
        if (root.val != (l + r)) ans = 0;
        return root.val + l + r;
    }
}
/*Post Order Approach*/

class Sumbinarytreeornot2 {
    boolean flag = true;

    public int solve(TreeNode A) {
        helper(A);
        if (flag) return 1;
        return 0;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;
        int leftSum = helper(root.left);
        int rightSum = helper(root.right);
        if (root.val != (leftSum + rightSum) && (root.left != null || root.right != null)) {
            flag = false;
        }
        return leftSum + rightSum + root.val;
    }
}
/*Q3. Sum binary tree or not
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree. Check whether the given tree is a Sum-binary Tree or not.

Sum-binary Tree is a Binary Tree where the value of a every node is equal to sum of the nodes present in its left subtree and right subtree.

An empty tree is Sum-binary Tree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree.

Return 1 if it sum-binary tree else return 0.



Problem Constraints
1 <= length of the array <= 100000

0 <= node values <= 50



Input Format
The only argument given is the root node of tree A.



Output Format
Return 1 if it is sum-binary tree else return 0.



Example Input
Input 1:

       26
     /    \
    10     3
   /  \     \
  4   6      3
Input 2:

       26
     /    \
    10     3
   /  \     \
  4   6      4


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 All leaf nodes are considered as SumTree.
 Value of Node 10 = 4 + 6.
 Value of Node 3 = 0 + 3
 Value of Node 26 = 20 + 6
Explanation 2:

 Sum of left subtree and right subtree is 27 which is not equal to the value of root node which is 26.



*/

/*A simple solution is to check for every node is their sub-tree sum is equal to value of that node. But it will take O(n2)

An efficient approach is to store sum of subtree at the node, so we don’t need to calculate it again and again.

1) If the node is a leaf node then sum of subtree rooted with this node is equal to value of this node.
2) If the node is not a leaf node then sum of subtree rooted with this node is twice the value of this node (Assuming that the tree rooted with this node is SumTree).

If all nodes are sumTree return 1 else return 0.*/