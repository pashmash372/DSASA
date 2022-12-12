package com.scaler.dsa.assignment;

import org.junit.Assert;
import org.junit.Test;

public class RunningMedianTest {

    @Test
    public void solve() {
        int[] A = {1, 2, 5, 4, 3};
        RunningMedian r = new RunningMedian();
        int[] ans = r.solve(A);
        int[] expected = {1, 1, 2, 2, 3};
        Assert.assertArrayEquals(expected, ans);
    }

    @Test
    public void solve1() {
        int[] A = {5, 17, 100, 11};
        RunningMedian r = new RunningMedian();
        int[] ans = r.solve(A);
        int[] expected = {5, 5, 17, 11};
        Assert.assertArrayEquals(expected, ans);
    }
}