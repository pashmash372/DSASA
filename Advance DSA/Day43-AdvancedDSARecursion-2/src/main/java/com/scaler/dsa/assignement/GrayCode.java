package com.scaler.dsa.assignement;


import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public ArrayList<Integer> grayCode(int A) {
        int n = 1 << A;
        ArrayList<Integer> result = new ArrayList<>();
        // G[n] = n ^ (n >> 1)
        for (int i = 0; i < n; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }
}

/*Gray Code Based on Mirror Image*/
/*The question has a few criteria which are missing. Here are all the criteria.

        An n-bit gray code sequence is a sequence of 2n integers where:

        Every integer is in the inclusive range [0,2^n - 1],
        The first integer is 0,
        An integer appears no more than once in the sequence,
        The binary representation of every pair of adjacent integers differs by exactly one bit, and
        The binary representation of the first and last integers differs by exactly one bit.
        The graycode for 2 it is:

        0 1 3 2
        If you look closely
        3 2 is just the mirror image of 0 1 with a difference of 2.
        So baiscally
        0 1 mirror image is 1 0
        add 2 to it it becomes 3 2
        So the total graycode becomes
        0 1 3 2
        Just do this recursively.
        Code based on that is below*/
class GrayCode1 {
    private ArrayList<Integer> grayCodeRecursive(int n) {
        if (n == 0) {
            ArrayList<Integer> baseCase = new ArrayList<>();
            baseCase.add(0);
            return baseCase;
        }

        ArrayList<Integer> previous = grayCodeRecursive(n - 1);
        reverseAndIncrement(previous);
        return previous;
    }

    private void reverseAndIncrement(List<Integer> list) {
        int n = list.size();
        int increment = n;
        for (int i = n - 1; i >= 0; i--){
            list.add(increment + list.get(i));
        }
    }
}
/*Q2. Gray Code
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer A representing the total number of bits in the code, print the sequence of gray code.

A gray code sequence must begin with 0.



Problem Constraints
1 <= A <= 16



Input Format
The first argument is an integer A.



Output Format
Return an array of integers representing the gray code sequence.



Example Input
Input 1:

A = 2
Input 1:

A = 1


Example Output
output 1:

[0, 1, 3, 2]
output 2:

[0, 1]


Example Explanation
Explanation 1:

for A = 2 the gray code sequence is:
    00 - 0
    01 - 1
    11 - 3
    10 - 2
So, return [0,1,3,2].
Explanation 1:

for A = 1 the gray code sequence is:
    00 - 0
    01 - 1
So, return [0, 1].

*/
/*Note the following :

Let G(n) represent a gray code of n bits.
Let R(n) denote the reverse of G(n).

Note that we can construct.
G(n+1) as the following :
0G(n)
1R(n)

Where 0G(n) means all elements of G(n) prefixed with 0 bit and 1R(n) means all elements of R(n) prefixed with 1.
Note that the last element of G(n) and the first element of R(n) are the same. So the above sequence is valid.

Example G(2) to G(3) :
0 00
0 01
0 11
0 10
1 10
1 11
1 01
1 00*/