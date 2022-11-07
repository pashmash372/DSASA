package com.scaler.assignment;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        int m = A.size(), n = B.size();
        ArrayList<Integer> res = new ArrayList<>();
        if (A == null && B == null) return null;
        if (A == null) {
            for (Integer i : B) {
                res.add(i);
            }
            return res;
        }
        if (B == null) {
            for (Integer i : A) {
                res.add(i);
            }
            return res;
        }
        int i, j, k = 0;
        for (i = 0, j = 0; k < m + n; k++) {
            if (i >= m) res.add(B.get(j++));
            else if (j >= n) res.add(A.get(i++));
            else if (A.get(i) <= B.get(j)) res.add(A.get(i++));
            else res.add(B.get(j++));
        }
        return res;
    }
}


/*Q1. Merge Two Sorted Arrays
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.



Problem Constraints
-1010 <= A[i], B[i] <= 1010



Input Format
First Argument is a 1-D array representing A.

Second Argument is also a 1-D array representing B.



Output Format
Return a 1-D vector which you got after merging A and B.



Example Input
Input 1:

A = [4, 7, 9 ]
B = [2, 11, 19 ]
Input 2:

A = [1]
B = [2]


Example Output
Output 1:

[2, 4, 7, 9, 11, 19]
Output 2:

[1, 2]


Example Explanation
Explanation 1:

Merging A and B produces the output as described above.
Explanation 2:

 Merging A and B produces the output as described above.*/