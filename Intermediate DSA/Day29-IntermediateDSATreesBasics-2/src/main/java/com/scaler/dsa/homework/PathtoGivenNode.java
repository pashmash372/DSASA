package com.scaler.dsa.homework;


import java.util.ArrayList;

public class PathtoGivenNode {
    boolean hasPath(TreeNode root, ArrayList<Integer> arr, int x)
    {
        if (root == null)
            return false;

        arr.add(root.val);

        if (root.val == x)
            return true;

        if (hasPath(root.left, arr, x) ||
                hasPath(root.right, arr, x))
            return true;

        arr.remove(arr.size() - 1);
        return false;
    }

    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        hasPath(A, ans, B);
        return ans;
    }
}

/*Q2. Path to Given Node
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a Binary Tree A containing N nodes, you need to find the path from Root to a given node B.

NOTE:

No two nodes in the tree have the same data values.
You can assume that B is present in tree A and a path always exists.


Problem Constraints
1 <= N <= 105

1 <= Data Values of Each Node <= N

1 <= B <= N



Input Format
First Argument represents pointer to the root of binary tree A.

Second Argument is an integer B denoting the node number.



Output Format
Return an one-dimensional array denoting the path from Root to the node B in order.



Example Input
Input 1:

 A =
           1
         /   \
        2     3
       / \   / \
      4   5 6   7

 B = 5
Input 2:

 A =
            1
          /   \
         2     3
        / \ .   \
       4   5 .   6

 B = 1


Example Output
Output 1:

 [1, 2, 5]
Output 2:

 [1]


Example Explanation
Explanation 1:

 We need to find the path from root node to node with data value 5.
 So the path is 1 -> 2 -> 5 so we will return [1, 2, 5]
Explanation 2:

 We need to find the path from root node to node with data value 1.
 As node with data value 1 is the root so there is only one node in the path.
 So we will return [1]
*/

/*Approach: Create a recursive function that traverses the different paths in the binary tree to find the required node x.
If node x is present, then it returns true and accumulates the path nodes in some array arr[]. Else it returns false.

Following are the cases during the traversal:

If root = NULL, return false.
Push the root’s data into arr[].
if root’s data = x, return true.
if node x is present in the root’s left or right subtree, return true.
Else remove root’s data value from arr[] and return false.
This recursive function can be accessed from other functions to check whether node x is present or not, and if it is present, then the path nodes can be accessed from arr[].
You can define arr[] globally or pass its reference to the recursive function.

Time complexity: O(N) in the worst case, where N is the number of nodes in the binary tree.*/