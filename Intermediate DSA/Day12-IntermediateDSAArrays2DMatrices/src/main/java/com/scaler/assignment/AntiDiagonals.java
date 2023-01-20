package com.scaler.assignment;


import java.util.ArrayList;

public class AntiDiagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int l = A.size();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 2 * l - 1; ++i) {
            int offset = i < l ? 0 : i - l + 1;
            ArrayList<Integer> row = new ArrayList<Integer>();
            int k = 0;
            for (int j = offset; j <= i - offset; ++j) {
                row.add(A.get(j).get(i - j));
                k++;
            }
            for (int j = k; j < l; j++) {
                row.add(0);
            }
            res.add(row);
        }
        return res;
    }
}

/*Anti Diagonals Java optimized solution and more readable*/
class AntiDiagonals1 {
    public int[][] diagonal(int[][] A) {
        int n = A.length;
        int[][] result = new int[2 * n - 1][n];
        for (int i = 0; i < 2 * n - 1; i++) {
            int row = i < n ? 0 : i - n + 1;
            int col = i < n ? i : n - 1;
            for (int j = 0; j < n && row < n && col >= 0; j++, row++, col--) { // row ++ , col -- ,gets diagonal elements of original array
                result[i][j] = A[row][col];
            }
        }
        return result;
    }
}

/*Q2. Anti Diagonals
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.


Problem Constraints
1<= N <= 1000
1<= A[i][j] <= 1e9


Input Format
Only argument is a 2D array A of size N * N.


Output Format
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.


Example Input
Input 1:
1 2 3
4 5 6
7 8 9
Input 2:

1 2
3 4


Example Output
Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
Output 2:

1 0
2 3
4 0


Example Explanation
For input 1:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
For input 2:

The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].
*/

/*Let’s look at how the coordinates change when you move from one element to the other in the anti-diagonal.
With every movement, the row increases by one, and the column decreases by one ( or in other words, (1, -1) gets added to the current coordinates).
Now, all we need to know is the start ( or the first element ) in each diagonal.
Can you figure out which elements qualify as the first elements in each diagonal?*/