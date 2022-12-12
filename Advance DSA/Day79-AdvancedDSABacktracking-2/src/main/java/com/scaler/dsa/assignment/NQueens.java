package com.scaler.dsa.assignment;


import java.util.ArrayList;
import java.util.Arrays;

public class NQueens {
    ArrayList<ArrayList<String>> res;
    ArrayList<Integer> mRow;
    ArrayList<Integer> mCol;
    char board[][];
    int N;

    public ArrayList<ArrayList<String>> solveNQueens(int A) {
        res = new ArrayList<>();
        N = A;
        board = new char[N][N];
        mRow = new ArrayList<>();
        mCol = new ArrayList<>();
        for (int i = 0; i < N; i++)
            Arrays.fill(board[i], '.');
        backtrack(0);
        return res;
    }

    public void backtrack(int row) {
        if (row == N) {
            addState();
            return;
        }
        for (int i = 0; i < N; i++) {
            board[row][i] = 'Q';
            mRow.add(row);
            mCol.add(i);
            if (validState()) {
                backtrack(row + 1);
            }
            mRow.remove(mRow.size() - 1);
            mCol.remove(mCol.size() - 1);
            board[row][i] = '.';
        }
    }

    private boolean validState() {
        // check if the current arrangement is valid
        int row, col;
        int nextRow, nextCol;
        for (int i = 0; i < mRow.size(); i++) {
            row = mRow.get(i);
            col = mCol.get(i);
            for (int j = i + 1; j < mRow.size(); j++) {
                nextRow = mRow.get(j);
                nextCol = mCol.get(j);
                if (row == nextRow || col == nextCol)
                    return false;
                if (Math.abs(row - nextRow) == Math.abs(col - nextCol))
                    return false;
            }
        }
        return true;
    }

    private void addState() {
        ArrayList<String> state = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            state.add(new String(board[i]));
        }
        res.add(state);
    }
}
/*Q1. NQueens
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.



Given an integer A, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
The final list should be generated in such a way that the indices of the queens in each list should be in reverse lexicographical order.


Problem Constraints
1 <= A <= 10



Input Format
First argument is an integer n denoting the size of chessboard



Output Format
Return an array consisting of all distinct solutions in which each element is a 2d char array representing a unique solution.



Example Input
Input 1:

A = 4
Input 2:

A = 1


Example Output
Output 1:

[
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]
Output 1:

[
 [Q]
]


Example Explanation
Explanation 1:

There exist only two distinct solutions to the 4-queens puzzle:
Explanation 1:

There exist only one distinct solutions to the 1-queens puzzle:*/

/*Notes :
1) There can exactly be one queen per row. Otherwise the 2 queens in the row would collide. If you miss out on a row, there cannot be N queens on the board.
2) Every column needs to have exactly one queen.
3) The left diagonal cannot have more than one queen ( Unique (row + col) )
4) The right diagonal cannot have more than one queen ( Unique (row - col) )

We can start placing a queen per row. When placing a queen on a row, col, we need to check if the position is available based on what we have already placed. Then we move to the next row.*/