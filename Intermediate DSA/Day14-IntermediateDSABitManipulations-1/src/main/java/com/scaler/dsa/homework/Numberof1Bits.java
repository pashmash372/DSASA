package com.scaler.dsa.homework;


public class Numberof1Bits {
    public int numSetBits(long A) {
        int total_ones = 0;
        while (A != 0) {
            // rightmost set bit becomes unset
            A = A & (A - 1);
            total_ones++;
        }
        return total_ones;
    }
}

/*Java Solution with TC & SC - O(1)*/

class Numberof1Bits1 {
    public int numSetBits(int A) {
        int countSetBit = 0;
        for (int i = 0; i < 32; i++) {
            if (((A >> i) & 1) == 1) countSetBit++;
        }
        return countSetBit;
    }
}

/*Q1. Number of 1 Bits
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Write a function that takes an integer and returns the number of 1 bits it has.


Problem Constraints
1 <= A <= 109


Input Format
First and only argument contains integer A


Output Format
Return an integer as the answer


Example Input
Input 1:
11
Input 2:
6


Example Output
Output 1:
3
Output 2:
2


Example Explanation
Explaination 1:
11 is represented as 1011 in binary.
Explaination 2:
6 is represented as 110 in binary.*/

/*Bruteforce:
Iterate 32 times, each time determining if the ith bit is a ’1′ or not.
This is probably the easiest solution, and the interviewer would probably not be too happy about it.
This solution is also machine dependent (You need to be sure that an unsigned integer is 32-bit).
In addition, this solution is not very efficient too because you need to iterate 32 times no matter what.

A better solution:
This special solution uses a trick which is normally used in bit manipulations.
Notice what x - 1 does to bit representation of x.
x - 1 would find the first set bit from the end, and then set it to 0, and set all the bits following it.

Which means if x = 10101001010100
                              ^
                              |
                              |
                              |

                       First set bit from the end
Then x - 1 becomes 10101001010(011)

All other bits in x - 1 remain unaffected.
This means that if we do (x & (x - 1)), it would just unset the last set bit in x (which is why x&(x-1) is 0 for powers of 2).

Can you use the above fact to come up with a solution ?*/