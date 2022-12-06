package com.scaler.dsa.assignment;

import com.scaler.dsa.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class EqualTreePartition {
    public int solve(TreeNode a) {
        Map<Long, Integer> map = new HashMap<>();
        long tot = populate(a, map);
        /* since total sum can also be zero */
        if (tot == 0) return map.getOrDefault(tot, 0) > 1 ? 1 : 0;
        return tot % 2 == 0 && map.containsKey(tot / 2) ? 1 : 0;
    }

    public long populate(TreeNode a, Map<Long, Integer> map) {
        if (a == null) return 0;
        long sum = a.val + populate(a.left, map) + populate(a.right, map);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;
    }
}

/*Q2. Equal Tree Partition
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree A. Check whether it is possible to partition the tree to two trees which have equal sum of values after removing exactly one edge on the original tree.



Problem Constraints
1 <= size of tree <= 100000

0 <= value of node <= 109



Input Format
First and only argument is head of tree A.



Output Format
Return 1 if the tree can be partitioned into two trees of equal sum else return 0.



Example Input
Input 1:


                5
               /  \
              3    7
             / \  / \
            4  6  5  6
Input 2:


                1
               / \
              2   10
                  / \
                 20  2


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 Remove edge between 5(root node) and 7:
        Tree 1 =                                               Tree 2 =
                        5                                                     7
                       /                                                     / \
                      3                                                     5   6
                     / \
                    4   6
        Sum of Tree 1 = Sum of Tree 2 = 18
Explanation 2:

 The given Tree cannot be partitioned.
*/

/*After removing some edge from parent to child,
(where the child cannot be the original root)
the subtree rooted at child must be half the sum of the entire tree.

Let’s record the sum of every subtree. We can do this recursively using depth-first search.
After, we should check that half the sum of the entire tree occurs somewhere in our recording
(and not from the total of the entire tree.)*/