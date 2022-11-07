package com.scaler.homework;

public class FindFactorial {
    private static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public int solve(int A) {
        return fact(A);
    }
}


/*Q3. Find Factorial!
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Write a program to find the factorial of the given number A.



Problem Constraints
0 <= A <= 12



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the factorial of the number A.



Example Input
Input 1:

 A = 4
Input 2:

 A = 1


Example Output
Output 1:

 24
Output 2:

 1


Example Explanation
Explanation 1:

 Factorial of 4 = 4 * 3 * 2 * 1 = 24
Explanation 2:

 Factorial of 1 = 1
*/