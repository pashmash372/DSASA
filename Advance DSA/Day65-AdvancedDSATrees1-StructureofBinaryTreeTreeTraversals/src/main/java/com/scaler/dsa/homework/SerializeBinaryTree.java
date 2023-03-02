package com.scaler.dsa.homework;

import com.scaler.dsa.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeBinaryTree {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while (q.size() != 0) { //  q.isEmpty()
            TreeNode cur = q.peek();
            q.remove();
            if (cur == null) {
                ans.add(-1);
                continue;
            }
            ans.add(cur.val);
            q.add(cur.left);
            q.add(cur.right);
        }
        return ans;
    }
}

/*Q4. Serialize Binary Tree
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given the root node of a Binary Tree denoted by A. You have to Serialize the given Binary Tree in the described format.

Serialize means encode it into a integer array denoting the Level Order Traversal of the given Binary Tree.

NOTE:

In the array, the NULL/None child is denoted by -1.
For more clarification check the Example Input.


Problem Constraints
1 <= number of nodes <= 105



Input Format
Only argument is a A denoting the root node of a Binary Tree.



Output Format
Return an integer array denoting the Level Order Traversal of the given Binary Tree.



Example Input
Input 1:

           1
         /   \
        2     3
       / \
      4   5
Input 2:

            1
          /   \
         2     3
        / \     \
       4   5     6


Example Output
Output 1:

 [1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1]
Output 2:

 [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1]


Example Explanation
Explanation 1:

 The Level Order Traversal of the given tree will be [1, 2, 3, 4, 5 , -1, -1, -1, -1, -1, -1].
 Since 3, 4 and 5 each has both NULL child we had represented that using -1.
Explanation 2:

 The Level Order Traversal of the given tree will be [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1].
 Since 3 has left child as NULL while 4 and 5 each has both NULL child.

*/

/*We can do this simply by using a queue data structure.

We know that the root node will always be the first element of level order traversal.
Create a root node and push the root node into the queue.

Now, run a loop until the queue is empty and keep a variable, let’s say i, for denoting the current index in the Level Order Traversal.

Pop the Node: If the node is not NULL, then the element at index i will be the left child, and the element at i+1 will be the right child.
Create those children and push the left child and right child of the node, respectively, in the queue.

After building the tree, return the root node.

*/