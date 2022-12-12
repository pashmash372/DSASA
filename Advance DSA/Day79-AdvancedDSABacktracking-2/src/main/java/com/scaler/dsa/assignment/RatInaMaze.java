package com.scaler.dsa.assignment;


public class RatInaMaze {
    public int[][] solve(int[][] maze) {
        int N = maze.length;
        int[][] path = new int[N][N];
        solve(maze, path, N, 0, 0);
        return path;
    }

    boolean solve(int[][] maze, int[][] path, int N, int row, int col) {
        if (row == N - 1 && col == N - 1 && maze[row][col] == 1) {
            path[row][col] = 1;
            return true;
        }
        if (row == N || col == N) {
            return false;
        }
        if (maze[row][col] == 1) {
            path[row][col] = 1;
            if (solve(maze, path, N, row, col + 1)) return true;
            if (solve(maze, path, N, row + 1, col)) return true;
            path[row][col] = 0;
        }
        return false;
    }
}


/*Q3. Rat In a Maze
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given a grid A, a rat is at position (1, 1). He wants to go to the position (n, n) where n is size of the square matrix A.

1 represents a traversable cell and 0 represents a non-traversable cell. Rat can only move right or down.

Return a path that the rat can take.



Problem Constraints

1 <= |A| <= 4



Input Format

First and only argument is the vector of vectors A.



Output Format

Return a vector of vectors that denotes a path that can be taken.



Example Input

Input 1:

A = [   [1, 0]
        [1, 1]
    ]
Input 2:

A = [    [1, 1, 1]
         [1, 0, 1]
         [0, 0, 1]
    ]


Example Output

Output 1:

[   [1, 0]
    [1, 1]
]
Output 2:

[    [1, 1, 1]
     [0, 0, 1]
     [0, 0, 1]
]


Example Explanation

Explanation 1:

 Path is shown in output.
Explanation 2:

 Path is shown in output.
*/

/*Create a solution matrix, initially filled with 0’s.
Create a recursive funtion, which takes initial matrix, output matrix and position of rat (i, j).
if the position is out of the matrix or the position is not valid then return.
Mark the position output[i][j] as 1 and check if the current position is destination or not. If destination is reached print the output matrix and return.
Recursively call for position (i+1, j) and (i, j+1).
Unmark position (i, j), i.e output[i][j] = 0.*/