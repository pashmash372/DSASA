package com.scaler.assignment;

public class SquareRootofInteger {
    public int sqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) right = mid - 1;
            else {
                if (mid + 1 > (x / (mid + 1))) return mid;
                left = mid + 1;
            }
        }
    }
}

/*Q1. Square Root of Integer
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer A.

Compute and return the square root of A.

If A is not a perfect square, return floor(sqrt(A)).

DO NOT USE SQRT FUNCTION FROM THE STANDARD LIBRARY.

NOTE: Do not use the sqrt function from the standard library. Users are expected to solve this in O(log(A)) time.



Problem Constraints
0 <= A <= 1010



Input Format
The first and only argument given is the integer A.



Output Format
Return floor(sqrt(A))



Example Input
Input 1:

 11
Input 2:

 9


Example Output
Output 1:

 3
Output 2:

 3


Example Explanation
Explanation:

 When A = 11 , square root of A = 3.316. It is not a perfect square so we return the floor which is 3.
 When A = 9 which is a perfect square of 3, so we return 3.*/


/*Think in terms of binary search.

Let us say S is the answer.

We know that 0 <= S <= x.

Consider any random number r.

If r*r <= x, S >= r , i.e. S would lie towards right of r

If r*r > x, S < r. , i.e. S would lie towards left of r

Maybe try to run a binary search for S.*/