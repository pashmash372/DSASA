package com.scaler.dsa.assignment;


import java.util.ArrayList;
import java.util.Arrays;

public class UniquePathsinaGrid {
    private int[][] mem;
    private ArrayList<ArrayList<Integer>> A;

    public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
        int m, n;
        if (A == null) return 0;
        m = A.size();
        if (m == 0) return 0;
        n = A.get(0).size();
        if (n == 0) return 0;
        mem = new int[m][n];
        for (int i = 0; i < m; i++)
            Arrays.fill(mem[i], -1);
        this.A = A;
        if (A.get(0).get(0) == 0) mem[0][0] = 1;
        rec(m - 1, n - 1);
        return mem[m - 1][n - 1];
    }

    public int rec(int i, int j) {
        if (i < 0 || j < 0) return 0;
        if (mem[i][j] != -1) return mem[i][j];
        if (A.get(i).get(j) == 1) return mem[i][j] = 0;
        mem[i][j] = rec(i - 1, j) + rec(i, j - 1);
        return mem[i][j];
    }

}
/*Q2. Unique Paths in a Grid
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a grid of size n * m, lets assume you are starting at (1,1) and your goal is to reach (n, m). At any instance, if you are on (x, y), you can either go to (x, y + 1) or (x + 1, y).

Now consider if some obstacles are added to the grids. How many unique paths would there be? An obstacle and empty space is marked as 1 and 0 respectively in the grid.



Problem Constraints
1 <= n, m <= 100
A[i][j] = 0 or 1



Input Format
Firts and only argument A is a 2D array of size n * m.



Output Format
Return an integer denoting the number of unique paths from (1, 1) to (n, m).



Example Input
Input 1:

 A = [
        [0, 0, 0]
        [0, 1, 0]
        [0, 0, 0]
     ]
Input 2:

 A = [
        [0, 0, 0]
        [1, 1, 1]
        [0, 0, 0]
     ]


Example Output
Output 1:

 2
Output 2:

 0*/

/*Suppose dp[i][j] represents the number of unique paths to reach (i, j).

If you look at a cell, there are atmost 2 ways to reach it. From the cell left and up.

If the cell does not have an obstacle, then the number of ways to reach this cell would be the summation of the number of ways to reach the immediate neighbors preceding it ( left and up ).

So, dp[i][j] = dp[i-1][j] + dp[i][j-1] if (i-1, j) and (i, j-1) doesn’t have obstacles.
= dp[i-1][j] if only (i-1, j) doesn’t have obstacle
= dp[i][j-1] if only (i, j-1) doesn’t have obstacle
= 0 otherwise

dp[n][m] will be our answer.*/