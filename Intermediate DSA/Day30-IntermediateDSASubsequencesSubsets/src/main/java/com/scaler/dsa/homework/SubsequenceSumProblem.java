package com.scaler.dsa.homework;


public class SubsequenceSumProblem {
    public int subsequenceSum(int[] A, int B, int i){
        if(i==-1){
            if(B==0)return 1;
            else return 0;
        }
        int ans = 0;
        ans |= subsequenceSum(A, B, i-1);
        ans |= subsequenceSum(A, B - A[i], i-1);
        return ans;
    }
    public int solve(int[] A, int B) {
        if(B==0)return 0;
        int n = A.length;
        return subsequenceSum(A, B, n-1);
    }
}

/*Q4. Subsequence-Sum Problem
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given an array of integers of N size.

You have to find that there is any subsequence exists or not whose sum is equal to B.



Problem Constraints

1 <= N <= 20
1 <= A[i] <= 100000
0 <= B <= 1e9


Input Format

First Argument is array of integers A
Second Argument is B



Output Format

Return 1 if any subsequence sum is equal to B otherwise return 0.



Example Input

Input 1:

A=[1,20,13,4,5]
B=18
Input 2:


A=[2,2,2,2]
B=5


Example Output

1
Output 1:


1
Output 2:


0


Example Explanation

Explanation 1:
 There is as subsequence present at indexes 1,3,4 whose sum is 18
Explanation 2:


There is no possible subsequence whose sum is 5
NOTE: Array is considered 1 based indexing for the above explanation.


*/

/*Think using recursion, and make all possible sums as N<=20.
So total possible different sums are only 2^20.
TIME Coplexity: 2^n where n is the size of array.
We can also use an iterative approach to generate all
subsets using bit manipulation.
Approach: For the recursive approach, we will consider two cases.
let right now we are at index i of the given array A.
Now there are two possible cases
Case 1 - We will take the value of A[i] in our sum.
Case 2 - We will ignore the value of A[i].
And we will move on to index i-1.
Base case will be when i == -1.*/


/**/