package com.scaler.dsa.homework;


import java.util.Arrays;

public class PalindromePartitioningII {
    private int isPalin[][];
    private int dp[];
    private int N;
    private String A;

    public int minCut(String A) {
        N = A.length();
        isPalin = new int[N][N];
        for (int i = 0; i < N; i++)
            Arrays.fill(isPalin[i], -1);
        this.A = A;
        palindromeDP(0, N - 1);
        dp = new int[N];
        Arrays.fill(dp, -1);
        return minCuts(N - 1) - 1;
    }

    public int minCuts(int index) {
        if (index < 0)
            return 0;
        if (dp[index] != -1)
            return dp[index];
        int minSteps = 99999999;
        for (int i = index; i >= 0; i--) {
            if (isPalin[i][index] == 1) {
                minSteps = Math.min(minSteps, minCuts(i - 1) + 1);
            }
        }
        return dp[index] = minSteps;
    }

    public void palindromeDP(int begin, int end) {
        for (int l = 0; l < N; l++) {
            for (int i = 0; i < N - l; i++) {
                int j = i + l;
                if (i == j) {
                    isPalin[i][j] = 1;
                    continue;
                }
                if (A.charAt(i) == A.charAt(j)) {
                    if (i + 1 <= j - 1)
                        isPalin[i][j] = isPalin[i + 1][j - 1];
                    else
                        isPalin[i][j] = 1;
                } else {
                    isPalin[i][j] = 0;
                }
            }
        }
    }
}
/*Q2. Palindrome Partitioning II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A, partition A such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of A.



Problem Constraints
1 <= length(A) <= 501



Input Format
The first and the only argument contains the string A.



Output Format
Return an integer, representing the minimum cuts needed.



Example Input
Input 1:

 A = "aba"
Input 2:

 A = "aab"


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 "aba" is already a palindrome, so no cuts are needed.
Explanation 2:

 Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.*/

/*Our first task is to find for each (i,j) if the substring from i to j is a palindrome or not.

How can we do this?

If substring from i to j is a palindrome then the following two conditions should satisfy

–> then the substring from i+1 to j-1 should be a palindrome
–> A(i)==A(j) i.e. i’th and j’th character of string A should be equal.

If you observe closely the substring (i,j) might be executed multiple times. Therefore we can use a dp to ensure that we dont compute the same thing again and again.

Lets take an array palin[n][n] where

palin[i][j]=1 if the substring from i to j is 1
palin[i][j]=0 otherwise

What would be our dp state?

palin[i][j]=(palin[i+1][j-1]&(A[i]==A[j]));

initial conditions

palin[i][j]=1

But this only gives tells us whether substring from i to j is a palindrome or not. How do we find the minimum number of partitions?

We use dp.

Lets say dp[i] is the minimum number of partitions for string from 0 to i.

Initial conditions

dp[i]=0 ,if palin[0][i] is 1
dp[i]=INT_MAX ,otherwise

Dp states

dp[j]=min(dp[j],dp[i-1]+1) (where i<=j0 and palin[i][j]=1)*/