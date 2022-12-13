package com.scaler.assignment;


public class MatrixMultiplication {
    public int[][] solve(int[][] A, int[][] B) {
        int M = A.length;
        int N = A[0].length;
        int P = B[0].length;

        int[][] C = new int[M+1][P+1];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                C[i][j] = 0;
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                for (int k = 0; k < N; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }
}

/*Q4. Matrix Multiplication
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given two integer matrices A(having M X N size) and B(having N X P). You have to multiply matrix A with B and return the resultant matrix. (i.e. return the matrix AB).

image



Problem Constraints
1 <= M, N, P <= 100

-100 <= A[i][j], B[i][j] <= 100



Input Format
There are 2 lines in the input
First line: Two integers R, C are the number of rows and columns. Then R * C integers follow corresponding to the rowwise numbers in the 2D array.
Second line: Two integer R, C are the number of rows and columns. Then R * C integers follow corresponding to the rowwise numbers in the 2D array.


Output Format
Return a 2D integer matrix denoting AB.



Example Input
Input 1:

2 2 1 2 3 4
2 2 5 6 7 8
Input 2:

1 2 1 1
2 1 2 3


Example Output
Output 1:

 [[19, 22],
  [43, 50]]
Output 2:

 [[5]]


Example Explanation
Explanation 1:

 image
Explanation 2:

 [[1, 1]].[[2, 3]] = [[1 * 2 + 1 * 3]] = [[5]]*/