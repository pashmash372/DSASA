package com.scaler.dsa.assignement;


public class SubmatrixSumQueries {
    final int mod = 1000000007;
    public long[][] prefixMatrixSum(int[][] A){
        int n = A.length, m = A[0].length;
        long preSum[][] = new long[n + 1][m + 1];
        // preSum[i][j] denotes the sum of elements of matirx (0, 0) to (i, j)
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= m; j++){
                preSum[i][j] = (A[i - 1][j - 1] + preSum[i - 1][j] + preSum[i][j - 1] - preSum[i - 1][j - 1] + mod) % mod;
            }
        }
        return preSum;
    }
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int sum = 0;
        long preSum[][] = prefixMatrixSum(A);
        int res[] = new int[B.length];
        for(int i = 0; i < B.length; i++){
            int x1 = B[i], y1 = C[i], x2 = D[i], y2 = E[i];
            long ans = preSum[x2][y2] - preSum[x2][y1 - 1] - preSum[x1 - 1][y2] + preSum[x1 - 1][y1 - 1];
            while(ans < 0) // handling negative ans
                ans += mod;
            ans = ans % mod;
            res[i] = (int)ans;
        }
        return res;
    }
}
/*
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.

Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.

NOTE:

Rows are numbered from top to bottom, and columns are numbered from left to right.
Sum may be large, so return the answer mod 109 + 7.


Problem Constraints
1 <= N, M <= 1000
-100000 <= A[i] <= 100000
1 <= Q <= 100000
1 <= B[i] <= D[i] <= N
1 <= C[i] <= E[i] <= M



Input Format
The first argument given is the integer matrix A.
The second argument given is the integer array B.
The third argument given is the integer array C.
The fourth argument given is the integer array D.
The fifth argument given is the integer array E.
(B[i], C[i]) represents the top left corner of the i'th query.
(D[i], E[i]) represents the bottom right corner of the i'th query.



Output Format
Return an integer array containing the submatrix sum for each query.



Example Input
Input 1:

 A = [   [1, 2, 3]
         [4, 5, 6]
         [7, 8, 9]   ]
 B = [1, 2]
 C = [1, 2]
 D = [2, 3]
 E = [2, 3]
Input 2:

 A = [   [5, 17, 100, 11]
         [0, 0,  2,   8]    ]
 B = [1, 1]
 C = [1, 4]
 D = [2, 2]
 E = [2, 4]


Example Output
Output 1:

 [12, 28]
Output 2:

 [22, 19]


Example Explanation
Explanation 1:

 For query 1: Submatrix contains elements: 1, 2, 4 and 5. So, their sum is 12.
 For query 2: Submatrix contains elements: 5, 6, 8 and 9. So, their sum is 28.
Explanation 2:

 For query 1: Submatrix contains elements: 5, 17, 0 and 0. So, their sum is 22.
 For query 2: Submatrix contains elements: 11 and 8. So, their sum is 19.
 */

/*The idea is to first create an auxiliary matrix arr[N+1][M+1] such that arr[i][j] stores sum of elements in submatrix from (0,0) to (i,j).
Once arr[][] is constructed, we can compute sum of submatrix between (x1, y1) and (x2, y2) in O(1) time.
We need to consider arr[x2][y2] and subtract all unnecessary elements.
Below is the complete expression to compute the submatrix sum in O(1) time.

Sum between (x1, y1) and (x2, y2) is,
arr[x2][y2] - arr[x2][y1-1] - arr[x1-1][y2] + arr[x1-1][y1-1]

The submatrix aux[x1-1][x2-1] is added because elements of it are subtracted twice.
Remember to return the ans%1000000007*/