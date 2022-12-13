package com.scaler.assignment;


public class MatrixSubtraction {
    public int[][] solve(int[][] A, int[][] B) {
        int N = A.length;
        int M = A[0].length;

        int[][] C = new int[N][M];
        // Iterating over the rows
        for (int i = 0; i < N;i++){
            // Iterating over the columns
            for (int j = 0; j < M;j++){
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        return C;
    }
}


/*Q5. Matrix Subtraction
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.


Problem Constraints

1 <= N, M <= 103

-109 <= A[i][j], B[i][j] <= 109



Input Format

The first argument is the 2D integer array A
The second argument is the 2D integer array B


Output Format

Return a 2D matrix denoting A - B.



Example Input

Input 1:

A =  [[1, 2, 3],
      [4, 5, 6],
      [7, 8, 9]]

B =  [[9, 8, 7],
      [6, 5, 4],
      [3, 2, 1]]
Input 2:

A = [[1, 1]]

B = [[2, 3]]


Example Output

Output 1:

 [[-8, -6, -4],
  [-2, 0, 2],
  [4, 6, 8]]
Output 2:

 [[-1, -2]]


Example Explanation

Explanation 1:

 image
Explanation 2:

 [[1, 1]] - [[2, 3]] = [[1 - 2, 1 - 3]] = [[-1, -2]]
*/

/*To subtract the two given matrices we have to subtract their corresponding elements. For example, C[i][j] = A[i][j] - B[i][j].
Traverse both matrices row wise(first all elements of a row, then jump to next row) using two nested loops.
For every element A[i][j], subtract it with corresponding element B[i][j] and store the result in difference matrix at C[i][j].
Still unable to solve the problem after this hint?
Get help from TA.*/