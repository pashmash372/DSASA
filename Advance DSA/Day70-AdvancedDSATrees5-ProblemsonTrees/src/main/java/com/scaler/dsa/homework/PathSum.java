package com.scaler.dsa.homework;

import com.scaler.dsa.common.TreeNode;

public class PathSum {
    public int hasPathSum(TreeNode A, int B) {
        boolean status = sum(A, 0, B);
        return status ? 1 : 0;
    }

    public boolean sum(TreeNode A, int curSum, int reqSum) {
        if (A == null) {
            return false;
        }
        if (A.left == null && A.right == null) {
            curSum += A.val;
            return curSum == reqSum;
        }
        int sum = curSum + A.val;
        return sum(A.left, sum, reqSum) || sum(A.right, sum, reqSum);
    }

}
/*Simple java Solution*/

class PathSum1 {
    boolean isPossiblePath(TreeNode A, int sum) {
        if (A == null) return false;
        if (sum == A.val && A.left == null && A.right == null) return true;
        return isPossiblePath(A.left, sum - A.val) || isPossiblePath(A.right, sum - A.val);

    }

    public int hasPathSum(TreeNode A, int B) {
        if (isPossiblePath(A, B)) return 1;
        return 0;
    }
}

/*Q2. Path Sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.



Problem Constraints
1 <= number of nodes <= 105

-100000 <= B, value of nodes <= 100000



Input Format
First argument is a root node of the binary tree, A.

Second argument is an integer B denoting the sum.



Output Format
Return 1, if there exist root-to-leaf path such that adding up all the values along the path equals the given sum. Else, return 0.



Example Input
Input 1:

 Tree:    5
         / \
        4   8
       /   / \
      11  13  4
     /  \      \
    7    2      1

 B = 22
Input 2:

 Tree:    5
         / \
        4   8
       /   / \
     -11 -13  4

 B = -1


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 There exist a root-to-leaf path 5 -> 4 -> 11 -> 2 which has sum 22. So, return 1.
Explanation 2:

 There is no path which has sum -1.



*/


/*Recursion might make this problem much easier to solve.
You just need to keep a track of the sum from the root to the current node.
Then it becomes a question of just checking if the current node is a leaf node, and if so, do the sum match.

*/