package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MaximumXORSubarrayTest {

    @Test
    public void solve() {
        int[] A = {1, 4, 3};
        MaximumXORSubarray m = new MaximumXORSubarray();
        int[] ans = m.solve(A);
        int[] expected = {2, 3};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {8};
        MaximumXORSubarray m = new MaximumXORSubarray();
        int[] ans = m.solve(A);
        int[] expected = {1, 1};
        Assert.assertArrayEquals(expected, ans);
    }
}