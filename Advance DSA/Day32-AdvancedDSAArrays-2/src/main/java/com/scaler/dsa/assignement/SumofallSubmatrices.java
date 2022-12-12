package com.scaler.dsa.assignement;

import java.util.ArrayList;

public class SumofallSubmatrices {
//    Approach 1:

    public class Solution {
        public int solve(ArrayList<ArrayList<Integer>> A) {
            int n = A.size();
            int sum = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    // Number of sub matrices contain A[i][j]
                    int times = (i + 1) * (j + 1) * (n - i) * (n - j);
                    sum += times * A.get(i).get(j);
                }
            }
            return sum;
        }
    }

//    Approach 2: Works only with given contraints

    public class Solution1 {
        public int solve(int[][] A) {
            int n = A.length;
            int sum = 0;
            int preSum[][] = new int[n + 1][n + 1];
            for(int i = 1; i <= n ; i++){
                for(int j = 1; j <= n; j++){
                    preSum[i][j] = A[i - 1][j - 1] + preSum[i - 1][j] + preSum[i][j - 1] - preSum[i - 1][j - 1];
                }
            }
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    for(int k = i; k <= n; k++){
                        for(int l = j; l <= n; l++){
                            sum += preSum[k][l] - preSum[k][j - 1] - preSum[i - 1][l] + preSum[i - 1][j - 1];
                        }
                    }
                }
            }
            return sum;
        }
    }

}
/*Q2. Sum of all Submatrices
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.



Problem Constraints
1 <= N <=30

0 <= A[i][j] <= 10



Input Format
Single argument representing a 2-D array A of size N x N.



Output Format
Return an integer denoting the sum of all possible submatrices in the given matrix.



Example Input
A = [ [1, 1]
      [1, 1] ]


Example Output
16


Example Explanation
Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
Number of submatrices with 3 elements = 0
Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
Total Sum = 4+8+4 = 16*/

/*Let us suppose the index of an element be (X, Y) in 0 based indexing, then the number of submatrices Sub(x,y) for this element
can be given by the formula Sub(x, y) = (X + 1) * (Y + 1) * (N – X) * (N – Y) .
This formula works because we just have to choose two different positions on the matrix that will create a submatrix that
envelopes the element. Thus, for each element, ‘sum’ can be updated as sum += Sub(x,y) * A[x][y].

More Formally,
Number of ways to choose from top-left elements (X + 1) * (Y + 1)
Number of ways to choose from bottom-right elements (N - X) * (N - Y)*/