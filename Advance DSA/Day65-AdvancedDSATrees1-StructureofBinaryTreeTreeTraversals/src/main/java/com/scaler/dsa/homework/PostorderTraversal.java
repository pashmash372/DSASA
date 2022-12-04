package com.scaler.dsa.homework;

import com.scaler.dsa.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class PostorderTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        Stack<TreeNode> stack1, stack2;
        ArrayList<Integer> postorder;
        TreeNode node;
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        postorder = new ArrayList<>();
        if (A == null) return null;
        stack1.push(A);
        while (!stack1.isEmpty()) {
            node = stack1.pop();
            stack2.push(node);
            if (node.left != null) stack1.push(node.left);
            if (node.right != null) stack1.push(node.right);
        }
        while (!stack2.isEmpty()) {
            node = stack2.pop();
            postorder.add(node.val);
        }
        return postorder;
    }
}

/*Q3. Postorder Traversal
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree, return the Postorder traversal of its nodes values.

NOTE: Using recursion is not allowed.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return an integer array denoting the Postorder traversal of the given binary tree.



Example Input
Input 1:

   1
    \
     2
    /
   3
Input 2:

   1
  / \
 6   2
    /
   3


Example Output
Output 1:

 [3, 2, 1]
Output 2:

 [6, 3, 2, 1]


Example Explanation
Explanation 1:

 The Preoder Traversal of the given tree is [3, 2, 1].
Explanation 2:

 The Preoder Traversal of the given tree is [6, 3, 2, 1].
*/

/*Think about using Stack.

Recursive call would look something like this :

  postorderprint(root->left);
  postorderprint(root->right);
  print(root->val);


Instead of calling the functions, can you put the nodes on a stack and process them?
Would the solution be easier to print the reverse of the asked?
*/