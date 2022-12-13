package com.scaler.dsa.homewokr;


public class Maximumpositivity {
    public int[] solve(int[] A) {
        int size = 0, left = 0, right = 0;
        for (int l = -1, r = 0; r < A.length; r++) {
            if (A[r] >= 0) {
                if (size < r - l) {
                    size = r - l;
                    left = l;
                    right = r;
                }
            } else {
                l = r;
            }
        }
        int ans[] = new int[size];
        for (int i = left + 1; i <= right; i++) ans[i - left - 1] = A[i];
        return ans;
    }
}

/*Q1. Maximum positivity
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A, of size N.

Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.

NOTE: It is guaranteed that an answer always exists.



Problem Constraints
1 <= N <= 105

-109 <= A[i] <= 109



Input Format
The first and only argument given is the integer array A.



Output Format
Return maximum size subarray of A having only non-negative elements. If there are more than one such subarrays, return the one having earliest starting index in A.



Example Input
Input 1:

 A = [5, 6, -1, 7, 8]
Input 2:

 A = [1, 2, 3, 4, 5, 6]


Example Output
Output 1:

 [5, 6]
Output 2:

 [1, 2, 3, 4, 5, 6]


Example Explanation
Explanation 1:

 There are two subarrays of size 2 having only non-negative elements.
 1. [5, 6]  starting point  = 0
 2. [7, 8]  starting point  = 3
 As starting point of 1 is smaller, return [5, 6]
Explanation 2:

 There is only one subarray of size 6 having only non-negative elements:
 [1, 2, 3, 4, 5, 6]*/

/*We can solve this problem using a single while loop:-

For all elements in array :-

1.If ith element is negative, we need to ignore it and go on next element

2. If ith element is non-negative, we will start a second while loop from this position until a negative element arrives.
    a.If size of subarray received using this is greater than size of previous such arrays, then update the answer
    b. else ignore it.*/