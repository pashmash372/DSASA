package com.scaler.assignment;

public class SorttheUnsortedArray {
    public int solve(int[] A) {
        int N = A.length;
        int l = 0, r = N - 1;
        for (l = 0; l < N - 1; l++) {
            if (A[l] > A[l + 1]) break;
        }
        if (l == N - 1) return 0;
        for (r = N - 1; r > 0; r--) {
            if (A[r] < A[r - 1]) break;
        }
        int mx = A[l], mn = A[l];
        for (int i = l + 1; i <= r; i++) {
            if (A[i] > mx) mx = A[i];
            if (A[i] < mn) mn = A[i];
        }
        for (int i = 0; i < l; i++) {
            if (A[i] > mn) {
                l = i;
                break;
            }
        }
        for (int i = N - 1; i >= r + 1; i--) {
            if (A[i] < mx) {
                r = i;
                break;
            }
        }
        return r - l + 1;
    }
}


/*Q4. Sort the Unsorted Array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given an integer array A having N integers.

You have to find the minimum length subarray A[l..r] such that sorting this subarray makes the whole array sorted.



Problem Constraints

1 <= N <= 105

-109 <= A[i] <= 109



Input Format

First and only argument is an integer array A.



Output Format

Return an integer denoting the minimum length.



Example Input

Input 1:

 A = [0, 1, 15, 25, 6, 7, 30, 40, 50]
Input 2:

 A = [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60]


Example Output

Output 1:

 4
Output 2:

 6


Example Explanation

Explanation 1:

 The smallest subarray to be sorted to make the whole array sorted =  A[3..6] i.e, subarray lying between positions 3 and 6.
Explanation 2:

 The smallest subarray to be sorted to make the whole array sorted =  A[4..9] i.e, subarray lying between positions 4 and 9. */