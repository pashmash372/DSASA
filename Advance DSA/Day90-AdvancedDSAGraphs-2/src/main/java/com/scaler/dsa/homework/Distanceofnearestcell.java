package com.scaler.dsa.homework;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Distanceofnearestcell {
    static int inf = 99999999;
    static int[] dxx = new int[]{0, 1, 0, -1};
    static int[] dyy = new int[]{1, 0, -1, 0};

    public static int[][] solveIt(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        Queue<Pair> q = new ArrayDeque<Pair>();
        int[][] distance = new int[n][m];
        for (int[] row : distance) {
            Arrays.fill(row, inf);
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (A[i][j] == 1) {
                    distance[i][j] = 0;
                    q.offer(new Pair(i, j));
                }
            }
        }
        int x, y;
        while (q.size() > 0) {
            Pair p = q.poll();
            x = p.ff;
            y = p.ss;
            int dx, dy;
            for (int k = 0; k < 4; ++k) {
                dx = x + dxx[k];
                dy = y + dyy[k];
                if (dx >= 0 && dx < n && dy >= 0 && dy < m && distance[dx][dy] > distance[x][y] + 1) {
                    distance[dx][dy] = distance[x][y] + 1;
                    q.offer(new Pair(dx, dy));
                }
            }
        }
        return distance;
    }

    public int[][] solve(int[][] A) {
        return solveIt(A);
    }
}

class Pair {
    int ff;
    int ss;

    public Pair(int a, int b) {
        this.ff = a;
        this.ss = b;
    }
}

/*Q2. Distance of nearest cell
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a matrix of integers A of size N x M consisting of 0 or 1.

For each cell of the matrix find the distance of nearest 1 in the matrix.

Distance between two cells (x1, y1) and (x2, y2) is defined as |x1 - x2| + |y1 - y2|.

Find and return a matrix B of size N x M which defines for each cell in A distance of nearest 1 in the matrix A.

NOTE: There is atleast one 1 is present in the matrix.



Problem Constraints
1 <= N, M <= 1000

0 <= A[i][j] <= 1



Input Format
The first argument given is the integer matrix A.



Output Format
Return the matrix B.



Example Input
Input 1:

 A = [
       [0, 0, 0, 1]
       [0, 0, 1, 1]
       [0, 1, 1, 0]
     ]
Input 2:

 A = [
       [1, 0, 0]
       [0, 0, 0]
       [0, 0, 0]
     ]


Example Output
Output 1:

 [
   [3, 2, 1, 0]
   [2, 1, 0, 0]
   [1, 0, 0, 1]
 ]
Output 2:

 [
   [0, 1, 2]
   [1, 2, 3]
   [2, 3, 4]
 ]


Example Explanation
Explanation 1:

 A[0][0], A[0][1], A[0][2] will be nearest to A[0][3].
 A[1][0], A[1][1] will be nearest to A[1][2].
 A[2][0] will be nearest to A[2][1] and A[2][3] will be nearest to A[2][2].
Explanation 2:

 There is only a single 1. Fill the distance from that 1.

*/

/*The idea is to use multi-source BFS. At the begining insert all the nodes having value 1 in the queue.

We first explore immediate adjacent of all 1’s, then adjacent of adjacent, and so on.

Only if the distance at the cell of matrix is greater than the current distance, then only we update the distance of the cell.

Therefore we find minimum distance.

Time Complexity: O( N x M)

*/