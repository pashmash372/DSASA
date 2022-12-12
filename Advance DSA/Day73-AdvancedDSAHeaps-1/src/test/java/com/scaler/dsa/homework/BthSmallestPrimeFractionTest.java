package com.scaler.dsa.homework;

import org.junit.Assert;
import org.junit.Test;

public class BthSmallestPrimeFractionTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 3, 5};
        int B = 3;
        BthSmallestPrimeFraction b = new BthSmallestPrimeFraction();
        int[] ans = b.solve(A, B);
        int[] expected = {2, 5};
        Assert.assertArrayEquals(expected, ans);
    } @Test
    public void solve1() {
        int[] A = {1,7};
        int B = 1;
        BthSmallestPrimeFraction b = new BthSmallestPrimeFraction();
        int[] ans = b.solve(A, B);
        int[] expected = {1,7};
        Assert.assertArrayEquals(expected, ans);
    }
}