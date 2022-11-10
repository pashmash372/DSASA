package com.scaler.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MatrixSearchTest {

    @Test
    public void searchMatrix() {
        int[][] A = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50},};
        int B = 3;
        MatrixSearch m = new MatrixSearch();
        int ans = m.searchMatrix(A, B);
        int expected = 1;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void searchMatrix1() {
        int[][] A = {
                {5, 17, 100, 111},
                {119, 120, 127, 131},
        };
        int B = 3;
        MatrixSearch m = new MatrixSearch();
        int ans = m.searchMatrix(A, B);
        int expected = 0;
        Assert.assertEquals(expected, ans);
    }
}