package com.scaler.dsa.homework;


public class Anothersequenceproblem {
    public int solve(int A) {
        return compute_term(A);
    }
    public static int compute_term(int n) {
        if (n == 2)
            return n;
        if (n == 1 || n == 0)
            return 1;
        return compute_term(n - 1) + compute_term(n - 2) + compute_term(n - 3) + n;
    }
}
/*Q5. Another sequence problem
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a sequence f(A) = f(A-1) + f(A-2) + f(A-3) + A . Calculate the Ath term of the sequence.

Given f(0)=1; f(1)=1; f(2)=2;



Problem Constraints
0<=n<=20



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the Ath term of the sequence.



Example Input
Input 1:

 3
Input 2:

 2


Example Output
Output 1:

 7
Output 2:

 2


Example Explanation
Explanation 1:

 f(3) = 2+1+1+3 = 7
Explanation 2:

 f(2) = 2 as given.
*/

/*Use recursion to apply the formula. Do not forget to add base cases or else you might run into an infinite loop.
One can also use Dynamic Programming to do this task. Although for the given constraints, this is not required.*/