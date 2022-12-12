package com.scaler.dsa.homework;


public class Rowwithmaximumnumberofones {
    public int solve(int[][] A) {
        int n = A.length;
        int ans = 0, i, j;
        for (i = 0, j = n - 1; i < n && j >= 0; i++){
            while(A[i][j] == 1 && j >= 0){
                ans = i;
                j--;
            }
        }
        return ans;
    }
}
/*Q4. Row with maximum number of ones
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.

NOTE:

If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows).


Problem Constraints

1 <= N <= 1000

0 <= A[i] <= 1



Input Format

The only argument given is the integer matrix A.



Output Format

Return the row with the maximum number of 1.



Example Input

Input 1:

 A = [   [0, 1, 1]
         [0, 0, 1]
         [0, 1, 1]   ]
Input 2:

 A = [   [0, 0, 0, 0]
         [0, 1, 1, 1]    ]


Example Output

Output 1:

 0
Output 2:

 1


Example Explanation

Explanation 1:

 Row 0 has maximum number of 1s.
Explanation 2:

 Row 1 has maximum number of 1s.

*/

/*We will start iterating from the top-right of the matrix.
We check for all rows from top to bottom and store the maximum
answer so far.
For every row, we only search from the left of the index of maximum answer so far.

Time Complexity : O(M + N)
Space Complexity : O(1)*/