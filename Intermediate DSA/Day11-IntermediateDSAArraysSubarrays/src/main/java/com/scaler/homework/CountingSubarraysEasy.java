package com.scaler.homework;


public class CountingSubarraysEasy {
    public int solve(int[] A, int B) {
        int n  = A.length;
        int pref[] = new int[n];
        pref[0]=A[0];
        int ans=0;

        // calculate prefix sum array
        for(int i=1;i<n;i++)pref[i]=pref[i-1]+A[i];


        for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int sum = pref[j];
                if(i>0){ // s is not 0, [s,e]=pf[e]+pf[s-1]
                    sum -= pref[i-1];
                }
                if(sum < B) ans++;
            }
        }
        return ans;
    }
}

/*Q1. Counting Subarrays Easy
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.



Problem Constraints
1 <= N <= 103

1 <= A[i] <= 1000

1 <= B <= 107



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the number of subarrays in A having sum less than B.



Example Input
Input 1:

 A = [2, 5, 6]
 B = 10
Input 2:

 A = [1, 11, 2, 3, 15]
 B = 10


Example Output
Output 1:

 4
Output 2:

 4


Example Explanation
Explanation 1:

 The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},
Explanation 2:

 The subarrays with sum less than B are {1}, {2}, {3} and {2, 3}

*/