package com.scaler.dsa.assignment;


import java.util.Arrays;

public class ComputenCrm {
    public int solve(int A, int B, int C) {
        // dp[n][r] stores the value of nCr
        int[][] dp = new int[A + 1][B + 1];
        for(int i = 0; i <= A; i++) {
            for(int j = 0; j <= Math.min(i, B); j++) {
                if(j == i || j == 0) {
                    dp[i][j] = 1;
                } else {
                    // nCr = (n - 1)C(r - 1) + (n - 1)Cr
                    dp[i][j] = (dp[i - 1][j - 1] % C + dp[i - 1][j] % C) % C;
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[A][B] % C;

    }
}

/*
      // We know that ncr = n-1cr-1 + n-1cr
        // eg 4c2 = 3c1 + 3c2
        // Approach 1
        // Calculating factorial here will be a costly operation so we need to devise something extra
        // nc0 = 1
        // 0cr = 0
        // we need to use recursion to avoid calculating factorial

        // Appraoch 2
        // Now ncr = n!/(n-r!*r!) so we need to use inverse modulo here we have (n^-1)%p = (n^(p-2))%p Fermet's Algorithm if p is prime
        // We need to use fastpower method(binary expansion)
        // This will not work for non prime p

        // Approach 3
        // We can use Pascal's Triangle approach(dynamic programming) which is based on same principle as approach 1 but instead of calculating recursively
        // we are using matrix to calculate
* */

/*Q1. Compute nCr % m
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given three integers A, B, and C, where A represents n, B represents r, and C represents m, find and return the value of nCr % m where nCr % m = (n!/((n-r)!*r!))% m.

x! means factorial of x i.e. x! = 1 * 2 * 3... * x.



Problem Constraints
1 <= A * B <= 106

1 <= B <= A

1 <= C <= 106



Input Format
The first argument given is integer A ( = n).
The second argument given is integer B ( = r).
The third argument given is integer C ( = m).


Output Format
Return the value of nCr % m.



Example Input
Input 1:

 A = 5
 B = 2
 C = 13
Input 2:

 A = 6
 B = 2
 C = 13


Example Output
Output 1:

 10
Output 2:

 2


Example Explanation
Explanation 1:

 The value of 5C2 % 11 is 10.
Explanation 2:

 The value of 6C2 % 13 is 2.

*/

/*Suppose we calculate nCr by calculating the factorial of each number and then doing n! / (r! * (n-r)!) % m. This will not work as the factorial can be very large and will cause overflow.

As we know nCr = n-1Cr-1 + n-1Cr.

So we will use the Dynamic Programming approach and calculate the value of nCr.*/