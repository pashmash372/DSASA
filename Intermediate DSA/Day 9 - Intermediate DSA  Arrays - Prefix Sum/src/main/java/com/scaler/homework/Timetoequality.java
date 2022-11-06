package com.scaler.homework;

public class Timetoequality {
    public int solve(int[] A) {
        int n=A.length;
        int val=0;
        for(int i=0;i<n;i++)
        {
            val=Math.max(val,A[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=val-A[i];
        }
        return ans;
    }
}


/*Q1. Time to equality
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.


Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000


Input Format
First argument is an integer array A.


Output Format
Return an integer denoting the minimum time to make all elements equal.


Example Input
A = [2, 4, 1, 3, 2]


Example Output
8


Example Explanation
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.



See Expected Output*/