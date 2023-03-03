package com.scaler.dsa.homework;

import com.scaler.dsa.common.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class TwoSumBST {
    public int t2Sum(TreeNode A, int B) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode current1 = A;
        TreeNode current2 = A;
        while (((stack1.size() > 0) || current1 != null) || (stack2.size() > 0) || current2 != null) {
            if (current1 != null || current2 != null) {
                if (current1 != null) {
                    stack1.push(current1);
                    current1 = current1.left;
                }
                if (current2 != null) {
                    stack2.push(current2);
                    current2 = current2.right;
                }
            } else {
                if (stack1.size() == 0 || stack2.size() == 0) break;
                TreeNode node1 = stack1.peek();
                TreeNode node2 = stack2.peek();

                int sum = node1.val + node2.val;
                if (node1.val == node2.val) return 0;
                else if (sum == B) return 1;
                else if (sum < B) {
                    stack1.pop();
                    current1 = node1.right;
                } else {
                    stack2.pop();
                    current2 = node2.left;
                }
            }
        }
        return 0;
    }
}
/*Intuitive Easy approach | Traversal | Two pointers*/

/*Steps:

        1. Find the Inorder of BST. This will give sorted array(ascending order).
        2. Simply apply two-pointer approach, starting with, start pointer as 0 and end pointer as N-1,

        TC - O(N) | SC - O(N).

        Code:*/
class TwoSumBST1 {
    private ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode curr = A;

        while (curr != null || stack.size() != 0) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        return result;
    }

    public int t2Sum(TreeNode A, int B) {
        ArrayList<Integer> inOrder = inorderTraversal(A);       //sorted array
        int i = 0, j = inOrder.size() - 1;
        while (i < j) {
            if (inOrder.get(i) + inOrder.get(j) == B) return 1;
            else if (inOrder.get(i) + inOrder.get(j) < B) i++;
            else j--;
        }
        return 0;
    }
}



/*Q3. Two Sum BST
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary search tree A, where each node contains a positive integer, and an integer B, you have to find whether or not there exist two different nodes X and Y such that X.value + Y.value = B.

Return 1 to denote that two such nodes exist. Return 0, otherwise.



Problem Constraints
1 <= size of tree <= 100000

1 <= B <= 109



Input Format
First argument is the head of the tree A.

Second argument is the integer B.



Output Format
Return 1 if such a pair can be found, 0 otherwise.



Example Input
Input 1:

         10
         / \
        9   20

B = 19
Input 2:


          10
         / \
        9   20

B = 40


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 10 + 9 = 19. Hence 1 is returned.
Explanation 2:

 No such pair exists.

*/


/*How would you solve with O(N) memory? Let’s say you are given a sorted array and you need to find two indices i < j, such that A[i] = A[j]. Can you relate between a sorted array and a BST? Can you avoid O(N) memory and do with O(height) memory?

If you do inorder traversal of BST you visit elements in increasing order. So, we use a two pointer approach, where we keep two pointers pt1 and pt2. Initially pt1 is at smallest value and pt2 at largest value.

Then we compare sum = pt1.value + pt2.value. If sum < target, we increase pt1, else we decrease pt2 until we reach target.

Using the same concept used in https://www.interviewbit.com/courses/programming/topics/trees/problems/treeiterator/ we can do this.

*/