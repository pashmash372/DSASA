package com.scaler.homework;

import org.junit.Assert;
import org.junit.Test;

public class ClosestpairfromsortedarraysTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 4, 6, 8};
        int C = 9;
        Closestpairfromsortedarrays c = new Closestpairfromsortedarrays();
        int[] expected = {1, 8};
        int[] ans = c.solve(A, B, C);
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {5, 10, 20};
        int[] B = {1, 2, 30};
        int C = 13;
        Closestpairfromsortedarrays c = new Closestpairfromsortedarrays();
        int[] expected = {10, 2};
        int[] ans = c.solve(A, B, C);
        Assert.assertArrayEquals(expected, ans);
    }
}