package com.scaler.dsa.assignement;


public class MaximumSumSquareSubMatrix {
    int maxn = 1009;
    int[][] stripSum = new int[maxn][maxn];

    public void getStripSum(int[][] A, int B) {
        int N = A.length;
        // To store sums of all strips of size B x 1
        for (int i = 0; i < maxn; i++)
            for (int j = 0; j < maxn; j++)
                stripSum[i][j] = 0;

        // Go column by column
        for (int j = 0; j < N; j++) {
            // Calculate sum of first B x 1 rectangle in this column
            int sum = 0;
            for (int i = 0; i < B; i++)
                sum += A[i][j];
            stripSum[0][j] = sum;

            // Calculate sum of remaining rectangles
            for (int i = 1; i < N - B + 1; i++) {
                sum += (A[i + B - 1][j] - A[i - 1][j]);
                stripSum[i][j] = sum;
            }
        }
    }

    public int solve(int[][] A, int B) {
        int N = A.length;
        // B must be smaller than or equal to N
        if (B > N) return 0;

        // 1: PREPROCESSING
        getStripSum(A, B);

        // max_sum stores maximum sum in matrix
        int max_sum = Integer.MIN_VALUE;

        // 2: CALCULATE SUM of Sub-Squares using stripSum[][]
        for (int i = 0; i < N - B + 1; i++) {
            // Calculate sum of first subsquare in this row
            int sum = 0;
            for (int j = 0; j < B; j++)
                sum += stripSum[i][j];

            // Update max_sum
            if (sum > max_sum) {
                max_sum = sum;
            }

            // Calculate sum of remaining squares in current row by removing
            // the leftmost strip of previous sub-square and adding a new strip
            for (int j = 1; j < N - B + 1; j++) {
                sum += (stripSum[i][j + B - 1] - stripSum[i][j - 1]);
                // Update max_sum
                if (sum > max_sum) {
                    max_sum = sum;
                }
            }
        }
        return max_sum;
    }
}

/**/

class MaximumSumSquareSubMatrix1 {
    //calculating sum of submatrix
    public static long calculateSum(long[][] A, int x1, int y1, int x2, int y2) {

        long sum = A[x2][y2];
        if (x1 == 0 && y1 == 0) {
            return sum;
        }
        if (x1 == 0) {
            sum -= A[x2][y1 - 1];
        }
        if (y1 == 0) {
            sum -= A[x1 - 1][y2];
        }
        if (x1 != 0 && y1 != 0) {
            sum = sum - A[x2][y1 - 1] - A[x1 - 1][y2] + A[x1 - 1][y1 - 1];
        }
        return sum;
    }

    //Constructing prefix matrix
    public static long[][] constructPrefMat(int[][] A) {
        long[][] prefMat = new long[A.length][A[0].length];
        //row wise prefix
        for (int i = 0; i < A.length; i++) {
            prefMat[i][0] = A[i][0];
            for (int j = 1; j < A[i].length; j++) {
                prefMat[i][j] = prefMat[i][j - 1] + A[i][j];
            }
        }
        //col wise prefix
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 1; j < A.length; j++) {
                prefMat[j][i] = prefMat[j][i] + prefMat[j - 1][i];
            }
        }
        return prefMat;
    }

    public int solve(int[][] A, int B) {
        //get prefix matrix
        long[][] prefMat = constructPrefMat(A);
        long maxSum = Integer.MIN_VALUE, sum;

        //it means the whole matrix is our answer, as there is no other matrix
        if (A.length == B && A[0].length == B) return (int) calculateSum(prefMat, 0, 0, B - 1, B - 1);

        //get top-right using 2 loops
        //get x1
        for (int x1 = 0; x1 <= A.length - B; x1++) {
            //get y1
            for (int y1 = 0; y1 <= A[0].length - B; y1++) {
                //x2=x1+B-1, y2=y1+B-1
                sum = calculateSum(prefMat, x1, y1, x1 + B - 1, y1 + B - 1);
                maxSum = Math.max(maxSum, sum);

            }
        }

        return (int) maxSum;
    }
}

/**/

class MaximumSumSquareSubMatrix2 {
    public int solve(int[][] A, int B) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (j != 0) {
                    A[i][j] = A[i][j - 1] + A[i][j];
                }
            }
        }
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 1; j < A.length; j++) {
                A[j][i] = A[j - 1][i] + A[j][i];
            }
        }
        for (int i = 0; i <= (A.length - B); i++) {
            for (int j = 0; j <= (A[0].length - B); j++) {
                int a1 = i, b1 = j, a2 = i - 1 + B, b2 = j - 1 + B, sum = 0;
                sum = A[a2][b2];
                if (b1 - 1 >= 0) sum -= A[a2][b1 - 1];
                if (a1 - 1 >= 0) sum -= A[a1 - 1][b2];
                if (a1 - 1 >= 0 && b1 - 1 >= 0) sum += A[a1 - 1][b1 - 1];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}

/*Q3. Maximum Sum Square SubMatrix
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a 2D integer matrix A of size N x N, find a B x B submatrix where B<= N and B>= 1, such that the sum of all the elements in the submatrix is maximum.



Problem Constraints
1 <= N <= 103.

1 <= B <= N

-102 <= A[i][j] <= 102.



Input Format
First arguement is an 2D integer matrix A.

Second argument is an integer B.



Output Format
Return a single integer denoting the maximum sum of submatrix of size B x B.



Example Input
Input 1:

 A = [
        [1, 1, 1, 1, 1]
        [2, 2, 2, 2, 2]
        [3, 8, 6, 7, 3]
        [4, 4, 4, 4, 4]
        [5, 5, 5, 5, 5]
     ]
 B = 3
Input 2:

 A = [
        [2, 2]
        [2, 2]
    ]
 B = 2


Example Output
Output 1:

 48
Output 2:

 8


Example Explanation
Explanation 1:

    Maximum sum 3 x 3 matrix is
    8 6 7
    4 4 4
    5 5 5
    Sum = 48
Explanation 2:

 Maximum sum 2 x 2 matrix is
  2 2
  2 2
  Sum = 8*/

/*Method 1- Brute Force:
A Simple Solution is to consider all possible sub-squares of size B x B in our input matrix and find the one which has the maximum sum.
Time complexity of above solution is O(N2B2).
This will timeout for the given constraints.


Method 2- Efficient Approach:

The idea is to preprocess the given square matrix. In the preprocessing step, calculate the sum of all vertical strips of size B x 1 in a temporary square matrix stripSum[][].
Once we have the sum of all vertical strips, we can calculate the sum of the first sub-square in a row as the sum of the first B strips in that row, and for the remaining sub-squares, we can calculate the sum in O(1) time by removing the leftmost strip of the previous subsquare and adding the rightmost strip of the new square.
Time complexity of this solution is O(N2).*/