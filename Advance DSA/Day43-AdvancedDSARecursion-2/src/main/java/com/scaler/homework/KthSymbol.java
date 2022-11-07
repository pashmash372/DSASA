package com.scaler.homework;


public class KthSymbol {
    public int solve(int A, int B) {
        return solveQ(A, B) ? 1 : 0;
    }
    static boolean solveQ(int n, int k) {

        if (n == 1 && k == 1)
            return false;

        int mid = (int) Math.pow(2, n - 1) / 2;

        if (k <= mid)
            return solveQ(n - 1, k);
        else
            return !solveQ(n - 1, k - mid);
    }
}


/*Q1. Kth Symbol
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 1-indexed.).



Problem Constraints
1 <= A <= 20

1 <= B <= 2A - 1



Input Format
First argument is an integer A.

Second argument is an integer B.



Output Format
Return an integer denoting the Bth indexed symbol in row A.



Example Input
Input 1:

 A = 2
 B = 1
Input 2:

 A = 2
 B = 2


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 Row 1: 0
 Row 2: 01
Explanation 2:

 Row 1: 0
 Row 2: 01*/