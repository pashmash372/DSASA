package com.scaler.dsa.homework;


import java.util.Arrays;

public class InterleavingStrings {

    int nA, nB, nC;
    private int[][] mem;
    private String A, B, C;

    public int isInterleave(String A, String B, String C) {

        if (A == null || B == null || C == null) return 0;

        nA = A.length();
        nB = B.length();
        nC = C.length();

        if (nA + nB != nC) // length not same
            return 0;

        mem = new int[nA + 1][nB + 1];

        for (int i = 0; i <= nA; i++)
            Arrays.fill(mem[i], -1);

        this.A = A;
        this.B = B;
        this.C = C;

        return rec(0, 0);

    }

    public int rec(int nA, int nB) {

        if (nA + nB == nC) return 1;

        if (mem[nA][nB] != -1) return mem[nA][nB];

        char a = nA < this.nA ? A.charAt(nA) : '~'; // this.nA  -> global nA
        char b = nB < this.nB ? B.charAt(nB) : '~'; // this.nB  -> global nB
        char c = C.charAt(nA + nB);

        int status = 0;

        if (a == c) {
            status |= rec(nA + 1, nB);
        }

        if (b == c) {
            status |= rec(nA, nB + 1);
        }

        return mem[nA][nB] = status;

    }

}

/* solution TC(N*M) SC(N*M)*/

class InterleavingStrings1 {
    public int isInterleave(String A, String B, String C) {
        int m = A.length();
        int n = B.length();
        int z = C.length();
        int l = m + 1;
        int k = n + 1;
        int[][] dp = new int[l][k];

        if ((m + n) != z) return 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) dp[i][j] = 1;

                else if (i == 0 && B.charAt(j - 1) == C.charAt(j - 1)) dp[i][j] = dp[i][j - 1];
                else if (i == 0 && B.charAt(j - 1) != C.charAt(j - 1)) dp[i][j] = 0;


                else if (j == 0 && A.charAt(i - 1) == C.charAt(i - 1)) dp[i][j] = dp[i - 1][j];
                else if (j == 0 && A.charAt(i - 1) != C.charAt(i - 1)) dp[i][j] = 0;

                else if (A.charAt(i - 1) == C.charAt(i + j - 1) && B.charAt(j - 1) != C.charAt(i + j - 1))
                    dp[i][j] = dp[i - 1][j];
                else if (B.charAt(j - 1) == C.charAt(i + j - 1) && A.charAt(i - 1) != C.charAt(i + j - 1))
                    dp[i][j] = dp[i][j - 1];
                else if (B.charAt(j - 1) == C.charAt(i + j - 1) && A.charAt(i - 1) == C.charAt(i + j - 1))
                    dp[i][j] = dp[i - 1][j] | dp[i][j - 1];

            }
        }
        return dp[m][n];
    }

}

/*Q1. Interleaving Strings
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given A, B, C find whether C is formed by the interleaving of A and B.



Problem Constraints
1 <= length(A), length(B) <= 100

1 <= length(C) <= 200



Input Format
The first argument of input contains a string, A.
The second argument of input contains a string, B.
The third argument of input contains a string, C.



Output Format
Return 1 if string C is formed by interleaving of A and B else 0.



Example Input
Input 1:

 A = "aabcc"
 B = "dbbca"
 C = "aadbbcbcac"
Input 2:

 A = "aabcc"
 B = "dbbca"
 C = "aadbbbaccc"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 "aa" (from A) + "dbbc" (from B) + "bc" (from A) + "a" (from B) + "c" (from A)
Explanation 2:

 It is not possible to get C by interleaving A and B.
*/

/*Lets again look at the bruteforce solution for this question.
Given the string A, B, C, the first character of C has to match with either the first character of A or B. If it matches with first character of A, we try to see if solution is possible with remaining part of A, all of B, and remaining part of C. Then we do the same thing for B.

The pseudocode might look something like this :

    bool isInterleave(int index1, int index2, int index3) {
                    // HANDLE BASE CASES HERE

        bool answer = false;
        if (index1 < A.length() && A[index1] == C[index3]) answer |= isInterleave(index1 + 1, index2, index3 + 1);
        if (index2 < B.length() && B[index2] == C[index3]) answer |= isInterleave(index1, index2 + 1, index3 + 1);

        return answer;
    }
Again, index1, index2, and index3 can only take A.length(), B.length() and C.length() possibilities respectively. Can you think of a memoization solution using the observation ?

BONUS: Can you eliminate one of the state i.e. come up with something having only two arguments.*/