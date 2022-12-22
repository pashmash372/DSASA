package com.scaler.dsa.assignment;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SudokuTest {

    @Test
    public void solve() {

        ArrayList<ArrayList<Character>> A = new ArrayList<>();
        List<List<Character>> lists = List.of(List.of('5', '3', '.', '.', '7', '.', '.', '.', '.'), List.of('6', '.', '.', '1', '9', '5', '.', '.', '.'), List.of('.', '9', '8', '.', '.', '.', '.', '6', '.'), List.of('8', '.', '.', '.', '6', '.', '.', '.', '3'), List.of('4', '.', '.', '8', '.', '3', '.', '.', '1'), List.of('7', '.', '.', '.', '2', '.', '.', '.', '6'), List.of('.', '6', '.', '.', '.', '.', '2', '8', '.'), List.of('.', '.', '.', '4', '1', '9', '.', '.', '5'), List.of('.', '.', '.', '.', '8', '.', '.', '7', '9'));

        lists.forEach(list -> {
            ArrayList<Character> temp = new ArrayList<>();
            list.forEach(l -> {
                temp.add(l);
            });
            A.add(temp);
        });
//        System.out.println(A);
        Sudoku s = new Sudoku();
        s.solveSudoku(A);
    }

    @Test
    public void solve1() {
        char[][] A = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        Sudoku1 s = new Sudoku1();
        s.solveSudoku(A);
//        System.out.println(Arrays.deepToString(A));
        /*
        [
            [5, 3, 4, 6, 7, 8, 9, 1, 2],
            [6, 7, 2, 1, 9, 5, 3, 4, 8],
            [1, 9, 8, 3, 4, 2, 5, 6, 7],
            [8, 5, 9, 7, 6, 1, 4, 2, 3],
            [4, 2, 6, 8, 5, 3, 7, 9, 1],
            [7, 1, 3, 9, 2, 4, 8, 5, 6],
            [9, 6, 1, 5, 3, 7, 2, 8, 4],
            [2, 8, 7, 4, 1, 9, 6, 3, 5],
            [3, 4, 5, 2, 8, 6, 1, 7, 9]
         ]
         */
    }
}