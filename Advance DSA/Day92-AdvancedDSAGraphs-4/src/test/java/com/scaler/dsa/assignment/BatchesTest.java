package com.scaler.dsa.assignment;

import org.junit.Test;

public class BatchesTest {

    @Test
    public void solve() {
        int A = 7;
        int[] B = {1, 6, 7, 2, 9, 4, 5};
        int[][] C = {{1, 2}, {2, 3}, {5, 6}, {5, 7}};
        int D = 12;

        Batches b = new Batches();
        int ans = b.solve(A, B, C, D);
        int expected = 2;
    }

    @Test
    public void solve1() {
        int A = 5;
        int[] B = {1, 2, 3, 4, 5};
        int[][] C = {{1, 5}, {2, 3}};
        int D = 6;

        Batches b = new Batches();
        int ans = b.solve(A, B, C, D);
        int expected = 1;
    }
}