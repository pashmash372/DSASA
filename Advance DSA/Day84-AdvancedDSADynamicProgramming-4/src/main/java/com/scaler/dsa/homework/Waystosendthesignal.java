package com.scaler.dsa.homework;


public class Waystosendthesignal {
    public int solve(int A) {
        long mod = 1000000007;
        long[][] dp = new long[2][A + 1];
        dp[0][1] = 1;
        dp[1][1] = 1;
        for (int i = 2; i <= A; i++) {
            dp[0][i] = dp[0][i - 1] + dp[1][i - 1];
            dp[0][i] %= mod;
            dp[1][i] = dp[0][i - 1] % mod;
        }
        long res = (dp[0][A] + dp[1][A]) % mod;
        return (int) res;
    }
}

/*Q3. Ways to send the signal
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are trying to send signals to aliens using a linear array of A laser lights. You don't know much about how the aliens are going to percieve the signals, but what you know is that if two consecutive lights are on then the aliens might take it as a sign of danger and destroy the earth.

Find and return the total number of ways in which you can send a signal without compromising the safty of the earth. Return the ans % 109 + 7.



Problem Constraints

1 <= A <= 105



Input Format

The only argument given is integer A.



Output Format

Return the ans%(109+7).



Example Input

Input 1:

 A = 2
Input 2:

 A = 3


Example Output

Output 1:

 3
Output 2:

 5


Example Explanation

Explanation 1:

 OFF OFF
 OFF ON
 ON OFF
All lights off is also a valid signal which probably means 'bye'

Explanation 2:

 OFF OFF OFF
 OFF OFF ON
 OFF ON OFF
 ON OFF OFF
 ON OFF ON
 */

/*Dp recurrence:-
DP[0][i] = DP[0][i-1] + DP[1][i-1]
DP[1][i] = DP[0][i-1]
DP[0][i] = Count of all possible binary strings of lenght i without having consecutive 1's and ending at 0
DP[1][i] = Count of all possible binary strings of length i without having consecutive 1's and ending at 1*/