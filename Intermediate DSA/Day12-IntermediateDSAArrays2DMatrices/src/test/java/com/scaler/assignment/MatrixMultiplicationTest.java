package com.scaler.assignment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixMultiplicationTest {

//    not working
    @Test
    void solve() {
        MatrixMultiplication m = new MatrixMultiplication();
        int[][] A = {{2, 2, 1, 2, 3, 4}};
        int[][] B = {{2, 2, 5, 6, 7, 8}};
        int[][] ans = m.solve(A, B);
        int[][] expected = {{19, 22}, {43, 50}};

        assertTrue(Arrays.deepEquals(expected,ans));
    }
}