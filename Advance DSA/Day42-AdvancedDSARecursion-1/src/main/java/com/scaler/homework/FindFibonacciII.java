package com.scaler.homework;

public class FindFibonacciII {
    static int solve(int n) {
        if (n <= 1)
            return n;
        return solve(n - 1) + solve(n - 2);
    }

    public int findAthFibonacci(int A) {
        return solve(A);
    }

}


/*Q1. Find Fibonacci - II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
The Fibonacci numbers are the numbers in the following integer sequence.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:

Fn = Fn-1 + Fn-2

Given a number A, find and return the Ath Fibonacci Number.

Given that F0 = 0 and F1 = 1.



Problem Constraints
0 <= A <= 20



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the Ath term of the sequence.



Example Input
Input 1:

 A = 2
Input 2:

 A = 9


Example Output
Output 1:

 1
Output 2:

 34


Example Explanation
Explanation 1:

 f(2) = f(1) + f(0) = 1
Explanation 2:

 f(9) = f(8) + f(7) = 21 + 13  = 34*/