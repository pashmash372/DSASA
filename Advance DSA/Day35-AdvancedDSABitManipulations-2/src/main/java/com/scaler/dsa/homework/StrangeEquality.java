package com.scaler.dsa.homework;


public class StrangeEquality {
    public int solve(int A) {
        int bit = 0, x = 0;
        // x is equal to the summation of unset bits in A
        while (A != 0) {
            if (A % 2 == 0) {
                x = x | (1 << bit);
            }
            A /= 2;
            bit++;
        }
        // y equals the power of 2 just greater than A
        int y = (1 << bit);
        return x ^ y;
    }
}
/*Java - O(1) - commented and explained solution*/

class StrangeEquality1 {
    public static void main(String[] args) {
        StrangeEquality1 s = new StrangeEquality1();
        int A = 16;
        System.out.println(s.solve(A));
    }

    public boolean checkBit(int A, int i) {
        return (A & (1 << i)) != 0;
    }

    public int solve(int A) {
        int n1 = 0;
        int n2 = 0;
        //the formula which guides this questions is A+B = A^B + 2*(A&B).
        //if A+B = A^B, then 2*(A&B) = 0 or A & B =0

        //for greatest smaller number

        //idea is to find the countOfBits and then make the exact reverse of the number so that
        // the bitwise And gives 0.
        // for example if A=5 (in bits 101), the greatest smaller number to give bitwise and as zero is 010.
        int lastOneBit = 0;
        for (int i = 0; i < 32; i++) {
            if (checkBit(A, i)) {
                lastOneBit = i;
            }
        }
        int lastBit = (A & (A - 1)) ;
        int countOfBits = lastOneBit + 1;

        for (int i = 0; i < countOfBits; i++) {
            if (!checkBit(A, i)) {
                n1 = n1 + (1 << i);
            }
        }

        //for smallest greater number
        // the smallest number greater than number to give an bitwise and as zero is 2^countOfBits.
        // for example if A=5 (in bits 101), the smallest greater number to give bitwise and as zero is 1000.
        n2 = (1 << countOfBits);

        return n1 ^ n2;
    }
}
/*Q1. Strange Equality
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer A.
Two numbers, X and Y, are defined as follows:

X is the greatest number smaller than A such that the XOR sum of X and A is the same as the sum of X and A.
Y is the smallest number greater than A, such that the XOR sum of Y and A is the same as the sum of Y and A.
Find and return the XOR of X and Y.

NOTE 1: XOR of X and Y is defined as X ^ Y where '^' is the BITWISE XOR operator.

NOTE 2: Your code will be run against a maximum of 100000 Test Cases.



Problem Constraints
1 <= A <= 109



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the XOR of X and Y.



Example Input
A = 5


Example Output
10


Example Explanation
The value of X will be 2 and the value of Y will be 8. The XOR of 2 and 8 is 10.
*/

/*Following the above equation, if xor sum and the sum of 2 numbers are equal, their bitwise AND should be zero.
Given a number N, how to find a number whose bitwise AND with N is 0?
Keeping in mind the truth table of AND, 1 & 1 = 1 while 1 & 0 = 0, 0 & 1 = 0 and 0 & 0 = 0.
Therefore, in the number X such that X & N is 0, all the set bits of number N must be unset in the number X since 1 & 0 = 0.
The unset bits of N can have any orientation in X, that is, they can either be 0 or be 1.
So to find the smallest number greater than N, the answer is the next power of 2 greater than N. Think why!!
And to find the greatest number smaller than N, set all the unset bits of N to 1.*/