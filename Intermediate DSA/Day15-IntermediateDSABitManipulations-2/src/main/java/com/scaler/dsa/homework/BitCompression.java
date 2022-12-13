package com.scaler.dsa.homework;



public class BitCompression {
    public int compressBits(int[] A) {
        int ans = 0;
        for(int i = 0;i < A.length; i++){
            ans ^= A[i];
        }
        return ans;
    }
}


/*Q3. Bit Compression
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Richard Hendricks, a mastermind in compression algorithms, is an employee of Hooli in Silicon Valley.
One day, he finally decided to quit and work on his new idea of the middle-out compression algorithm.

He needed to work at the bit - level to compress data. He, eventually, encountered this problem.
There is an array A of N integers. He has to perform certain operations on the elements.
In any one operation, two indices i and j (i < j) are chosen, and A[i] is replaced with A[i] & A[j],
and A[j] is replaced with A[i] | A[j], where & represents the Bitwise AND operation and | represents the Bitwise OR operation.
This operation is performed over all the pairs of integers in the array.

Help Richard find the Bitwise XOR of all the elements after performing the operations.



Problem Constraints
1 <= N <= 105
1 <= Ai <= 109


Input Format
The first argument is the integer array A.


Output Format
Return a single integer denoting the XOR of the elements after performing the operations.


Example Input
Input 1:
A = [1, 3, 5]
Input 2:

A = [1, 1, 1]


Example Output
Output 1:
7
Output 2:

1


Example Explanation
Explanation 1:
After performing the operations, the array becomes [1, 1, 7].
The XOR of all the elements of this array is 7.
There can be other possible arrays, but we can prove that the XOR will always be 7.
Explanation 2:

Since all the elements are equal.
Even after applying the operations in any order, the array will be [1, 1, 1].
The XOR of all the elements of this array is 1.*/

/*The XOR of all the numbers is preserved even after performing all the operations.
A[i] ^ A[j] = (A[i] & A[j]) ^ (A[i] | A[j])

We can prove this using the truth table of two binary digits.
So, the answer is equal to the XOR of all original array elements.*/