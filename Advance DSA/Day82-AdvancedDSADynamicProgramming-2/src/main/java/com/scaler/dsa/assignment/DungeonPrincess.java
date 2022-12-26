package com.scaler.dsa.assignment;


import java.util.ArrayList;
import java.util.Arrays;

public class DungeonPrincess {
    int[][] dp;
    ArrayList<ArrayList<Integer>> A;
    int m, n;

    public int calculateMinimumHP(ArrayList<ArrayList<Integer>> A) {
        if (A == null) return 0;
        m = A.size();
        n = A.get(0).size();
        dp = new int[m][n];
        this.A = A;
        for (int i = 0; i < m; i++)
            Arrays.fill(dp[i], -1);
        rec(0, 0);
        if (dp[0][0] <= 0) return 1;
        return dp[0][0];
    }

    public int rec(int row, int col) {
        if (row == m - 1 && col == n - 1) {
            int num = A.get(row).get(col);
            if (num < 0) return 1 - num;
            else return 1;
        }
        if (dp[row][col] != -1) return dp[row][col];
        int max = Integer.MAX_VALUE;
        int num = A.get(row).get(col);
        if (isValid(row + 1, col)) {
            max = rec(row + 1, col);
            max -= num;
            max = Math.max(1, max);
        }
        if (isValid(row, col + 1)) {
            int temp = rec(row, col + 1);
            temp -= num;
            temp = Math.max(1, temp);
            max = Math.min(temp, max);
        }
        return dp[row][col] = max;
    }

    public boolean isValid(int row, int col) {
        return row >= 0 && row < m && col >= 0 && col < n;
    }
}

/* Another Solution*/

class DungeonPrincess1 {
    public int calculateMinimumHP(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[][] dp = new int[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
        }
        return minH(0, 0, dp, A, N, M);
    }

    public int minH(int i, int j, int[][] dp, int[][] mat, int N, int M) {
        if (i >= N || j >= M) {
            return Integer.MAX_VALUE;
        }
        if (i == N - 1 && j == M - 1) {
            return Math.max(1, 1 - mat[i][j]);
        }
        if (dp[i][j] == -1) {
            int a = minH(i + 1, j, dp, mat, N, M);
            int b = minH(i, j + 1, dp, mat, N, M);
            dp[i][j] = Math.max(1, Math.min(a, b) - mat[i][j]);
        }
        return dp[i][j];
    }
}

/* Easy solution similiar to lecture solutions*/
class DungeonPrincess2 {

    public int calculateMinimumHP(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] dpArray = new int[rows + 1][cols + 1];
        for (int[] m : dpArray) {
            Arrays.fill(m, Integer.MAX_VALUE);
        }
        //  init values positions after princess cell
        dpArray[rows][cols - 1] = 1; //below cell from last cell  (BR cell)
        dpArray[rows - 1][cols] = 1; // right cell from last cell  (BR cell)

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                dpArray[i][j] = Math.max(1, Math.min(dpArray[i + 1][j], dpArray[i][j + 1]) - A[i][j]);
            }
        }
        return dpArray[0][0];
    }
}


/*Q1. Dungeon Princess
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
The demons had captured the princess and imprisoned her in the bottom-right corner of a dungeon. The dungeon consists of M x N rooms laid out in a 2D grid. Our valiant knight was initially positioned in the top-left room and must fight his way through the dungeon to rescue the princess.

The knight has an initial health point represented by a positive integer. If at any point his health point drops to 0 or below, he dies immediately.

Some of the rooms are guarded by demons, so the knight loses health (negative integers) upon entering these rooms; other rooms are either empty (0's) or contain magic orbs that increase the knight's health (positive integers).

In order to reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.

Given a 2D array of integers A of size M x N. Find and return the knight's minimum initial health so that he is able to rescue the princess.



Problem Constraints
1 <= M, N <= 500

-100 <= A[i] <= 100



Input Format
First and only argument is a 2D integer array A denoting the grid of size M x N.



Output Format
Return an integer denoting the knight's minimum initial health so that he is able to rescue the princess.



Example Input
Input 1:

 A = [
       [-2, -3, 3],
       [-5, -10, 1],
       [10, 30, -5]
     ]
Input 2:

 A = [
       [1, -1, 0],
       [-1, 1, -1],
       [1, 0, -1]
     ]


Example Output
Output 1:

 7
Output 2:

 1


Example Explanation
Explanation 1:

 Initially knight is at A[0][0].
 If he takes the path RIGHT -> RIGHT -> DOWN -> DOWN, the minimum health required will be 7.
 At (0,0) he looses 2 health, so health becomes 5.
 At (0,1) he looses 3 health, so health becomes 2.
 At (0,2) he gains 3 health, so health becomes 5.
 At (1,2) he gains 1 health, so health becomes 6.
 At (2,2) he looses 5 health, so health becomes 1.
 At any point, the health point doesn't drop to 0 or below. So he can rescue the princess with minimum health 7.

Explanation 2:

 Take the path DOWN -> DOWN ->RIGHT -> RIGHT, the minimum health required will be 1.
*/

/*There are only 2 positions you can directly go to from i, j. (i+1, j) and (i, j + 1).

So if you knew the optimal path requirements for (i + 1, j) and (i, j + 1), you could choose the minimum of the two and be done with it.

Build the dp array, start from the bottom right cornor , let’s say hp[i][j] represents the min health point needed at position (i, j).

So, hp[i][j] = max(1, min(hp[i][j+1], hp[i+1][j]) - dungeaon[i][j])

The final answer value is stored at hp[0][0].*/