package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class MatrixMedianTest {
    @Test
    public void findMedian() {
        int[][] A = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        MatrixMedian m = new MatrixMedian();
        int ans = m.findMedian(A);
        int expected = 5;
        Assert.assertEquals(expected, ans);
    }
}