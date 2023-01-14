package com.scaler.dsa.assignment;


import java.util.*;

public class ShortestDistanceinaMaze {
    static int maxn = 100009;
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};

    public static boolean inside(int x, int y, int n, int m) {
        return (x >= 0 && x <= n - 1 && y >= 0 && y <= m - 1);
    }

    public static int findMinDist(int[][] maze, int[] start, int[] destination) {
        int n = maze.length;
        int m = maze[0].length;
        int sx = start[0];
        int sy = start[1];
        int ex = destination[0];
        int ey = destination[1];
        int[][] v = new int[n][m];
        for (int[] row : v)
            Arrays.fill(row, Integer.MAX_VALUE);
        PriorityQueue<Pair1> pq = new PriorityQueue<Pair1>(new CustomComp1());
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
                    if (inside(x2, y2, n, m) && maze[x2][y2] == 0) {
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
        if (v[ex][ey] != Integer.MAX_VALUE) res = v[ex][ey];
        return res;
    }

    public int solve(int[][] A, int[] B, int[] C) {
        return findMinDist(A, B, C);
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

class CustomComp1 implements Comparator<Pair1> {
    @Override
    public int compare(Pair1 aa, Pair1 bb) {
        return aa.a - bb.a;
    }
}


/* Approach 2*/

/**
 * Approach : BFS
 * Algorithm
 * Instead of making use of Depth First Search for exploring the search space, we can make use of Breadth First Search as well.
 * In this, instead of exploring the search space on a depth basis, we traverse the search space(tree) on a level by level basis
 * i.e. we explore all the new positions that can be reached starting from the current position first,
 * before moving onto the next positions that can be reached from these new positions.
 * <p>
 * In order to make a traversal in any direction, we again make use of dirs array as in the DFS approach.
 * Again, whenever we make a traversal in any direction,
 * we keep a track of the number of steps taken while moving in this direction in count variable as done in the last approach.
 * We also make use of distance array initialized with very large values in the beginning.
 * distance[i][j] again represents the minimum number of steps required to reach the position (i,j) from thestart position.
 * <p>
 * This approach differs from the DFS approach only in the way the search space is explored.
 * In order to reach the new positions in a Breadth First Search order, we make use of a queue,
 * which contains the new positions to be explored in the future.
 * We start from the current position (k,l), try to traverse in a particular direction, obtain the corresponding count for that direction,
 * reaching an end position of (i,j) just near the boundary or a wall.
 * If the position (i,j) can be reached in a lesser number of steps from the current route than any other previous route checked,
 * indicated by distance[k][l] + count < distance[i][j], we need to update distance[i][j] as distance[k][l] + count.
 * <p>
 * After this, we add the new position obtained, (i,j) to the back of a queue, so that the various paths possible from
 * this new position will be explored later on when all the directions possible from the current position (k,l) have been explored.
 * After exploring all the directions from the current position,
 * we remove an element from the front of the queue and continue checking the routes possible through all the directions now taking the new position
 * (obtained from the queue) as the current position.
 * Again, the entry in distance array corresponding to the destination,
 * dest’s coordinates gives the required minimum distance to reach the destination.
 * If the destination can’t be reached, the corresponding entry will contain Integer.MAX_VALUE
 * <p>
 * Complexity Analysis
 * Time complexity :O(mnmax(m,n)).
 * Complete traversal of maze will be done in the worst case.
 * Here, m and n refers to the number of rows and columns of the maze.
 * Further, for every current node chosen, we can travel upto a maximum depth of max(m,n) in any direction.
 * Space complexity :O(mn). queue size can grow upto mn in the worst case…
 */
class ShortestDistanceinaMaze1 {
    public int solve(int[][] maze, int[] start, int[] dest) {
        int n = maze.length;
        int m = maze[0].length;

        int[][] dist = new int[n][m];
        for (int[] row : dist) {
            Arrays.fill(row, (int) 1e9);
        }
        dist[start[0]][start[1]] = 1;

        Queue<Tuple> queue = new LinkedList<>();
        queue.offer(new Tuple(0, start[0], start[1]));

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            Tuple tuple = queue.poll();

            for (int ind = 0; ind < 4; ind++) {
                int steps = tuple.dist;
                int row = tuple.row;
                int col = tuple.col;
                int cnt = 0;

                while (row >= 0 && row < n && col >= 0 && col < m && maze[row][col] == 0) {
                    row += dx[ind];
                    col += dy[ind];
                    ++cnt;
                }
                //Roll Back - When the program break from while loop above,
                // it means that x, y has been added dir[0], dir[1] one more time         //and count also has been added 1.
                // But the correct answer (in the range) is less than it, so we           //should minus dir[0], dir[1] and count-- here.

                row -= dx[ind];
                col -= dy[ind];
                cnt--;

                if (steps + cnt < dist[row][col]) {
                    dist[row][col] = steps + cnt;
                    queue.offer(new Tuple(steps + cnt, row, col));
                }
            }
        }
        return dist[dest[0]][dest[1]] == (int) 1e9 ? -1 : dist[dest[0]][dest[1]];
    }
}

class Tuple {
    int dist;
    int row;
    int col;

    public Tuple(int dist, int row, int col) {
        this.dist = dist;
        this.row = row;
        this.col = col;
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