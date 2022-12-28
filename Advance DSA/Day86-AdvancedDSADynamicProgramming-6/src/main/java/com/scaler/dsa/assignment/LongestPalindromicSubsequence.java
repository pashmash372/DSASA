package com.scaler.dsa.assignment;


public class LongestPalindromicSubsequence {
    static int lps(String seq) {
        int n = seq.length();
        int i, j, cl;
        int[][] L = new int[n][n];
        for (i = 0; i < n; i++)
            L[i][i] = 1;
        for (cl = 2; cl <= n; cl++) {
            for (i = 0; i < n - cl + 1; i++) {
                j = i + cl - 1;
                if (seq.charAt(i) == seq.charAt(j) && cl == 2) L[i][j] = 2;
                else if (seq.charAt(i) == seq.charAt(j)) L[i][j] = L[i + 1][j - 1] + 2;
                else L[i][j] = Math.max(L[i][j - 1], L[i + 1][j]);
            }
        }
        return L[0][n - 1];
    }

    public int solve(String A) {
        return lps(A);
    }
}

/* another solution present in lecture notes*/
class LongestPalindromicSubsequence1 {
    static int lps(String S) {
        int N = S.length();
        int[][] dp = new int[N][N];
        for (int i = 0; i < N; i++)
            dp[i][i] = 1;
        for (int l = 2; l <= N; l++) {
            int i = 0, j = l - 1;
            while (j < N) {
                if (S.charAt(i) == S.charAt(j)) dp[i][j] = 2 + dp[i + 1][j - 1];
                else dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                i++;
                j++;
            }
        }
        return dp[0][N - 1];
    }

    public int solve(String A) {
        return lps(A);
    }
}


/*Q1. Longest Palindromic Subsequence
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A. Find the longest palindromic subsequence (A subsequence which does not need to be contiguous and is a palindrome).

You need to return the length of longest palindromic subsequence.



Problem Constraints
1 <= length of(A) <= 103



Input Format
First and only integer is a string A.



Output Format
Return an integer denoting the length of longest palindromic subsequence.



Example Input
Input 1:

 A = "bebeeed"
Input 2:

 A = "aedsead"


Example Output
Output 1:

 4
Output 2:

 5


Example Explanation
Explanation 1:

 The longest palindromic subsequence is "eeee", which has a length of 4.
Explanation 2:

 The longest palindromic subsequence is "aedea", which has a length of 5.
*/

/*First, Create a recurrence relation then we will think of optimizing that.
Let’s say for sequence A[0..n-1] , L(0,n-1) denotes the length of longest palidromic subsequence.
It will be calculated by:
-> If last and first character of the sequence are same, then L(0,n-1) = L(1,n-1) + 2
->Else, L(0,n-1) = max(L(0,n-2),L(1,n-1))

Since we can observe overlapping Subproblems, we will optimize it using a dynamic programming solution.*/