package com.scaler.dsa.homework;


public class SmallestXOR {
    public int solve(int A, int B) {
        int x = 0;
        for (int i = 30; i >= 0; i--) {
            if (B == 0) return x;
            if (((1 << i) & A) > 0) {
                x |= (1 << i);
                B--;
            }
        }

        for (int i = 0; i <= 30; i++) {
            if (B == 0) return x;
            if (((1 << i) & x) == 0) {
                x |= (1 << i);
                B--;
            }
        }
        return x;
    }
}

/*Java Solution for Smallest Xor  & SC:(1).| Smallest XOR*/

class SmallestXOR1 {
    public int solve(int A, int B) {
//the smallest Xor is the value where we have B set bits in the position of A from left
        long Ans = 0;
        for (int i = 31; i >= 0; i--) {
            if (((A >> i) & 1) == 1 && B > 0) {
                Ans = Ans + (1L << i);
                B--;
            }
        }
//if A has less set bits than B then all the unset bits in A from right are to be done set.
        if (B > 0) {
            for (int i = 0; i < 32; i++) {
                if (((A >> i) & 1) == 0 && B > 0) {
                    Ans = Ans + (1 << i);
                    B--;
                }
            }
        }
        return (int) Ans;
    }
}
/*Q3. Smallest XOR
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given two integers A and B, find a number X such that A xor X is minimum possible, and the number of set bits in X equals B.



Problem Constraints
0 <= A <= 109
0 <= B <= 30



Input Format
First argument contains a single integer A. Second argument contains a single integer B.



Output Format
Return a single integer X.



Example Input
Input 1:

 A = 3
 B = 3
Input 2:

 A = 15
 B = 2


Example Output
Output 1:

 7
Output 2:

 12


Example Explanation
Explanation 1:

 3 xor 7 = 4 which is minimum
Explanation 2:

 15 xor 12 = 3 which is minimum
*/

/*Let X initially be 0
First try to set those bits which contribute the highest(right side) while count of set bits in X is less than B. Then Set all zero bits from left side.*/