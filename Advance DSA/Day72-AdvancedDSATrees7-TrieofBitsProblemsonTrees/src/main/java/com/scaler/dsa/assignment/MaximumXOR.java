package com.scaler.dsa.assignment;


public class MaximumXOR {
    public static int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        // Constructing the Trie
        for (int num : nums) {
            TrieNode curr = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >>> i) & 1;
                if (bit == 0) {
                    if (curr.left == null) {
                        curr.left = new TrieNode();
                    }
                    curr = curr.left;
                } else {
                    if (curr.right == null) {
                        curr.right = new TrieNode();
                    }
                    curr = curr.right;
                }
            }
        }
        int max = Integer.MIN_VALUE;

        // Query on Trie
        for (int num : nums) {
            TrieNode curr = root;
            int currSum = 0;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >>> i) & 1;
                if (bit == 0) {
                    if (curr.right != null) {
                        currSum += (1 << i);
                        curr = curr.right;
                    } else {
                        curr = curr.left;
                    }
                } else {
                    if (curr.left != null) {
                        currSum += (1 << i);
                        curr = curr.left;
                    } else {
                        curr = curr.right;
                    }
                }
            }
            max = Math.max(currSum, max);
        }
        return max;
    }

    public int solve(int[] A) {
        return findMaximumXOR(A);
    }

    static private class TrieNode {
        TrieNode left = null; // left points to 0
        TrieNode right = null; // right points to 1
    }
}



/*Q1. Maximum XOR
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A, find and return the maximum result of A[i] XOR A[j], where i, j are the indexes of the array.



Problem Constraints
1 <= length of the array <= 100000
0 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return an integer denoting the maximum result of A[i] XOR A[j].



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [5, 17, 100, 11]


Example Output
Output 1:

 7
Output 2:

 117


Example Explanation
Explanation 1:

 Maximum XOR occurs between element of indicies(0-based) 1 and 4 i.e. 2 ^ 5 = 7.
Explanation 2:

 Maximum XOR occurs between element of indicies(0-based) 1 and 2 i.e. 17 ^ 100 = 117.
*/

/*As mentioned in the hints, We will find the maximum XOR of ith element with the previous i-1 elements of the array. Do this for all i 1 to N and update the maximum XOR at eact step.

First build bitwise trie of i-1 elements which means insert the bit representation(from right to left) of all i-1 elements into the trie.

For ex: Given 3 numbers with their bit representation: 6(00110) , 5(00101) and 23(10111) and we need to find the maximum xor of 2(00010) with these numbers.

Insert 6(00110), 5(00101) and (10101).
After inserting, Our trie will look like this. (using only 5 bits for example)

        -1(root)
       /   \
      0     1
     /     /
    0     0
     \     \
      1     1
    /   \    \
   0     1    1
    \   /      \
   (5)1 0(6)      1(23)
We want to find the maximum xor of 2(00010) with the numbers in the trie.
Start traversing in the trie from root, At every node, there can be two possibilites:

1) If the 2(00010) has 1 at that bit, move to the left means towards elements having that bit 0.
2) If the 2(00010) has 0 at that bit, move to the right means towards elements having that bit 1.

Basically move in the direction of opposite bit to set that bit in our answer to one.

Algorithm:

1) Convert numbers into binary form.
2) Add numbers into the trie one by one and compute the maximum XOR of a number to add with all previously inserted. Update maximum XOR at each step.
3) Return the maximum XOR calculated.

At every i we are checking the maximum xor with all elements from 0 to i-1. Time complexity of this step is O(log(max_element in the array)).

We are doing this for every i 1 to N. Overall time complexity is O(Nlog(max_element in the array))*/