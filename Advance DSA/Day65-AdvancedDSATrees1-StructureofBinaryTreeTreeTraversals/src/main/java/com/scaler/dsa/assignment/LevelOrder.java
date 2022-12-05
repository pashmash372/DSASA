package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> level = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (A == null) return null;
        queue.add(A);
        queue.add(null);
        TreeNode node;
        while (!queue.isEmpty()) {
            node = queue.remove();
            if (node == null && queue.isEmpty()) {
                res.add(new ArrayList<>(level));
                break;
            }
            if (node == null) {
                res.add(new ArrayList<>(level));
                level.clear();
                queue.add(null);
                continue;
            }
            level.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return res;
    }
}


/*Q3. Level Order
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return a 2D integer array denoting the zigzag level order traversal of the given binary tree.



Example Input
Input 1:

    3
   / \
  9  20
    /  \
   15   7
Input 2:

   1
  / \
 6   2
    /
   3


Example Output
Output 1:

 [
   [3],
   [9, 20],
   [15, 7]
 ]
Output 2:

 [
   [1]
   [6, 2]
   [3]
 ]


Example Explanation
Explanation 1:

 Return the 2D array. Each row denotes the traversal of each level.
*/

/*There are two ways to solve this problem.

Approach 1: Maintain a vector of size ‘depth’ of the tree. Do any tree traversals keep track of the current depth? Append the current element to vector[currentDepth]. Since we need stuff left to right, make sure the left subtree is visited before the right subtree ( Any traditional pre/post/inorder traversal should suffice ).

Approach 2: This is important. A lot of times, you’d be asked to do a traditional level order traversal. Or, to put informal words, a traversal where the extra memory used should be proportional to the nodes on a level rather than the depth of the tree. To do that, you need to make sure you are accessing all the nodes on a level before accessing the nodes next. This is a typical breadth-first search problem—queue FTW.

*/