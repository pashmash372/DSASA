package com.scaler.dsa.homework;


import java.util.Arrays;

public class MinimumFallingPathSumII {
    public int solve(int[][] A) {
        int[][] dp = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) { /* row wise array filling with infinity number*/
            Arrays.fill(dp[i], 1000000000);
        }
        return paths(A, 0, 0, dp);
    }

    public int paths(int[][] A, int r, int prevInd, int[][] dp) {
        if (r >= A.length) { /* out of rows */
            return 0;
        }

        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < A[r].length; i++) {  /* traversing a current row element column wise */
            if (r == 0 || i != prevInd) { /* i!=prevInd because to avoid same column of the current row with previous row*/
                if (dp[r][i] != 1000000000) { /*dp[r][i] already calculated */
                    sum = Math.min(sum, dp[r][i]);
                } else {
                    int s = A[r][i] + paths(A, r + 1, i, dp);
                    dp[r][i] = s;
                    sum = Math.min(sum, s);
                }
            }
        }
        return sum;
    }
}

/*Q3. Minimum Falling Path Sum II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given a square grid of integers A, a falling path with non-zero shifts is a choice of exactly one element from each row of A, such that no two elements chosen in adjacent rows are in the same column.

Return the minimum sum of a falling path with non-zero shifts.



Problem Constraints

1 <= |A| == |A[i]| <= 200
-99 <= A[i][j] <= 99



Input Format

First argument is a 2D array of integers.



Output Format

Return an integer denoting the minimum sum.



Example Input

Input 1:

 A =  [ [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9] ]
Input 2:

 A =  [ [17, 14, 19],
        [12, 18, 9],
        [20, 10, 1] ]


Example Output

Output 1:

 13
Output 2:

 27


Example Explanation

Explanation 1:

 The possible falling paths are:
 [1,5,9], [1,5,7], [1,6,7], [1,6,8],
 [2,4,8], [2,4,9], [2,6,7], [2,6,8],
 [3,4,8], [3,4,9], [3,5,7], [3,5,9]
 The falling path with the smallest sum is [1,5,7], so the answer is 13.
Explanation 2:

 The possible falling paths are:
 The falling path with the smallest sum is [14,12,1], so the answer is 27.*/

/*This problem has an optimal substructure, meaning that the solutions to sub-problems can be used to solve larger instances of this.

Let dp[i][j] denotes the minimum sum to reach ith row and jth column from the first row.

dp[i][j] = A[i][j] + min( dp[i-1][k] for all k != j)

We can use the above equetion to fill the dp states.
so, our answer = min(dp[N-1][j] for all j) will be the minimum sum of a falling path with the given condition.*/

/*
int Solution::solve(vector<vector<int> > &A) {
    int n=A.size();
    int dp[n][n];
    int pre[n],suf[n];
    for(int i=0;i<n;i++){
        dp[0][i]=A[0][i];
        pre[i]=min(dp[0][i],(i?pre[i-1]:1000000000));
    }
    for(int i=n-1;i>=0;i--)
        suf[i]=min(dp[0][i],(i+1<n?suf[i+1]:1000000000));
    for(int i=1;i<n;i++){
        for(int j=0;j<n;j++)
            dp[i][j]=min((j?pre[j-1]:1000000000),(j+1<n?suf[j+1]:1000000000))+A[i][j];
        for(int j=0;j<n;j++)
            pre[j]=min(dp[i][j],(j?pre[j-1]:1000000000));
        for(int j=n-1;j>=0;j--)
            suf[j]=min(dp[i][j],(j+1<n?suf[j+1]:1000000000));
    }
    int ans=1e9;
    for(int i=0;i<n;i++)
        ans=min(ans,dp[n-1][i]);
    return ans;
}

*/