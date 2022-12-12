package com.scaler.dsa.assignment;

public class ImplementPowerFunction {
    //    Method 1:
    public class Solution {
        public int pow(int x, int n, int d) {
            long a = x;
            long res = 1L;
            while (n > 0) {
                if (n % 2 == 1) {
                    res *= a;
                    res %= d;
                }
                a *= a;
                a %= d;
                n = n >> 1;
            }
            res = (res + d) % d;
            return (int) res;
        }
    }

    //    Method 2:
    public class Solution1 {
        public int pow(int A, int B, int C) {
            if (A == 0) return 0;
            if (B == 0) return 1;
            long ans = pow(A, B / 2, C);
            ans = (ans * ans) % C;
            if (B % 2 == 1) ans = (ans * A);
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

/*There are two important things to note here:

1) Overflow situation: Note that if x is large enough, multiplying x to the answer might overflow in integer.

2) Multiplying x one by one to the answer is O(n). We are looking for something better than O(n).

If n is even, note the following:

x ^ n = (x * x) ^ n/2

Can you use the above observation to develop a solution better than O(n)?*/