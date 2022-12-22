package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NQueensTest {

    @Test
    public void solve() {
        NQueens n = new NQueens();
        int A = 4;
        ArrayList<ArrayList<String>> ans = n.solveNQueens(A);
        /*
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
        */
        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(".Q..", "...Q", "Q...", "..Q.")));
        expected.add(new ArrayList<>(List.of("..Q.", "Q...", "...Q", ".Q..")));
        Assert.assertEquals(expected, ans);
    } @Test
    public void solve1() {
        NQueens1 n = new NQueens1();
        int A = 4;
        ArrayList<ArrayList<String>> ans = n.solveNQueens(A);
        /*
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
        */
        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(".Q..", "...Q", "Q...", "..Q.")));
        expected.add(new ArrayList<>(List.of("..Q.", "Q...", "...Q", ".Q..")));
        Assert.assertEquals(expected, ans);
    }

}