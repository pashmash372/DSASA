package com.scaler.assignment;

public class ImplementPowerFunction {
    static class Solution1 {
        public int pow(int A, int B, int C) {
            long res = 1L;
            long a = A;
            while (B > 0) {
                if ((B % 2) == 1) {
                    res *= a;
                    res %= C;
                }
                a *= a;
                a %= C;
                B = B >> 1;
            }
            res = (res + C) % C;
            return (int) res;
        }
    }

    static class Solution2 {
        public int pow(int A, int B, int C) {
            if (A == 0)
                return 0;
            if (B == 0)
                return 1;
            long ans = pow(A, B / 2, C);
            ans = (ans * ans) % C;
            if (B % 2 == 1)
                ans = (ans * A);
            ans = (ans + C) % C;
            return (int) ans;
        }
    }

}




/*Q3. Implement Power Function
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).

Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.



Problem Constraints
-109 <= A <= 109
0 <= B <= 109
1 <= C <= 109


Input Format
Given three integers A, B, C.


Output Format
Return an integer.


Example Input
A = 2, B = 3, C = 3


Example Output
2


Example Explanation
23 % 3 = 8 % 3 = 2*/