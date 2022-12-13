package com.scaler.assignment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class ColumnSumTest {

    @Test
    void solve() {
        ColumnSum c = new ColumnSum();
        int A[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        int[] ans = c.solve(A);
        int[] expected = {15, 10, 13, 16};


        assertTrue(Arrays.equals(expected,ans));


    }


}