package com.scaler.assignment;

public class Squarerootofanumber {


    public int solve(int A) {
        for (int i = 1; i <= 10000; i++) {
            if (i * i == A) {
                return i;
            }
        }
        return -1;
    }

}
/*Q4. Square root of a number
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given a number A. Return square root of the number if it is perfect square otherwise return -1.

Problem Constraints

1 <= A <= 108
Input Format

First and the only argument is an integer A.
Output Format

Return an integer which is the square root of A if A is perfect square otherwise return -1.
Example Input

Input 1:
A = 4
Input 2:

A = 1001
Example Output

Output 1:
2
Output 2:

-1
Example Explanation

Explanation 1:
sqrt(4) = 2
Explanation 2:

1001 is not a perfect square.*/


/*Calculate the square root of A by raising it to the power of 0.5, pass it through the int() function, and store it in a variable let’s say sqrt.
If sqrt * sqrt == A then return sqrt, else return -1*/