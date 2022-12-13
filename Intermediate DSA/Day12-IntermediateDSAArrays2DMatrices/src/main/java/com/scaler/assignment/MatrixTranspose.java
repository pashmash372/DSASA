package com.scaler.assignment;



public class MatrixTranspose {
    public int[][] solve(int[][] A) {
        int row = A.length, col = A[0].length;
        int[][] ans = new int[col][row];
        // Iterating over the columns
        for(int i = 0; i < col; i++){
            // Iterating over the rows
            for(int j = 0; j < row; j++)
                ans[i][j] =  A[j][i];

        }
        return ans;
    }
}

/*Q6. Matrix Transpose
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

You are given a matrix A, you have to return another matrix which is the transpose of A.

NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row. The tranpose of a matrix switches the element at (i, j)th index to (j, i)th index, and the element at (j, i)th index to (i, j)th index.


Problem Constraints

1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000



Input Format

First argument is a 2D matrix of integers.



Output Format

You have to return the Transpose of this 2D matrix.



Example Input

Input 1:

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
Input 2:

A = [[1, 2],[1, 2],[1, 2]]


Example Output

Output 1:

[[1, 4, 7], [2, 5, 8], [3, 6, 9]]
Output 2:

[[1, 1, 1], [2, 2, 2]]


Example Explanation

Explanation 1:

Cearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].*/

/*The (i, j)th element in the input array (where i is the row and j is the column) is going to be at (j, i) in the answer matrix.
Initialize an answer list.
Run a inner loop from j = 1 to j = N, and append A[j][i] to temp,
Now append temp to the answer list.
If the size of the input matrix is (N x M), then the answer matrix will have a size of (M x N).
Return the updated answer matrix.*/