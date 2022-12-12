package com.scaler.dsa.assignment;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ShortestDistanceinaMaze {
    static int maxn = 100009;
    static int[] dx = new int[] { -1, 1, 0, 0 };
    static int[] dy = new int[] { 0, 0, -1, 1 };
    public static boolean inside(int x, int y, int n, int m) {
        return (x >= 0 && x <= n - 1 && y >= 0 && y <= m - 1);
    }
    public int solve(int[][] A, int[] B, int[] C) {
        return findMinDist(A, B, C);
    }
    public static int findMinDist(int[][] maze, int[] start, int[] destination) {
        int n = maze.length;
        int m = maze[0].length;
        int sx = start[0];
        int sy = start[1];
        int ex = destination[0];
        int ey = destination[1];
        int[][] v = new int[n][m];
        for (int[] row: v)
            Arrays.fill(row, Integer.MAX_VALUE);
        PriorityQueue< Pair1 > pq = new PriorityQueue < Pair1 > (new CustomComp1());
        int i;
        int d, d1;
        int x, y;
        int x1, y1;
        int x2, y2;
        pq.offer(new Pair1(0, sx, sy));
        while (pq.size() != 0 && v[ex][ey] == Integer.MAX_VALUE) {
            Pair1 temp = pq.poll();
            x = temp.b;
            y = temp.c;
            d = temp.a;
            if (v[x][y] != Integer.MAX_VALUE) {
                continue;
            } else {
                v[x][y] = d;
            }
            for (i = 0; i < 4; ++i) {
                x1 = x;
                y1 = y;
                d1 = 0;
                while (true) {
                    x2 = x1 + dx[i];
                    y2 = y1 + dy[i];
                    if (inside(x2, y2, n, m) == true && maze[x2][y2] == 0) {
                        x1 = x2;
                        y1 = y2;
                        ++d1;
                    } else {
                        break;
                    }
                }
                if (d1 > 0 && v[x1][y1] == Integer.MAX_VALUE) {
                    pq.offer(new Pair1(d + d1, x1, y1));
                }
            }
        }
        int res = -1;
        if (v[ex][ey] != Integer.MAX_VALUE)
            res = v[ex][ey];
        return res;
    }
}
class Pair1 {
    int a, b, c;
    public Pair1(int u, int v, int w) {
        this.a = u;
        this.b = v;
        this.c = w;
    }
}
class CustomComp1 implements Comparator< Pair1 > {
    @Override
    public int compare(Pair1 aa, Pair1 bb) {
        return aa.a - bb.a;
    }
}
/*Q3. Shortest Distance in a Maze
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a matrix of integers A of size N x M describing a maze. The maze consists of empty locations and walls.

1 represents a wall in a matrix and 0 represents an empty location in a wall.

There is a ball trapped in a maze. The ball can go through empty spaces by rolling up, down, left or right, but it won't stop rolling until hitting a wall (maze boundary is also considered as a wall). When the ball stops, it could choose the next direction.

Given two array of integers of size B and C of size 2 denoting the starting and destination position of the ball.

Find the shortest distance for the ball to stop at the destination. The distance is defined by the number of empty spaces traveled by the ball from the starting position (excluded) to the destination (included). If the ball cannot stop at the destination, return -1.



Problem Constraints
2 <= N, M <= 100

0 <= A[i] <= 1

0 <= B[i][0], C[i][0] < N

0 <= B[i][1], C[i][1] < M



Input Format
The first argument given is the integer matrix A.

The second argument given is an array of integer B.

The third argument if an array of integer C.



Output Format
Return a single integer, the minimum distance required to reach destination



Example Input
Input 1:

A = [ [0, 0], [0, 0] ]
B = [0, 0]
C = [0, 1]
Input 2:

A = [ [0, 0], [0, 1] ]
B = [0, 0]
C = [0, 1]


Example Output
Output 1:

 1
Output 2:

 1


Example Explanation
Explanation 1:

 Go directly from start to destination in distance 1.
Explanation 2:

 Go directly from start to destination in distance 1.*/

/*We can definitely say that ball will roll only in one of 4 directions, this gives us only 4 options for each place.
This points towards a BFS based solution. This can be written easily using starting point as source and running bfs until
queue gets empty or we reach our destiniation.*/