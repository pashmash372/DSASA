package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class PointsonsamelineTest {

    @Test
    public void solve() {
        int[] A = {-1, 0, 1, 2, 3, 3};
        int[] B = {1, 0, 1, 2, 3, 4};
        Pointsonsameline p = new Pointsonsameline();
        int ans = p.solve(A, B);
        int expected = 4;
        Assert.assertEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {3, 1, 4, 5, 7, -9, -8, 6};
        int[] B = {4, -8, -3, -2, -1, 5, 7, -4};
        Pointsonsameline p = new Pointsonsameline();
        int ans = p.solve(A, B);
        int expected = 2;
        Assert.assertEquals(expected, ans);
    }
}