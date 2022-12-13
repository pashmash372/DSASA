package com.scaler.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RangeSumQueryTest {

    @Test
    public void rangeSum() {
//        A = [1, 2, 3, 4, 5]
//        B = [[1, 4], [2, 3]]
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{1, 4}, {2, 3}};
        RangeSumQuery r = new RangeSumQuery();
        long[] ans = r.rangeSum(A, B);
        long[] expected = new long[]{10, 5};


        assertArrayEquals(expected, ans);
    }

    @Test
    public void rangeSum1() {
//        A = [2, 2, 2]
//        B = [[1, 1], [2, 3]]
        int[] A = {2, 2, 2};
        int[][] B = {{1, 1}, {2, 3}};
        RangeSumQuery r = new RangeSumQuery();
        long[] ans = r.rangeSum(A, B);
        long[] expected = new long[]{2, 4};
        assertArrayEquals(expected, ans);
    }
}