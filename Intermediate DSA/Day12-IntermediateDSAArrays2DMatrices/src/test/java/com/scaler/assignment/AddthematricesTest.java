package com.scaler.assignment;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AddthematricesTest {

    @Test
    void solve() {
//        A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
//        B = [[9, 8, 7],[6, 5, 4],[3, 2, 1]]

        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B[][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int expected[][] = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};

        Addthematrices a = new Addthematrices();
        int[][] ans = a.solve(A, B);

        assertTrue(Arrays.deepEquals(expected,ans));
    }
}