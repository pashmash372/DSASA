package com.scaler.dsa.homework;


public class VeryLargePower {
    int fast_power(long A, long B, long mod) {
        long ans = 1;
        while(B > 0) {
            if((B & 1) == 1) {
                ans = (ans * A) % mod;
            }
            A = (A % mod * A % mod) % mod;
            B = B >> 1;
        }
        return (int)(ans % mod);
    }

    public int solve(int A, int B) {
        long fact = 1;
        long mod = (long)(1e9 + 7);
        // calculating factorial of B
        for(long i = 2; i <= B; i += 1) {
            fact = (fact * i) % (mod - 1);      // (mod-1) is used accoring to Fermat Little theorem.
        }
        int ans = fast_power(A, fact, mod);     // calculating power by divide and conquer
        return ans;
    }
}
/*Q1. Very Large Power
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two Integers A, B. You have to calculate (A ^ (B!)) % (1e9 + 7).

"^" means power,

"%" means "mod", and

"!" means factorial.



Problem Constraints
1 <= A, B <= 5e5



Input Format
First argument is the integer A

Second argument is the integer B



Output Format
Return one integer, the answer to the problem



Example Input
Input 1:

A = 1
B = 1
Input 2:

A = 2
B = 2


Example Output
Output 1:

1
Output 2:

4


Example Explanation
Explanation 1:

 1! = 1. Hence 1^1 = 1.
Explanation 2:

 2! = 2. Hence 2^2 = 4.
*/

/*This problem is very simple if you know Fermat’s Little Theorem.

The basic approach to solve this problem is to find factorial of B by taking mod with (P-1), where P is a prime. In this problem, 10007 is also a prime.

After calculating the factorial of B, you can calculate A ^ B! by simply taking mod with P.*/