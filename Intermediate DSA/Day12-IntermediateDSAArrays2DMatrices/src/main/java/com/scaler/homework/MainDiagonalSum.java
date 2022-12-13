package com.scaler.homework;


public class MainDiagonalSum {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int N = A.length;

        int sum = 0;
        for (int i = 0; i < N;i++){
            // A[i][i] is the main diagonal element
            sum += A[i][i];
        }

        return sum;
    }
}

/*Q6. Main Diagonal Sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.

Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.


Problem Constraints
1 <= N <= 103

-1000 <= A[i][j] <= 1000



Input Format
There are 1 lines in the input. First 2 integers R, C are the number of rows and columns. Then R * C integers follow corresponding to the rowwise numbers in the 2D array A.



Output Format
Return an integer denoting the sum of main diagonal elements.



Example Input
Input 1:

3 3 1 -2 -3 -4 5 -6 -7 -8 9
Input 2:

2 2 3 2 2 3


Example Output
Output 1:

 15
Output 2:

 6


Example Explanation
Explanation 1:

 A[1][1] + A[2][2] + A[3][3] = 1 + 5 + 9 = 15
Explanation 2:

 A[1][1] + A[2][2] = 3 + 3 = 6
*/

/*The matrix given to us is a square matrix
Because of the above fact, we can just loop over all the row indices.
We set the column indices to be equal to the row indices. This gives us the diagonal elements which we can just sum up in a variable.*/